package com.example.events.cod.dao;



import com.example.events.cod.Model.Evento;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class EventoDAO {

    private final static List<Evento> eventos = new ArrayList<>();

    public List<Evento> listaEvento() {
        List<Evento> eventos = new ArrayList<>(Arrays.asList(
                new Evento(1, "Expotec 2020", "baixados", new Date(), new Time(2,42,12), "Teste", "Sala 25",new Time(14,17,45)),
                new Evento(2, "Palestra Dia das Mães", "evento2", new Date(), new Time(2,42,00), "Teste", "Sala 25",new Time(14,17,45)),
                new Evento(3, "Palestra Dia dos Lindos", "phoca_thumb_l_pal_foto14", new Date(), new Time(2,42,00), "Teste", "Sala 25",new Time(14,17,45)),
                new Evento(4, "Palestra Dia dos Pegadores", "images", new Date(), new Time(2,42,00), "Teste", "Sala 25",new Time(14,17,45))));
        return eventos;
    }
}
