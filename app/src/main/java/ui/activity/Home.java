package ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.events.R;

public class Home extends AppCompatActivity {

    ImageButton btnIrParaEventos, btnIrParaQrCode, btnIrParaPreferencias, btnAbrirLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnIrParaEventos = findViewById(R.id.btnIrParaEventos);
        btnIrParaQrCode = findViewById(R.id.btnIrParaQrCode);
        btnIrParaPreferencias = findViewById(R.id.btnIrParaPreferencias);
        btnAbrirLogout = findViewById(R.id.btnAbrirLogout);

        // Criar a classe e activity da lista de eventos
        //btnIrParaEventos.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
        //        Intent intent = new Intent(getApplicationContext(), listaEventos.class);
        //        startActivity(intent);
        //    }
        //});

        btnIrParaQrCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), QrCodeActivity.class);
                startActivity(intent);
            }
        });

        btnIrParaPreferencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Settings.class);
                startActivity(intent);
            }
        });

        btnAbrirLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LogoutPopup.class);
                startActivity(intent);
            }
        });
    }
}