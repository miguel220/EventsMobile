package com.example.events.cod.Model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

@Entity
public class Usuario {

    @PrimaryKey(autoGenerate = true)
    private int codUsuario = 0;
    @NonNull
    private String emailUser;
    @NonNull
    private String senhaUser;
    @NonNull
    private String nomeUsuario;
    private int usuarioAtivo;
    @ForeignKey(entity = Perfil.class,
            parentColumns = "codPerfil",
            childColumns = "idOwnerPerfil",
            onUpdate = CASCADE,
            onDelete = CASCADE)
    private int idOwnerPerfil;


    @Ignore
    public Usuario(int codUsuario, String emailUser, String senhaUser, String nomeUsuario) {
        this.codUsuario = codUsuario;
        this.emailUser = emailUser;
        this.senhaUser = senhaUser;
        this.nomeUsuario = nomeUsuario;

    }

    public Usuario() {

    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public String getSenhaUser() {
        return senhaUser;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public int getIdOwnerPerfil() {
        return idOwnerPerfil;
    }

    public int getUsuarioAtivo() {
        return usuarioAtivo;
    }

    public void setUsuarioAtivo(int usuarioAtivo) {
        this.usuarioAtivo = usuarioAtivo;
    }

    public void setIdOwnerPerfil(int idOwnerPerfil) {
        this.idOwnerPerfil = idOwnerPerfil;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public void setSenhaUser(String senhaUser) {
        this.senhaUser = senhaUser;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
}
