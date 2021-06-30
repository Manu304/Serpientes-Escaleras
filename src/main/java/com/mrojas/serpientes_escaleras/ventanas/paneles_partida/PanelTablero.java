package com.mrojas.serpientes_escaleras.ventanas.paneles_partida;

import com.mrojas.serpientes_escaleras.tablero.Tablero;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Manuel Rojas
 */
public class PanelTablero extends JPanel{
    
    private Tablero tablero;
    public PanelTablero(Tablero tablero){
        this.tablero = tablero;
        this.setLayout(new GridLayout(tablero.getFilas(), tablero.getColumnas()));
        tablero.avanza(0, 2, 5);
        tablero.bajada(5, 0, 2, 3);
        agregarCasillas();

       
    }

    public Tablero getTablero(){
        return tablero;
    }
    
    public void agregarCasillas(){
        for (int i = 0; i < tablero.getFilas(); i++) {
            for (int j = 0; j < tablero.getColumnas(); j++) {
                this.add(tablero.getCasilla(tablero.getFilas()-1-i, tablero.getColumnas()-1-j));
                
            }
            
        }
    }

}
