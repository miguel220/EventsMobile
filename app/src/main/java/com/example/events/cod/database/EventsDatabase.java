package com.example.events.cod.database;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.events.cod.Model.Evento;
import com.example.events.cod.Model.Inscricao;
import com.example.events.cod.Model.Perfil;
import com.example.events.cod.Model.Usuario;
import com.example.events.cod.database.converter.ConversorDeData;
import com.example.events.cod.database.converter.ConversorDeTempo;
import com.example.events.cod.database.dao.InscricaoDAO;
import com.example.events.cod.database.dao.RoomEventoDAO;
import com.example.events.cod.database.dao.RoomPerfilDAO;
import com.example.events.cod.database.dao.RoomUsuarioDAO;


@Database(entities = {Evento.class, Usuario.class, Perfil.class, Inscricao.class}, version = 4, exportSchema = false)
@TypeConverters({ConversorDeTempo.class, ConversorDeData.class})
public abstract class EventsDatabase extends RoomDatabase {

    private static final String EVENTO_ESCOLAR_DB = "evento_escolar.sqlite";

    public abstract RoomEventoDAO getRoomEventoDAO();

    public abstract RoomUsuarioDAO getRoomUsuarioDAO();

    public abstract RoomPerfilDAO getRoomPerfilDAO();

    public abstract InscricaoDAO getRoomInscricaoDAO();

    public static EventsDatabase getInstance(Context context) {
        return Room.databaseBuilder(context, EventsDatabase.class, EVENTO_ESCOLAR_DB)
                .allowMainThreadQueries()
                .addMigrations(new Migration(1, 2) {
                    @Override
                    public void migrate(@NonNull SupportSQLiteDatabase database) {
                        // criando novas tabelas
                        database.execSQL("CREATE TABLE IF NOT EXISTS `Evento_novo` (`codEvento` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `nomeEvento` TEXT NOT NULL, `imagem` TEXT, `descricao` TEXT, `sala` TEXT NOT NULL, `dataEvento` TEXT NOT NULL, `horaEvento` TEXT NOT NULL, `duracao` TEXT NOT NULL, `eventoAtivo` INTEGER NOT NULL)");
                        database.execSQL("CREATE TABLE IF NOT EXISTS `Usuario_novo` (`codUsuario` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `emailUser` TEXT NOT NULL, `senhaUser` TEXT NOT NULL, `nomeUsuario` TEXT NOT NULL, `usuarioAtivo` INTEGER NOT NULL, `idOwnerPerfil` INTEGER NOT NULL)");
                        database.execSQL("CREATE TABLE IF NOT EXISTS `Perfil_novo` (`codPerfil` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `descricao` TEXT)");
                        database.execSQL("CREATE TABLE IF NOT EXISTS `Inscricao_novo` (`codIncricao` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `idUsuario` INTEGER NOT NULL, `idEvento` INTEGER NOT NULL)");
                        //excluir as tabelas antigas
                        database.execSQL("DROP TABLE Evento");
                        database.execSQL("DROP TABLE Usuario");
                        database.execSQL("DROP TABLE Perfil");
                        database.execSQL("DROP TABLE Inscricao");
                        //renomeando as tebelas antigas
                        database.execSQL("ALTER TABLE Evento_novo RENAME TO Evento");
                        database.execSQL("ALTER TABLE Usuario_novo RENAME TO Usuario");
                        database.execSQL("ALTER TABLE Perfil_novo RENAME TO Perfil");
                        database.execSQL("ALTER TABLE Inscricao_novo RENAME TO Inscricao");

                    }
                }, new Migration(2, 3) {
                    @Override
                    public void migrate(@NonNull SupportSQLiteDatabase database) {
                        // criando novas tabelas
                        database.execSQL("CREATE TABLE IF NOT EXISTS `Evento_novo` (`codEvento` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `nomeEvento` TEXT NOT NULL, `imagem` TEXT, `descricao` TEXT, `sala` TEXT NOT NULL, `dataEvento` TEXT NOT NULL, `horaEvento` TEXT NOT NULL, `duracao` TEXT NOT NULL, `eventoAtivo` INTEGER NOT NULL)");
                        database.execSQL("CREATE TABLE IF NOT EXISTS `Usuario_novo` (`codUsuario` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `emailUser` TEXT NOT NULL, `senhaUser` TEXT NOT NULL, `nomeUsuario` TEXT NOT NULL, `usuarioAtivo` INTEGER NOT NULL, `idOwnerPerfil` INTEGER NOT NULL)");
                        database.execSQL("CREATE TABLE IF NOT EXISTS `Perfil_novo` (`codPerfil` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `descricao` TEXT)");
                        database.execSQL("CREATE TABLE IF NOT EXISTS `Inscricao_novo` (`codIncricao` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `idUsuario` INTEGER NOT NULL, `idEvento` INTEGER NOT NULL)");
                        //excluir as tabelas antigas
                        database.execSQL("DROP TABLE Evento");
                        database.execSQL("DROP TABLE Usuario");
                        database.execSQL("DROP TABLE Perfil");
                        //renomeando as tebelas antigas
                        database.execSQL("ALTER TABLE Evento_novo RENAME TO Evento");
                        database.execSQL("ALTER TABLE Usuario_novo RENAME TO Usuario");
                        database.execSQL("ALTER TABLE Perfil_novo RENAME TO Perfil");
                        database.execSQL("ALTER TABLE Inscricao_novo RENAME TO Inscricao");
                    }
                }, new Migration(3, 4) {
                    @Override
                    public void migrate(@NonNull SupportSQLiteDatabase database) {

                    }
                })
                .build();
    }
}
