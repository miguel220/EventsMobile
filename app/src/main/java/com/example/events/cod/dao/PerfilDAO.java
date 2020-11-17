package com.example.events.cod.dao;

import com.example.events.cod.Model.Perfil;

import java.util.ArrayList;
import java.util.List;

public class PerfilDAO {

    private final static List<Perfil> perfils = new ArrayList<>();

    public List<Perfil> listaPerfil(){
        return new ArrayList<>(perfils);
    }
}
