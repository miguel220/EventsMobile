package com.example.events.cod.database.dao;

import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.Transaction;

import com.example.events.cod.Model.PerfilComUsuario;

import java.util.List;

@Dao
public interface PerfilComUsuarioDAO {

    @Transaction
    @Query("SELECT * FROM perfil")
    public List<PerfilComUsuario> getPerfilComUsuario();
}
