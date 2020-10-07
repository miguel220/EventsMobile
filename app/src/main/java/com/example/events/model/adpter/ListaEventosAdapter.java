package com.example.events.model.adpter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.EventLog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.events.R;
import com.example.events.model.Evento;

import java.util.List;

public class ListaEventosAdapter extends BaseAdapter {

    public static final String DRAWABLE = "drawable";
    private final List<Evento> eventos;
    private Context context;

    public ListaEventosAdapter(List<Evento> eventos, Context context){
        this.eventos = eventos;
        this.context = context;
    }

    @Override
    public int getCount() {
        return eventos.size();
    }

    @Override
    public Evento getItem(int posicao) {
        return eventos.get(posicao);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int posicao, View view, ViewGroup parent) {
        View viewCriada = LayoutInflater.from(context).inflate(R.layout.item_lista_eventos, parent, false);

        Evento evento = eventos.get(posicao);

        mostraNomeEvento(viewCriada, evento);
        mostraImagem(viewCriada, evento);
        mostraData(viewCriada, R.id.txtDataEvento, evento.getData());
        mostraHora(viewCriada, evento);

        return viewCriada;
    }

    private void mostraHora(View viewCriada, Evento evento) {
        TextView hora = viewCriada.findViewById(R.id.txtHoraEvento);
        hora.setText(evento.getHora());
    }

    private void mostraData(View viewCriada, int p, String data2) {
        TextView data = viewCriada.findViewById(p);
        data.setText(data2);
    }

    private void mostraImagem(View viewCriada, Evento evento) {
        ImageView imagem = viewCriada.findViewById(R.id.imgEventos);
        Drawable drawableImagemEventos = getDrawable(evento);
        imagem.setImageDrawable(drawableImagemEventos);
    }

    private Drawable getDrawable(Evento evento) {
        Resources resources = context.getResources();
        int idDoDrawble = resources.getIdentifier(evento.getImagem(), DRAWABLE, context.getPackageName());
        return resources.getDrawable(idDoDrawble);
    }

    private void mostraNomeEvento(View viewCriada, Evento evento) {
        TextView nomeEvento = viewCriada.findViewById(R.id.txtNomeEvento);
        nomeEvento.setText(evento.getNomeEvento());
    }
}
