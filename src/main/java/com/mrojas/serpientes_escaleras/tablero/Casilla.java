package com.mrojas.serpientes_escaleras.tablero;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.*;

/**
 *
 * @author Manuel Rojas
 */
public class Casilla extends JLabel{
    Color color;
    int num;

    public Casilla(Color color, int num){
        super(Integer.toString(num), JLabel.CENTER);
        this.num = num;
        this.setOpaque(true);
        this.setBackground(color);
        this.setVerticalTextPosition(JLabel.BOTTOM);
    }

    public int getNum(){
        return num;
    }
    //private JLabel labelCasilla;
    /*
    public Casilla(Color color){
        this.color = color;
        labelCasilla = new JLabel("hola");
        labelCasilla.setBackground(color);
        ImageIcon snake = new ImageIcon(getClass().getResource("/images/fichaRoja.png"));
        Icon i = new ImageIcon(snake.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        labelCasilla.setOpaque(true);
        labelCasilla.setIcon(i);
        labelCasilla.setHorizontalAlignment(JLabel.CENTER);

        
        labelCasilla.setHorizontalTextPosition( JLabel.CENTER );
        labelCasilla.setVerticalTextPosition( JLabel.BOTTOM );
        //labelCasilla.setHorizontalAlignment(SwingConstants.CENTER);
        //labelCasilla.setVerticalAlignment(SwingConstants.BOTTOM);



        
        

        
        //labelCasilla.setVerticalAlignment(SwingConstants.SOUTH);
    }
    
    public JLabel getLabelCasilla(){
        return this.labelCasilla;
    }
    */
}
