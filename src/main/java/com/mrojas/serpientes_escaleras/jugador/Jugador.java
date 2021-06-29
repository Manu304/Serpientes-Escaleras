package com.mrojas.serpientes_escaleras.jugador;

import com.mrojas.serpientes_escaleras.tablero.Ficha;

/**
 * Esta clase contiene los metodos correspondientes al jugador.
 * 
 * @author Manuel Rojas
 */
public class Jugador {
    private int id, partiGanadas, partiPerdidas;
    private String nombre, apellido;
    private static int automaticIncrementID;
    private Ficha ficha;
    private int posAvanzadas;

    static {
        automaticIncrementID = 0;
    }
    /**
     * El constructor del jugador, sirve para poner instanciar uno nuevo
     * @param nombre Se debe de indicar el nombre del jugador
     * @param apellido Se debe indicar el apellido del jugador
     */

    public Jugador(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = Jugador.getAutomaticIncrementID();
        this.partiGanadas = 0;
        this.partiPerdidas = 0;
        this.posAvanzadas = 0;
    }

    public int getPosAvanzadas(){
        return posAvanzadas;
    }

    public void setPosAvanzadas(int cantPosExtra){
        this.posAvanzadas += cantPosExtra;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    public int getId() {
        return id;
    }

    public int getPartiGanadas() {
        return partiGanadas;
    }

    public void setPartiGanadas() {
        this.partiGanadas++;
    }

    public int getPartiPerdidas() {
        return partiPerdidas;
    }

    public void setPartiPerdidas() {
        this.partiPerdidas ++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static int getAutomaticIncrementID() {
        return ++automaticIncrementID;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
        result = prime * result + id;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Jugador other = (Jugador) obj;
        if (apellido == null) {
            if (other.apellido != null)
                return false;
        } else if (!apellido.equals(other.apellido))
            return false;
        if (id != other.id)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }
}