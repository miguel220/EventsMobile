package com.example.events.cod.database.dao;


import androidx.room.Dao;
import androidx.room.Query;

import com.example.events.cod.Model.Inscricao;

import java.util.List;

@Dao
public interface InscricaoDAO {

    @Query("SELECT * FROM inscricao")
    List<Inscricao> listaInscricao();
}
