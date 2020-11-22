package com.example.events.cod.Model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@Entity
public class Evento {

    @PrimaryKey(autoGenerate = true)
    private int codEvento = 0;
    @NonNull
    private String nomeEvento;
    private String imagem;
    private String descricao;
    @NonNull
    private String sala;
    @NonNull
    private Date dataEvento;
    @NonNull
    private Time horaEvento;
    @NonNull
    private Time duracao;
    @NonNull
    private int eventoAtivo;

    public Evento() {

    }

    @Ignore
    public Evento(int codEvento, String nomeEvento, String imagem, Date dataEvento, Time horaEvento, String descricao, String sala, Time duracao) {
        this.codEvento = codEvento;
        this.nomeEvento = nomeEvento;
        this.imagem = imagem;
        this.dataEvento = dataEvento;
        this.horaEvento = horaEvento;
        this.duracao = duracao;
        this.descricao = descricao;
        this.sala = sala;
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

    public String getEventoData() {
        SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/yyyy", new Locale("pt", "BR"));
        return dateForm.format(dataEvento);
    }

    @NonNull
    public Time getHoraEvento() {
        SimpleDateFormat timeForm = new SimpleDateFormat("HH:mm:ss", new Locale("pt", "BR"));

        return horaEvento;
    }

    public String convertHora(){
        SimpleDateFormat timeForm = new SimpleDateFormat("HH:mm:ss", new Locale("pt", "BR"));
        return timeForm.format(horaEvento);
    }

    public void setHoraEvento(@NonNull Time horaEvento) {
        this.horaEvento = horaEvento;
    }

    public String getDescricao() {
        return descricao;
    }

    public Time getDuraçao() {
        return duracao;
    }

    public String getSala() {
        return sala;
    }

    public Date getDataEvento() {
        return dataEvento;
    }

    public Time getDuracao() {
        return duracao;
    }

    public int getEventoAtivo() {
        return eventoAtivo;
    }

    public void setEventoAtivo(int eventoAtivo) {
        this.eventoAtivo = eventoAtivo;
    }

    public void setCodEvento(int codEvento) {
        this.codEvento = codEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }



    public void setDuracao(Time duracao) {
        this.duracao = duracao;
    }
}
