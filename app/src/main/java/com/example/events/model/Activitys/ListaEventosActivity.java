//package com.example.events.model.Activitys;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.ImageButton;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.events.R;
//
//import com.example.events.model.dao.EventoDAO;
//
//
//
//
//public class ListaEventosActivity extends AppCompatActivity {
//
//    RecyclerView listaDePacotes;
//    ImageButton btnVtHome;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_lista_eventos);
//
//        configuraLista();
//
//        btnVtHome = findViewById(R.id.btnVtHome);
//
//        btnVtHome.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                finish();
//            }
//        });
//
//
//    }
//
//    private void configuraLista() {
//        listaDePacotes = findViewById(R.id.lista_eventos_recyclerview);
//
//        List<Evento> eventos = new EventoDAO().lista();
//
//        listaDePacotes.setAdapter(new ListaDeEventosAdapter(this,eventos));
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        listaDePacotes.setLayoutManager(layoutManager);
//    }
//
//}
