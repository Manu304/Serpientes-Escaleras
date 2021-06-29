package com.mrojas.serpientes_escaleras.ventanas.paneles_partida;

import com.mrojas.serpientes_escaleras.ventanas.static_image.ImagenStatic;
import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author Manu
 */
public class PanelDados extends JPanel{
    
    public final ImageIcon CARA1 = new ImageIcon(getClass().getResource("/images/dadoCara1.png"));
    public final ImageIcon CARA2 = new ImageIcon(getClass().getResource("/images/dadoCara2.png"));
    public final ImageIcon CARA3 = new ImageIcon(getClass().getResource("/images/dadoCara3.png"));
    public final ImageIcon CARA4 = new ImageIcon(getClass().getResource("/images/dadoCara4.png"));
    public final ImageIcon CARA5 = new ImageIcon(getClass().getResource("/images/dadoCara5.png"));
    public final ImageIcon CARA6 = new ImageIcon(getClass().getResource("/images/dadoCara6.png"));
    
    JLabel dado1, dado2;
    JButton botonTirar;
    public PanelDados(){
        setLayout(new BorderLayout());
        dado1 = new JLabel(ImagenStatic.getImagenDimensionada(CARA6, 100, 100));
        dado2 = new JLabel(ImagenStatic.getImagenDimensionada(CARA6, 100, 100));
        botonTirar = new JButton("LANZA LOS DADOS");
        botonTirar.setSize(100, 200);
        add(dado1, BorderLayout.WEST);
        add(dado2, BorderLayout.EAST);
        add(botonTirar, BorderLayout.SOUTH);
    }
    
    
    
}
