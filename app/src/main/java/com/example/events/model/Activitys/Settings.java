package com.example.events.model.Activitys;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.events.R;

public class Settings extends AppCompatActivity {

    private ImageButton btnVoltarHome;
    private Switch  btnMEscuro, btnNotificacoes;

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
                if(btnNotificacoes.isChecked()){
                    Toast.makeText(getApplicationContext(), "Em manutenção", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void btnModoEscuro() {
        btnMEscuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnMEscuro.isChecked()){
                    Toast.makeText(getApplicationContext(), "Em manutenção", Toast.LENGTH_SHORT).show();
                }
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