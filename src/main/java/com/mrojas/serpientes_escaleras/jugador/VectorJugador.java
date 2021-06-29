package com.mrojas.serpientes_escaleras.jugador;

import java.util.ArrayList;

/**
 * Esta clase contiene a los diferentes jugadores registrados en el juego. Se
 * encarga de manejar la información de los jugadores.
 *
 * @author Manuel Rojas
 */
public class VectorJugador {

    private ArrayList<Jugador> jugadores;

    public VectorJugador() {
        jugadores = new ArrayList<>(6);
    }

    /**
     * Este metodo sirve para registrar un jugador
     *
     * @param nombre Indicar el nombre que tendrá el jugador
     * @param apellido Indicar el apellido que tendrá el jugador
     */
    public void registrarJugador(String nombre, String apellido) {
        jugadores.add(new Jugador(nombre, apellido));
    }

    /**
     * Este metodo sirve para obtener a un jugador
     *
     * @param indice se debe indicar el indice que tiene el jugador en el
     * arreglo
     * @return Retorna al jugador encontrado en esa posición, si el indice es
     * invalido devuelve null
     */
    public Jugador getJugador(int indice) {
        return jugadores.get(indice);
    }

    /**
     * Elimina al jugador que se encuentre en el indice que se le envie
     *
     * @param indice el indice del jugador en el arreglo
     */
    public void eliminarJugador(int indice) {
        jugadores.remove(indice);
    }

    /**
     * Modifica el nombre del jugador que se le indique
     *
     * @param indice El indice del jugador a editar en el arreglo
     * @param nombre El nombre corregido del jugador
     */

    public void editarNombreJugador(int indice, String nombre) {
        jugadores.get(indice).setNombre(nombre);
    }

    /**
     * Modifica el apellido del jugador que se le solicite
     *
     * @param indice El indice del jugador a editar en el arreglo
     * @param apellido El apellido corregido del jugador
     */

    public void editarApellidoJugador(int indice, String apellido) {
        jugadores.get(indice).setApellido(apellido);
    }

    public int getSize() {
        return jugadores.size();
    }

    public ArrayList<Jugador> getListaJugadores() {
        return jugadores;
    }
    
    public void setListaJugadores(ArrayList<Jugador> jugadores){
        this.jugadores = jugadores;
    }

}
