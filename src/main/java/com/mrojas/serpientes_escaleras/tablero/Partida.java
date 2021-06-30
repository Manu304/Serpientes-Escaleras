package com.mrojas.serpientes_escaleras.tablero;

import com.mrojas.serpientes_escaleras.jugador.Jugador;
import com.mrojas.serpientes_escaleras.ventanas.static_image.ImagenStatic;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Manu
 */
public class Partida {

    Jugador[] jugadores;
    Tablero tablero;

    public Partida(Tablero tablero) {
        this.tablero = tablero;
    }

    public Partida(Jugador[] jugadores, Tablero tablero) {
        this.jugadores = jugadores;
        this.tablero = tablero;
        asignarFicha();
        definirTurnos();
    }

    private void definirTurnos() {
        int veces = aleatorio(0, 5);
        for (int j = veces; j >= 0; j--) {
            Jugador ultimo = jugadores[jugadores.length - 1];
            for (int i = jugadores.length - 2; i >= 0; i--) {
                jugadores[i + 1] = jugadores[i];
            }
            jugadores[0] = ultimo;
        }
    }

    public void mueveJugador(Jugador jugador, int cantAvanza) {
        if (jugador.getPosAvanzadas() > 0) {
            if (jugador.getPosAvanzadas() + cantAvanza <= (tablero.getColumnas() * tablero.getFilas())) {
                tablero.moverFicha(jugador.getPosAvanzadas(), cantAvanza);
            }

        } else {
            int[] indices = tablero.getIndiceMatriz(cantAvanza);
            tablero.getCasilla(indices[0], indices[1]).setIcon(jugador.getFicha().getImagen());

        }
        jugador.setPosAvanzadas(cantAvanza);

    }

    public int tirarDado() {
        return aleatorio(1, 6);
    }

    private static int aleatorio(int minimo, int maximo) {
        int aleatorio = (int) Math.round(Math.random() * (maximo - minimo + 1) + minimo);
        return aleatorio;
    }

    private void asignarFicha() {
        ImageIcon[] imagenes = {ROJA, NARANJA, VERDE, AMARILLO, NEGRO, AZUL};
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i].setFicha(new Ficha());
            jugadores[i].getFicha().setImagen(imagenes[i]);
        }
    }

    public boolean terminarPartida() {
        boolean termino = false;
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i].getPosAvanzadas() == (tablero.getColumnas() * tablero.getFilas())) {
                termino = true;
            }
        }
        return termino;
    }

    public Jugador getGanador() {
        Jugador ganador = null;
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i].getPosAvanzadas() == (tablero.getColumnas() * tablero.getFilas())) {
                ganador = jugadores[i];
            }
        }
        return ganador;
    }

    private final ImageIcon ROJA = new ImageIcon(getClass().getResource("/images/fichaRoja.png"));
    private final ImageIcon NARANJA = new ImageIcon(getClass().getResource("/images/fichaNaranja.png"));
    private final ImageIcon VERDE = new ImageIcon(getClass().getResource("/images/fichaVerde.png"));
    private final ImageIcon AMARILLO = new ImageIcon(getClass().getResource("/images/fichaAmarilla.png"));
    private final ImageIcon NEGRO = new ImageIcon(getClass().getResource("/images/fichaNegra.png"));
    private final ImageIcon AZUL = new ImageIcon(getClass().getResource("/images/fichaAzul.png"));

}
