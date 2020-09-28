package com.example.events.model.Activitys;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.events.R;

public class ErrorValidation extends AppCompatActivity {


    Button btnLerOutroQr, btnVoltarInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error_validation);

        btnLerOutroQr = findViewById(R.id.btnLerOutroQr);
        btnVoltarInicio = findViewById(R.id.btnVoltarInicio);

        btnVoltarInicio();

        btnLerOutroQr();
    }

    private void btnVoltarInicio() {
        btnVoltarInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void btnLerOutroQr() {
        btnLerOutroQr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), QrCodeActivity.class));
            }
        });
    }
}