package ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.events.R;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

import github.nisrulz.qreader.QRDataListener;
import github.nisrulz.qreader.QREader;

public class QrCodeActivity extends AppCompatActivity {
    Button btnIrParaDigitarQrCode, btnVoltar;
    private TextView txt_result;
    private SurfaceView surfaceView;
    private QREader qrEader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_code);

        //buttons
        btnIrParaDigitarQrCode = findViewById(R.id.btnIrParaDigitarQrCode);

        // btnValidar = findViewById(R.id.btnValidar);
        //    btnValidar.setOnClickListener(new View.OnClickListener() {
        //        @Override
        //        public void onClick(View v) {
        //            Intent telaValidacao = new Intent(getApplicationContext(), ValidacaoScreenActivity.class);
        //            startActivity(telaValidacao);
        //    }
        //});
        //Request Permission
        //Dexter.withActivity(this)
        //      .withPermission(Manifest.permission.CAMERA)
        //      .withListener(new PermissionListener() {
        //          @Override
        //          public void onPermissionGranted(PermissionGrantedResponse response) {
        //              setupCamera();
        //          }
        //
        //          @Override
        //          public void onPermissionDenied(PermissionDeniedResponse response) {
        //              Toast.makeText(QrCodeActivity.this, "Você precisa permitir o acesso a câmera", Toast.LENGTH_SHORT).show();
        //          }
//
        //                  @Override
        ////          public void onPermissionRationaleShouldBeShown(PermissionRequest permission, PermissionToken token) {

        //        }
        //      }).check();

        btnIrParaDigitarQrCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaDigitarQrCode = new Intent(getApplicationContext(), DigitarQrCode.class);
                startActivity(irParaDigitarQrCode);
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltarParaHome = new Intent(getApplicationContext(), Home.class);
                startActivity(voltarParaHome);
            }
        });

    }

    //private void setupCamera() {
    //    txt_result = findViewById(R.id.code_info);
    //    final ToggleButton btn_on_off = findViewById(R.id.btn_enable_disable);
    //    btn_on_off.setOnClickListener(new View.OnClickListener() {
    //        @Override
    //        public void onClick(View v) {
    //            if (qrEader.isCameraRunning()) {
    //                btn_on_off.setChecked(false);
    //                qrEader.stop();
    //            } else {
    //                btn_on_off.setChecked(true);
    //                qrEader.start();
    //            }
    //        }
    //    });
    //    surfaceView = findViewById(R.id.camera_view);
    //    setupQREader();
    //}

    private void setupQREader() {
        qrEader = new QREader.Builder(this, surfaceView, new QRDataListener() {
            @Override
            public void onDetected(final String data) {
                txt_result.post(new Runnable() {
                    @Override
                    public void run() {
                        txt_result.setText(data);
                    }
                });
            }
        }).facing(QREader.BACK_CAM)
                .enableAutofocus(true)
                .height(surfaceView.getHeight())
                .width(surfaceView.getWidth())
                .build();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Dexter.withActivity(this)
                .withPermission(Manifest.permission.CAMERA)
                .withListener(new PermissionListener() {
                    @Override
                    public void onPermissionGranted(PermissionGrantedResponse response) {
                        if(qrEader !=null)
                            qrEader.initAndStart(surfaceView);
                    }

                    @Override
                    public void onPermissionDenied(PermissionDeniedResponse response) {
                        Toast.makeText(getApplicationContext(), "Você precisa permitir o acesso a câmera", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(PermissionRequest permission, PermissionToken token) {

                    }
                }).check();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Dexter.withActivity(this)
                .withPermission(Manifest.permission.CAMERA)
                .withListener(new PermissionListener() {
                    @Override
                    public void onPermissionGranted(PermissionGrantedResponse response) {
                        if(qrEader !=null)
                            qrEader.releaseAndCleanup();
                    }

                    @Override
                    public void onPermissionDenied(PermissionDeniedResponse response) {
                        Toast.makeText(getApplicationContext(), "Você precisa permitir o acesso a câmera", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(PermissionRequest permission, PermissionToken token) {

                    }
                }).check();

    }
}