package com.mrojas.serpientes_escaleras.tablero;

import com.mrojas.serpientes_escaleras.jugador.Jugador;
import com.mrojas.serpientes_escaleras.ventanas.static_image.ImagenStatic;

/**
 *
 * @author Manu
 */
public class Partida {
    Jugador[] jugadores;
    Tablero tablero;
    
    public Partida(Jugador[] jugadores, Tablero tablero){
        this.jugadores = jugadores;
        this.tablero = tablero;
        definirTurnos();
    }

    private void definirTurnos(){
        int veces = aleatorio(0, 5);
        for (int j = veces; j >= 0; j--) {
            Jugador ultimo = jugadores[jugadores.length-1];
            for (int i = jugadores.length-2; i >= 0; i--) {
                jugadores[i+1] = jugadores[i];
            }
            jugadores[0] = ultimo;
        }
    }

    public void mueveJugador(Jugador jugador, int cantAvanza){
        if (jugador.getPosAvanzadas() > 0) {
            tablero.moverFicha(jugador.getPosAvanzadas(), cantAvanza);
            jugador.setPosAvanzadas(cantAvanza);
        }else{
            int[] indices = tablero.getIndiceMatriz(cantAvanza);
            tablero.getCasilla(indices[0], indices[1]).setIcon(jugador.getFicha().getImagen());
        }

    }
    
    public int tirarDado(){
        return aleatorio(1, 6);
    }

    private static int aleatorio(int minimo, int maximo) {
        int aleatorio = (int) Math.floor(Math.random() * (maximo - minimo + 1) + minimo);
        return aleatorio;
    }
    
}
