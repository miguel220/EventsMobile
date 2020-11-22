package com.example.events.cod.Model;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class PerfilComUsuario {

    @Embedded public Perfil perfil;
    @Relation(
            parentColumn = "codPerfil",
            entityColumn = "idOwnerPerfil"
    )
    public List<Usuario> usuarios;

}
