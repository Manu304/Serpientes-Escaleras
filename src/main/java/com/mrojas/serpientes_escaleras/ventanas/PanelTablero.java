package com.mrojas.serpientes_escaleras.ventanas;

import com.mrojas.serpientes_escaleras.tablero.Tablero;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Manuel Rojas
 */
public class PanelTablero extends JPanel{
    
    private Tablero tablero;
    private int fila, columna;
    public PanelTablero(int fila, int columna){
        this.fila = fila;
        this.columna = columna;
        tablero = new Tablero(fila,columna);
        
        this.setLayout(new GridLayout(fila,columna));
        tablero.avanza(0, 2, 5);
        tablero.bajada(5, 0, 2, 3);
        agregarCasillas();

       
    }
    
    public void agregarCasillas(){
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                this.add(tablero.getCasilla(fila-1-i, columna-1-j));
                
            }
            
        }
    }

}
