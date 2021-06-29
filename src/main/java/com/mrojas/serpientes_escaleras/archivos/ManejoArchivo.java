package com.mrojas.serpientes_escaleras.archivos;

import java.io.*;
import java.util.*;
import javax.swing.*;

import com.mrojas.serpientes_escaleras.jugador.Jugador;

import java.nio.charset.Charset;

/**
 * Esta clase se encarga de todo lo relacionado a archivos, de su lectura y escritura.
 *
 * @author Manuel Rojas
 */
public class ManejoArchivo {
    /**
     * Método para solicitarle al usuario una ruta en el ordenador
     * @return Retorna la ruta que seleccionó el jugador, en caso de no hacerlo retorna nulo.
     */
    public static String getFileChooserPath() {
        JFileChooser fileChooser = new JFileChooser("Seleccione la ruta");
        fileChooser.setApproveButtonText("Ok");
        fileChooser.showOpenDialog(null);
        return fileChooser.getSelectedFile().getPath();
    }
    /**
     * Metodo para leer archivos en forma de texto
     * @param path Se requiere indicar la ruta del archivo que se quiere leer
     * @return Retorna una lista de Strings con el contenido del archivo
     */

    public static List<String> getLinesTextFile(String path) {
        List<String> response = new ArrayList<>();

        Charset utf8 = Charset.forName("UTF-8");
        try (
                 BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(path), utf8));) {
            String line = null;
            while ((line = in.readLine()) != null) {
                response.add(line);
            }
        } catch (IOException e) {
            System.out.println(e);
            response = new ArrayList<>();
        }

        return response;
    }
    /**
     * Metodo apra cargar archivos binarios generados por la aplicación
     * @param path Se debe indicar la ruta en la que se encuentra el archivo binario
     * @return Retorna un ArrayList de jugadores para ser cargados a la app
     */

    public static ArrayList<Jugador> cargarArchivoJugadores(String path) {
        ArrayList<Jugador> jugadores;
        try {
            final ObjectInputStream in = new ObjectInputStream(
                    new BufferedInputStream(new FileInputStream(path)));

            jugadores = (ArrayList<Jugador>) in.readObject();

        } catch (Exception e) {
            jugadores = null;
        }
        return jugadores;
    }
    /**
     * Metodo para guardar archivos binarios con el contenido de los jugadores
     * @param lista Se debe indicar la lista de jugadores a guardar
     * @param path Se debe indicar la ruta en la que se guardará el archivo
     */

    public static void guardarArchivoJugadores(ArrayList<Jugador> lista, String path) {

        ObjectOutputStream out;

        try {
            out = new ObjectOutputStream(
                    new BufferedOutputStream(new FileOutputStream(path + ".snake")));
            out.writeObject(lista);
            try {
                out.close();
            } catch (IOException e) {
            }
        } catch (IOException e) {
        }

    }

}
