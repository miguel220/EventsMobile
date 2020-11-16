package com.example.events.model.recyclerView.adapter;

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
import com.example.events.model.Evento;

import java.util.List;

public class ListaDeEventosAdapter extends RecyclerView.Adapter {

    public static final String DRAWABLE = "drawable";
    private List<Evento> eventos;
    private Context context;

    public ListaDeEventosAdapter( Context context, List<Evento> eventos){
        this.context = context;
        this.eventos = eventos;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewCriada = LayoutInflater.from(context).inflate(R.layout.item_lista_eventos, parent, false);
        return new EventoViewHolder(viewCriada);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Evento evento = eventos.get(position);
        mostraImagem(holder, evento);
        mostraNomeEvento(holder, evento);
        mostraDataEvento(holder, R.id.txtDataEvento, evento.getData());
        mostraHoraEvento(holder, R.id.txtHoraEvento, evento.getHora());
    }

    private void mostraHoraEvento(@NonNull RecyclerView.ViewHolder holder, int p, String hora) {
        TextView horaEvento = holder.itemView.findViewById(p);
        horaEvento.setText(hora);
    }

    private void mostraDataEvento(@NonNull RecyclerView.ViewHolder holder, int p, String data) {
        TextView dataEvento = holder.itemView.findViewById(p);
        dataEvento.setText(data);
    }

    private void mostraNomeEvento(@NonNull RecyclerView.ViewHolder holder, Evento evento) {
        TextView nomeEvento = holder.itemView.findViewById(R.id.txtNomeEvento);
        nomeEvento.setText(evento.getNomeEvento());
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

    static class  EventoViewHolder extends RecyclerView.ViewHolder{

        public EventoViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}