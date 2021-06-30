package com.mrojas.serpientes_escaleras.ventanas;

import com.mrojas.serpientes_escaleras.tablero.Partida;
import com.mrojas.serpientes_escaleras.tablero.Tablero;
import com.mrojas.serpientes_escaleras.ventanas.paneles_partida.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Esta clase se encarga de mostrar graficamente los cambios en partida
 *
 * @author Manuel Rojas
 */
public class VentanaPartida extends JFrame implements ActionListener{
    
    private PanelTablero panelTablero;
    private PanelDados panelDados;
    private Partida nuevaPartida;
    
    public VentanaPartida(){
        panelDados = new PanelDados();
        panelTablero = new PanelTablero(new Tablero(10,10));
        nuevaPartida = new Partida(panelTablero.getTablero());
        setVisible(true);
        setBounds(100, 100, 800, 500);
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/images/snake.png")).getImage());
        add(panelTablero, BorderLayout.CENTER);
        add(panelDados, BorderLayout.EAST);
        panelDados.getBotonTirar().addActionListener(this);
    }

    public void tirarDados(){
        int dado1 = nuevaPartida.tirarDado();
        int dado2 = nuevaPartida.tirarDado();
        panelDados.cambiarDado(dado1, dado2);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tirarDados();
        
    }

}
