package com.example.events.model.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.events.R;

public class SucessValidation extends AppCompatActivity {

    Button btnLerOutroQr, btnVoltarInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucess_validation);

        btnLerOutroQr = findViewById(R.id.btnLerOutroQr);
        btnVoltarInicio = findViewById(R.id.btnVoltarInicio);


        btnLerOutroQr();

        btnVoltarInicio();

    }

    private void btnVoltarInicio() {
        btnVoltarInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Home.class));
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