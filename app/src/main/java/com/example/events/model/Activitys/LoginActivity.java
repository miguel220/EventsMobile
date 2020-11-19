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

    String email_correto = "teste_adm@hotmail.com";
    String senha_correta = "testeadm";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtEmail = findViewById(R.id.edtEmail);
        edtSenha = findViewById(R.id.edtSenha);
        btnEntrarLogin = findViewById(R.id.btnEntrarLogin);

        validaLogin();
    }

    private void validaLogin() {
        btnEntrarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(edtSenha.getText().toString()) && TextUtils.isEmpty(edtEmail.getText().toString())) {
                    Toast.makeText(LoginActivity.this, "Preencha os campos", Toast.LENGTH_SHORT).show();
                    edtSenha.setBackgroundResource(R.drawable.error_input);
                    edtEmail.setBackgroundResource(R.drawable.error_input);
                } else if (!(edtEmail.getText().toString().contains("@"))){
                        Toast.makeText(getApplicationContext(), "Não é um email válido", Toast.LENGTH_SHORT).show();
                        edtEmail.setBackgroundResource(R.drawable.error_input);
                } else if (!(edtEmail.getText().toString().toLowerCase().contains(".com"))){
                    Toast.makeText(getApplicationContext(), "Não é um email válido", Toast.LENGTH_SHORT).show();
                    edtEmail.setBackgroundResource(R.drawable.error_input);
                } else if (edtEmail.getText().toString().equalsIgnoreCase(email_correto)) {
                        edtEmail.setBackgroundResource(R.drawable.empty);
                    if (edtSenha.getText().toString().equals(senha_correta)) {
                        startActivity(new Intent(getApplicationContext(), WelcomeSplash.class));
                    } else if (edtSenha.getText().toString()==""){
                        Toast.makeText(getApplicationContext(), "Preencha a senha", Toast.LENGTH_SHORT).show();
                        edtSenha.setBackgroundResource(R.drawable.error_input);
                    } else if ((edtSenha.getText().toString())!=(senha_correta)){
                        Toast.makeText(getApplicationContext(), "Senha incorreta", Toast.LENGTH_SHORT).show();
                        edtSenha.setBackgroundResource(R.drawable.error_input);
                    } else {
                        Toast.makeText(getApplicationContext(), "Confira a senha", Toast.LENGTH_SHORT).show();
                        edtSenha.setBackgroundResource(R.drawable.error_input);
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Email ou senha inválidos", Toast.LENGTH_SHORT).show();
                    edtSenha.setBackgroundResource(R.drawable.error_input);
                    edtEmail.setBackgroundResource(R.drawable.error_input);
                }
            }
        });
    }

}
