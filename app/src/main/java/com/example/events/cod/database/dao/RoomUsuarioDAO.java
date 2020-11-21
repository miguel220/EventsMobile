package com.example.events.cod.database.dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.events.cod.Model.Usuario;

import java.util.List;

@Dao
public interface RoomUsuarioDAO {

    @Query("SELECT * FROM usuario")
    List<Usuario> listaUsuario();

//    @Query("SELECT p.* FROM usuario u " +
//            "INNER JOIN perfil p " +
//            "ON u.idOwnerPerfil = p.codPerfil " +
//            "WHERE descricao = 'Auxiliar de Eventos'")
//    Usuario buscaUsuario();
}
