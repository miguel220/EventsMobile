package com.example.events.cod.Activitys;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.events.R;

public class Home extends AppCompatActivity {

    private Animation frombottom;

    private CardView cardEventos, cardPreferencias, cardQrCode, cardSair, cardSobre, cardFecharPrograma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cardsButtons();

        cardSair();

        cardQrCode();

        cardeDePreferencias();

        cardSobre();

        cardFecharPrograma();

        cardButtonEventos();

    }

    private void cardButtonEventos() {
        cardEventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ListaEventosActivity.class));
            }
        });
    }

    private void cardsButtons() {
        cardPreferencias = findViewById(R.id.cardPreferencias);
        cardQrCode = findViewById(R.id.cardQrCode);
        cardSair = findViewById(R.id.cardSair);
        cardEventos = findViewById(R.id.cardEventos);
        cardSobre = findViewById(R.id.cardSobre);
        cardFecharPrograma = findViewById(R.id.cardFecharPrograma);
        frombottom = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.frombottom);
    }

    private void cardSair() {
        cardSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog
                        .Builder(Home.this)
                        .setTitle("Fazendo logout")
                        .setMessage("Tem certeza que quer desconectar-se da conta?")
                        .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finishAndRemoveTask();
                                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                                startActivity(intent);
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

    private void cardSobre() {
        cardSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AboutUs.class);
                startActivity(intent);
            }
        });
    }

    private void cardFecharPrograma() {
        cardFecharPrograma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog
                        .Builder(Home.this)
                        .setTitle("Saindo da aplicação")
                        .setMessage("Tem certeza que quer fechar totalmente a aplicação?")
                        .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finishAndRemoveTask();
                                System.exit(0);
                            }
                        })
                        .setNegativeButton("Não", null)
                        .show();
            }
        });
    }
}