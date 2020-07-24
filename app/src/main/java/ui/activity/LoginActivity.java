package ui.activity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.events.R;

public class LoginActivity extends AppCompatActivity {

    private Button btnVoltar, btnEntrarLogin;
    private EditText edtEmail, edtSenha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        btnEntrarLogin =findViewById(R.id.btnEntrarLogin);
        btnVoltar=findViewById(R.id.btnVoltar);


        inicializacaoDosCampos();

        configuracaoBotaoEntrar();

        configuraBotaoVoltar();
    }

    private void configuraBotaoVoltar() {
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void configuracaoBotaoEntrar() {
        btnEntrarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(LoginActivity.this, homeEventsActivity.class));
            }
        });
    }

    private void inicializacaoDosCampos() {
        edtEmail =findViewById(R.id.edtEmail);
        edtSenha=findViewById(R.id.edtSenha);
    }
}
