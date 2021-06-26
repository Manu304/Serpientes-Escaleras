package com.mrojas.serpientes_escaleras.principal;

import com.mrojas.serpientes_escaleras.ventanas.VentanaMenuInicio;

/**
 * Esta clase contiene el main para que la aplicación pueda ejecutarse
 * 
 * @author Manu
 */
public class Principal {
    public static void main(String[] args) {
        new Principal();
        System.out.println("Hola mundo!!!");
    }

    public Principal(){
        new VentanaMenuInicio();
    }
}
