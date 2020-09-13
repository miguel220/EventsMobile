package ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.GridLayout;
import android.widget.ImageButton;

import com.example.events.R;

public class Home extends AppCompatActivity {

    GridLayout myGrid;
    Animation frombottom;
    CardView cardEnventos, cardPreferencias, cardQrCode, cardSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        myGrid = (GridLayout) findViewById(R.id.myGrid);

        frombottom = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.frombottom);

        cardsButtons();

        cardSair();

        cardQrCode();

        cardeDePreferencias();
    }

    private void cardsButtons() {
        cardPreferencias = findViewById(R.id.cardPreferencias);
        cardQrCode = findViewById(R.id.cardQrCode);
        cardSair = findViewById(R.id.cardSair);
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