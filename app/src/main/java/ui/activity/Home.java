package ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.GridLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.events.R;

import github.nisrulz.qreader.QREader;

public class Home extends AppCompatActivity {

    private GridLayout myGrid;
    private Animation frombottom;
    private QREader qrEader;
    private CardView cardEnventos, cardPreferencias, cardQrCode, cardSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        cardsButtons();

        cardSair();

        cardQrCode();

        cardeDePreferencias();
    }

    private void cardsButtons() {
        cardPreferencias = findViewById(R.id.cardPreferencias);
        cardQrCode = findViewById(R.id.cardQrCode);
        cardSair = findViewById(R.id.cardSair);
        myGrid = (GridLayout) findViewById(R.id.myGrid);
        frombottom = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.frombottom);
    }

    private void cardSair() {
        cardSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
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