package com.example.events.cod.Model;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

@Entity
public class Inscricao {

    @PrimaryKey(autoGenerate = true)
    private int codIncricao;
    @ForeignKey(entity = Usuario.class,
            parentColumns = "codUsuario",
            childColumns = "idUsuario",
            onDelete = CASCADE,
            onUpdate = CASCADE)
    private int idUsuario;
    @ForeignKey(entity = Evento.class,
            parentColumns = "codEvento",
            childColumns = "idEvento",
            onDelete = CASCADE,
            onUpdate = CASCADE)
    private int idEvento;

    public Inscricao() {

    }

    @Ignore
    public Inscricao(int codIncricao, int idUsuario, int idEvento) {
        this.codIncricao = codIncricao;
        this.idUsuario = idUsuario;
        this.idEvento = idEvento;
    }

    public int getCodIncricao() {
        return codIncricao;
    }

    public void setCodIncricao(int codIncricao) {
        this.codIncricao = codIncricao;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }
}
