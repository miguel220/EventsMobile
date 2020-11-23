package com.example.events.cod.Activitys;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.events.R;
import com.example.events.cod.Model.Evento;
import com.example.events.cod.dao.EventoDAO;
import com.example.events.cod.recyclerview.adapter.ListaDeEventosAdapter;
import com.example.events.cod.recyclerview.utils.SpacingItemDecoration;


import java.util.List;

public class ListaEventosActivity extends AppCompatActivity {

    private ImageButton btnVtHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_eventos);

        configuraLista();

        btnVtHome = findViewById(R.id.btnVtHome);

        configButtonVoltar();

    }

    private void configButtonVoltar() {
        btnVtHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void configuraLista() {
        RecyclerView listaDeEventos = findViewById(R.id.lista_eventos_recyclerview);

//        EventoService service = new EventoRetrofit().getEventoService();
//        Call<List<Evento>> call = service.buscaTodos();
//
//        new BaseAsyncTask<>(() -> {
//            try {
//                Response<List<Evento>> resposta = call.execute();
//                List<Evento> eventoNovo = resposta.body();
//                return eventoNovo;
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            return null;
//
//        }, eventoNovo -> {
//
//        })

//        EventsDatabase dao = EventsDatabase.getInstance(this);
//        RoomEventoDAO eventos = dao.getRoomEventoDAO();

        List<Evento> eventos = new EventoDAO().listaEvento();
        listaDeEventos.setHasFixedSize(true);
        listaDeEventos.setAdapter(new ListaDeEventosAdapter(this, eventos));
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        listaDeEventos.setLayoutManager(layoutManager);
        SpacingItemDecoration itemDecoration = new SpacingItemDecoration(10);
        listaDeEventos.addItemDecoration(itemDecoration);
    }

}
