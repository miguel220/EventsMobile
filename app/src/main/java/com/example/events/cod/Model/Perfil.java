package com.example.events.cod.Model;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Perfil {

    @PrimaryKey(autoGenerate = true)
    private int codPerfil = 0;
    private String descricao;

    @Ignore
    public Perfil(int codPerfil, String descricao) {
        this.codPerfil = codPerfil;
        this.descricao = descricao;
    }

    public Perfil() {

    }

    public int getCodPerfil() {
        return codPerfil;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCodPerfil(int codPerfil) {
        this.codPerfil = codPerfil;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
