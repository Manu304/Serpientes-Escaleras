package com.mrojas.serpientes_escaleras.tablero;

import javax.swing.ImageIcon;

import com.mrojas.serpientes_escaleras.ventanas.static_image.ImagenStatic;

import java.net.URL;


/**
 *
 * @author Manu
 */
public class Ficha{
    /* PONER LAS IMAGENES EN LA CLASE QUE SE UTILICEN
    public final ImageIcon ROJA = new ImageIcon(getClass().getResource("/images/fichaRoja.png"));
    public final ImageIcon NARANJA = new ImageIcon(getClass().getResource("/images/fichaNaranja.png"));
    public final ImageIcon VERDE = new ImageIcon(getClass().getResource("/images/fichaVerde.png"));
    public final ImageIcon AMARILLO = new ImageIcon(getClass().getResource("/images/fichaAmarilla.png"));
    public final ImageIcon NEGRO = new ImageIcon(getClass().getResource("/images/fichaNegra.png"));
    public final ImageIcon AZUL = new ImageIcon(getClass().getResource("/images/fichaAzul.png"));
    */
    ImageIcon imagen;

    public Ficha(){

    }

    public ImageIcon getImagen(){
        return imagen;
    }

    public void setImagen(ImageIcon imagen){
        this.imagen = ImagenStatic.getImagenDimensionada(imagen, 60, 60);
    }

    //ROJA, NARANJA, VERDE, AMARILLA, NEGRA, AZUL;
    
}
