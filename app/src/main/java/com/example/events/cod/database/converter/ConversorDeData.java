package com.example.events.cod.database.converter;

import androidx.room.TypeConverter;

import java.util.Date;

public class ConversorDeData {

    @TypeConverter
    public Date paraDate(String valor) {
        return new Date(valor);
    }

    @TypeConverter
    public String paraString(Date valor){
        return valor.toString();
    }

}
