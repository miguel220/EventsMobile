package com.example.events;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    Button btnVoltar,btnLogin;
    EditText edtLogin, edtSenha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        btnLogin=findViewById(R.id.btnLogin);
        btnVoltar=findViewById(R.id.btnVoltar);
        edtLogin=findViewById(R.id.edtLogin);
        edtSenha=findViewById(R.id.edtSenha);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telahome = new Intent(getApplicationContext(), homeEvents.class);
                startActivity(telahome);
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
