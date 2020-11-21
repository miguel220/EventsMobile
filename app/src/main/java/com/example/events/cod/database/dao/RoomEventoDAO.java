package com.example.events.cod.database.dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.events.cod.Model.Evento;

import java.util.List;

@Dao
public interface RoomEventoDAO {

    @Query("SELECT * FROM Evento")
    List<Evento> listaEvento();
}
