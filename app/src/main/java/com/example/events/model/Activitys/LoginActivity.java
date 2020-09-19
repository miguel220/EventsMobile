package com.example.events.model.Activitys;


import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.events.R;

public class LoginActivity extends AppCompatActivity {

    private Button btnEntrarLogin;
    private EditText edtEmail, edtSenha;

    String email_correto = "miguel@outlook.com";
    String senha_correta = "123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        edtEmail = findViewById(R.id.edtEmail);
        edtSenha = findViewById(R.id.edtSenha);


        btnEntrarLogin = findViewById(R.id.btnEntrarLogin);
        btnEntrarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WelcomeSplash.class);
                startActivity(intent);
            }
        });

        //configuraBotaoEntrar();
    }

    private void configuraBotaoEntrar() {
        btnEntrarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(edtSenha.getText().toString()) || TextUtils.isEmpty(edtEmail.getText().toString())) {
                    Toast.makeText(LoginActivity.this, "Os campos não podem ficar vazios", Toast.LENGTH_LONG).show();
                    edtEmail.setError("Preença o campo");
                    edtSenha.setError("Preença o campo");
                } else if (edtEmail.getText().toString().equals(email_correto)) {
                    if (edtSenha.getText().toString().equals(senha_correta)) {
                        Toast.makeText(LoginActivity.this, "Succeful login", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(getApplicationContext(), Home.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(getApplicationContext(), "Senha incorreta", Toast.LENGTH_LONG).show();
                        edtSenha.setError("Coloque uma senha valida");
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Email/Senha invalidos", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
