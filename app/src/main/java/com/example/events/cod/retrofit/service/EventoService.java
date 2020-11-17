package com.example.events.cod.retrofit.service;

import com.example.events.cod.Model.Evento;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EventoService {

    @GET("events")
    Call<List<Evento>> buscaTodos();

}
