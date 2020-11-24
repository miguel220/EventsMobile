package com.example.events.cod.Activitys;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.events.R;

public class DigitarQrCode extends AppCompatActivity {

    Button btnConfirmarQrCode, btnVoltarParaQrCode;
    EditText edtQrCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digitar_qr_code);

        declaracaoButtons();

        btnValidaQr();


    }

    private void declaracaoButtons() {
        btnConfirmarQrCode = findViewById(R.id.btnConfirmarQrCode);
        btnVoltarParaQrCode = findViewById(R.id.btnVoltarParaQrCode);
        edtQrCode = findViewById(R.id.edtQrCode);
    }

    @Override
    protected void onResume() {
        super.onResume();
        btnVoltarQr();
    }

    private void btnValidaQr() {
        btnConfirmarQrCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(getApplicationContext(), SucessValidation.class); // fazer método para trocar tela
                //startActivity(intent);
                if(TextUtils.isEmpty(edtQrCode.getText().toString())) {
                    Toast.makeText(getApplicationContext(), "Insira o número do QR Code", Toast.LENGTH_SHORT).show();
                    edtQrCode.setBackgroundResource(R.drawable.error_input_rounded);
                } else if ((edtQrCode.getText().toString())!=""){
                    edtQrCode.setBackgroundResource(R.drawable.input_theme);
                    AlertDialog.Builder builder = new AlertDialog.Builder(DigitarQrCode.this);
                    builder.setTitle("Aviso");
                    builder.setMessage("Não é possível validar a presença a partir deste QR Code.");
                    builder.setPositiveButton("Fechar", null);
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
            }
        });
    }

    private void btnVoltarQr() {
        btnVoltarParaQrCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Home.class));
            }
        });
    }
}