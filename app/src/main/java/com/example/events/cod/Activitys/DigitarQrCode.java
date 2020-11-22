package com.example.events.cod.Activitys;

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

        declaracaoButtons();

        btnValidaQr();


    }

    private void declaracaoButtons() {
        btnConfirmarQrCode = findViewById(R.id.btnConfirmarQrCode);
        btnVoltarParaQrCode = findViewById(R.id.btnVoltarParaQrCode);
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
                Intent intent = new Intent(getApplicationContext(), SucessValidation.class); // fazer método para trocar tela
                startActivity(intent);

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