package com.example.events.model.Activitys;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.events.R;
import com.example.events.model.Evento;
import com.example.events.model.adpter.ListaEventosAdapter;
import com.example.events.model.dao.EventoDAO;

import java.util.List;

public class ListaEventosActivity extends AppCompatActivity {

    ListView listaDePacotes;
    ImageButton btnVtHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_eventos);

        configuraLista();

        btnVtHome = findViewById(R.id.btnVtHome);

        btnVtHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

    private void configuraLista() {
        listaDePacotes = findViewById(R.id.lista_eventos_listview);

        List<Evento> eventos = new EventoDAO().lista();

        listaDePacotes.setAdapter(new ListaEventosAdapter(eventos, this));
    }

}
