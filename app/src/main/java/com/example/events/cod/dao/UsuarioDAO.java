package com.example.events.cod.dao;

import com.example.events.cod.Model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    private final static List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> listaUsuario(){
        return new ArrayList<>(usuarios);
    }
}
