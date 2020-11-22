package com.example.events.cod.database.converter;

import androidx.room.TypeConverter;

import java.sql.Time;

public class ConversorDeTempo {

    @TypeConverter
    public Time paraTime(int valor){
        return new Time(valor);
    }
    
    @TypeConverter
    public int paraInteiro(Time time){
        return time.hashCode();
    }

}
