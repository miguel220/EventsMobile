package com.example.events.cod.retrofit;

import com.example.events.cod.retrofit.service.EventoService;

import retrofit2.Retrofit;

public class EventoRetrofit {

    private final EventoService eventoService;

    public EventoRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://10.0.2.2:44390/")
                .build();
        eventoService = retrofit.create(EventoService.class);

    }

    public EventoService getEventoService() {
        return eventoService;
    }
}
