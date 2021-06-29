
package com.mrojas.serpientes_escaleras.ventanas;

import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.*;


/**
 *
 * @author Manu
 */
public class VentanaPartida extends JFrame{
    public VentanaPartida(){
        setVisible(true);
        setBounds(100, 100, 800, 500);
        setLocationRelativeTo(null);
        add(new PanelTablero(6,8), BorderLayout.CENTER);
        JPanel panelDado = new JPanel();
        ImageIcon snake = new ImageIcon(getClass().getResource("/images/dadoCara1.png"));
        Icon i = new ImageIcon(snake.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
        
        JLabel dado = new JLabel(i);
        panelDado.add(dado);
        add(panelDado, BorderLayout.EAST);
    }
}
