package com.example.events.cod.recyclerview.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.events.R;
import com.example.events.cod.Model.Evento;


import java.util.List;

public class ListaDeEventosAdapter extends RecyclerView.Adapter<ListaDeEventosAdapter.EventoViewHolder> {

    public static final String DRAWABLE = "drawable";
    private List<Evento> eventos;
    private Context context;

    public ListaDeEventosAdapter(Context context, List<Evento> eventos) {
        this.context = context;
        this.eventos = eventos;
    }

    static class EventoViewHolder extends RecyclerView.ViewHolder {

        public TextView horaEvento;
        public TextView dataEvento;
        public TextView nomeEvento;

        public EventoViewHolder(@NonNull View itemView) {
            super(itemView);
            horaEvento = itemView.findViewById(R.id.txtHoraEvento);
            dataEvento = itemView.findViewById(R.id.txtDataEvento);
            nomeEvento = itemView.findViewById(R.id.txtNomeEvento);
        }
    }

    @NonNull
    @Override
    public EventoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewCriada = LayoutInflater.from(context).inflate(R.layout.item_lista_eventos, parent, false);
        return new EventoViewHolder(viewCriada);
    }


    @Override
    public void onBindViewHolder(@NonNull EventoViewHolder holder, int position) {
        Evento evento = eventos.get(position);
        mostraImagem(holder, evento);
        holder.horaEvento.setText(evento.convertHora());
        holder.dataEvento.setText(evento.getEventoData());
        holder.nomeEvento.setText(evento.getNomeEvento());
    }

    private void mostraImagem(@NonNull RecyclerView.ViewHolder holder, Evento evento) {
        ImageView imagem = holder.itemView.findViewById(R.id.imgEventos);
        Drawable drawableImagemEventos = getDrawable(evento);
        imagem.setImageDrawable(drawableImagemEventos);
    }

    private Drawable getDrawable(Evento evento) {
        Resources resources = context.getResources();
        int idDoDrawble = resources.getIdentifier(evento.getImagem(), DRAWABLE, context.getPackageName());
        return resources.getDrawable(idDoDrawble);
    }

    @Override
    public int getItemCount() {
        return eventos.size();
    }


}