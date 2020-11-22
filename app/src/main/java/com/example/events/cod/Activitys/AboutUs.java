package com.example.events.cod.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.events.R;
import com.example.events.cod.Activitys.Home;

public class AboutUs extends AppCompatActivity {

    Button btnVoltarHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        btnVoltarHome = findViewById(R.id.btnVoltarHome);

        btnVoltarHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Home.class);
                startActivity(intent);
            }
        });
    }
}