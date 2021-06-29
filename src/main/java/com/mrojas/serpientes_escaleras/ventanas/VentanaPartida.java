package com.mrojas.serpientes_escaleras.ventanas;

import com.mrojas.serpientes_escaleras.ventanas.paneles_partida.*;
import java.awt.*;
import javax.swing.*;

/**
 * Esta clase se encarga de mostrar graficamente los cambios en partida
 *
 * @author Manuel Rojas
 */
public class VentanaPartida extends JFrame{
    public VentanaPartida(){
        setVisible(true);
        setBounds(100, 100, 800, 500);
        setLocationRelativeTo(null);
        add(new PanelTablero(6,8), BorderLayout.CENTER);
        add(new PanelDados(), BorderLayout.EAST);
    }
}
