package com.example.events.model.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

import com.example.events.R;

public class Settings extends AppCompatActivity {

    private Button btnVoltarHome, btnMEscuro, btnNotificacoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        btnVoltarHome = findViewById(R.id.btnVoltarHome);
        btnMEscuro = findViewById(R.id.btnMEscuro);
        btnNotificacoes = (Switch) findViewById(R.id.btnNotificacoes);

        btnNotificacao();

        btnModoEscuro();

        btnVoltarHome();

    }

    private void btnNotificacao() {
        btnNotificacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Em manutenção", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void btnModoEscuro() {
        btnMEscuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Em manutenção", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void btnVoltarHome() {
        btnVoltarHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}