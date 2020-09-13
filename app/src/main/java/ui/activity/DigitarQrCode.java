package ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.events.R;

public class DigitarQrCode extends AppCompatActivity {

    Button btnConfirmarQrCode, btnVoltarParaQrCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digitar_qr_code);

        btnConfirmarQrCode = findViewById(R.id.btnConfirmarQrCode);
        btnVoltarParaQrCode = findViewById(R.id.btnVoltarParaQrCode);

        btnConfirmarQrCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SucessValidation.class); // fazer método para trocar tela
                startActivity(intent);
            }
        });

        btnVoltarParaQrCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Home.class);
                startActivity(intent);
            }
        });
    }
}