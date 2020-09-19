package com.example.events.model.Activitys;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.events.R;

public class Home extends AppCompatActivity {


    private Animation frombottom;

    private CardView cardEventos, cardPreferencias, cardQrCode, cardSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        cardsButtons();

        cardSair();

        cardQrCode();

        cardeDePreferencias();

        cardButtonEventos();


    }

    private void cardButtonEventos() {
        cardEventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Em manutenção", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void cardsButtons() {
        cardPreferencias = findViewById(R.id.cardPreferencias);
        cardQrCode = findViewById(R.id.cardQrCode);
        cardSair = findViewById(R.id.cardSair);
        cardEventos = findViewById(R.id.cardEventos);
        frombottom = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.frombottom);
    }

    private void cardSair() {
        cardSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog
                        .Builder(Home.this)
                        .setTitle("Saindo da aplicação")
                        .setMessage("Tem certeza que quer sair da aplicação?")
                        .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setNegativeButton("Não", null)
                        .show();
            }
        });
    }

    private void cardQrCode() {
        cardQrCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), QrCodeActivity.class));

            }
        });
    }

    private void cardeDePreferencias() {
        cardPreferencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Settings.class);
                startActivity(intent);
            }
        });
    }
}