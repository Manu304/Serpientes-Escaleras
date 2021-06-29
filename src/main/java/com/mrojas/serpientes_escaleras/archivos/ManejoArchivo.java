package com.mrojas.serpientes_escaleras.archivos;

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.nio.charset.Charset;

/**
 *
 * @author Manuel Rojas
 */
public class ManejoArchivo {

    public static String getFileChooserPath() {
        JFileChooser fileChooser = new JFileChooser("Seleccione la ruta");
        fileChooser.showOpenDialog(null);
        return fileChooser.getSelectedFile().getPath();
    }

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

}
