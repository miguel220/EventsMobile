package com.example.events.cod.database.dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.events.cod.Model.Perfil;

import java.util.List;

@Dao
public interface RoomPerfilDAO {

    @Query("SELECT * FROM Perfil")
    List<Perfil> listaPerfils();
}
