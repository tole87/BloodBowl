package com.example.miguel.bludbuwl;

import java.util.HashSet;

public class Humanos extends Equipo {

    public Humanos() {
        this.ficha = R.drawable.humanos_equipo;
        this.icono = R.drawable.humanos_logo;
        this.nombre = R.string.humanos;
    }

    @Override
    public HashSet<Jugador> getJugadores() {
        if(jugadores.isEmpty()){
            //Aqui instancio jugadores
            jugadores.add(new Jugador());
            jugadores.add(new Jugador());
            jugadores.add(new Jugador());
            jugadores.add(new Jugador());
        }
        return jugadores;
    }
}
