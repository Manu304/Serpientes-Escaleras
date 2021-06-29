/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mrojas.serpientes_escaleras.ventanas.static_image;

import javax.swing.*;
import java.awt.*;


/**
 *
 * @author Manu
 */
public class ImagenStatic {
    public static ImageIcon getImagenDimensionada(ImageIcon imagen, int ancho, int largo){
        return new ImageIcon(imagen.getImage().getScaledInstance(largo, largo, Image.SCALE_SMOOTH));
    }
    
}
