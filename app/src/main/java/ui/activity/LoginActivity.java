package ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.events.R;

public class LoginActivity extends AppCompatActivity {

    Button btnVoltar, btnEntrarLogin;
    EditText edtEmail, edtSenha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        btnEntrarLogin =findViewById(R.id.btnEntrarLogin);
        btnVoltar=findViewById(R.id.btnVoltar);
        edtEmail =findViewById(R.id.edtEmail);
        edtSenha=findViewById(R.id.edtSenha);

        btnEntrarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telahome = new Intent(getApplicationContext(), homeEventsActivity.class);
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
