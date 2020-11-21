package com.example.events.cod.Activitys;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.events.R;

public class Settings extends AppCompatActivity {

    private ImageButton btnVoltarHome;
    private Switch  btnMEscuro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        btnVoltarHome = findViewById(R.id.btnVoltarHome);
        btnMEscuro = findViewById(R.id.btnMEscuro);

        btnModoEscuro();

        btnVoltarHome();

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