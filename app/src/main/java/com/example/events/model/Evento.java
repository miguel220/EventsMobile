package com.example.events.model;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Evento {

    private final int codEvento;
    private final String nomeEvento;
    private final String imagem;
    private final Date dataEvento;
    private final Time horaEvento;

    public Evento(int codEvento, String nomeEvento, String imagem, Date dataEvento, Time horaEvento) {
        this.codEvento = codEvento;
        this.nomeEvento = nomeEvento;
        this.imagem = imagem;
        this.dataEvento = dataEvento;
        this.horaEvento = horaEvento;
    }

    public int getCodEvento() {
        return codEvento;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getImagem() {
        return imagem;
    }

    public String getData() {
        SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/yyyy", new Locale("pt", "BR"));
        return dateForm.format(dataEvento);
    }

    public String getHora() {
        SimpleDateFormat timeForm = new SimpleDateFormat("HH:mm", new Locale("pt", "BR"));

        return timeForm.format(horaEvento);
    }

}
