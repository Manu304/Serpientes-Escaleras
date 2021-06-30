package com.mrojas.serpientes_escaleras.ventanas.static_image;

import javax.swing.*;
import java.awt.*;


/**
 * Clase que contiene metodos estáticos para tratar imagenes
 *
 * @author Manuel Rojas
 */
public class ImagenStatic {

    /**
     * Metodo para dimensionar una imágen
     * @param imagen Se le debe de pasar una imagen
     * @param ancho Se debe indicar el ancho que tendrá la imagen
     * @param largo Se debe indicar el largo que tendrá la imagen
     * @return Devuelve la imagen con las dimensiones que se indicaron
     */
    public static ImageIcon getImagenDimensionada(ImageIcon imagen, int ancho, int largo){
        return new ImageIcon(imagen.getImage().getScaledInstance(largo, largo, Image.SCALE_SMOOTH));
    }
    
}
