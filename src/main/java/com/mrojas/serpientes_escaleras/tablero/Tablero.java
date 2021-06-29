package com.mrojas.serpientes_escaleras.tablero;
import java.awt.*;

/**
 *
 * @author Manu
 */
public class Tablero {
    Casilla[][] casillasTablero;
    int filas, columnas;
    Casilla pierdeTurno, tiraDados, avanza,retrocede, subeIni, subeFin, bajaIni, bajaFin;

    public Tablero(int filas, int columnas){
        casillasTablero = new Casilla[filas][columnas];
        this.generarTablero(new Color(154, 81, 237));
    }

    private void generarTablero(Color color){
        int contador = 1;
        for (int i = 0; i < casillasTablero.length; i++) {
            int columnaC = 0;
            Color color1 = Color.WHITE, color2 = color;
            for (int j = 0; j < casillasTablero[i].length; j++) {
                columnaC = j;
                 
                if (i%2 == 0) {
                    columnaC = casillasTablero[i].length-1-j;
                    color1 = color;
                    color2 = Color.WHITE;
                }
                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
                    casillasTablero[i][columnaC] = new Casilla(color1, contador);
                } else {
                    casillasTablero[i][columnaC] = new Casilla(color2, contador);
                }
                contador++;
            }
        }
    }

    public void pierdeTurno(int fila, int columna){
        casillasTablero[fila][columna].setText("Pierdes un turno");
        pierdeTurno = casillasTablero[fila][columna];

    }

    public void tiraDados(int fila, int columna){
        casillasTablero[fila][columna].setText("Tira de nuevo los dados");
        tiraDados = casillasTablero[fila][columna];

    }
    public void avanza(int fila, int columna, int cantPos){
        casillasTablero[fila][columna].setText("Avanza " + cantPos + " casillas");
        avanza = casillasTablero[fila][columna];

    }
    public void retrocede(int fila, int columna, int cantPos){
        casillasTablero[fila][columna].setText("Retrocede " + cantPos + " casillas");
        retrocede = casillasTablero[fila][columna];

    }
    public void subida(int filaIni, int columnaIni, int filaFin, int columnaFin){
        casillasTablero[filaIni][filaFin].setText("Sube a casilla " + Integer.toString(casillasTablero[filaFin][columnaFin].getNum()));
        subeIni = casillasTablero[filaIni][columnaIni];
        subeFin = casillasTablero[filaFin][columnaFin];

    }

    public void bajada(int filaIni, int columnaIni, int filaFin, int columnaFin){
        casillasTablero[filaIni][columnaIni].setText("Baja a casilla " + Integer.toString(casillasTablero[filaFin][columnaFin].getNum()));
        bajaIni = casillasTablero[filaIni][columnaIni];
        bajaFin = casillasTablero[filaFin][columnaFin];

    }

    public void moverFicha(int filaIni, int columnaIni, int filaFin, int columnaFin){
        casillasTablero[filaFin][columnaFin].setIcon(casillasTablero[filaIni][columnaIni].getIcon());
        casillasTablero[filaIni][columnaIni].setIcon(null);
    }

    public void moverFicha(int posIni, int cantPos){
        int[] indicesIni = getIndiceMatriz(posIni);
        int[] indicesFin = getIndiceMatriz(posIni+cantPos);
        moverFicha(indicesIni[0], indicesIni[1], indicesFin[0], indicesFin[1]);
    }

    public Casilla getCasilla(int fila, int columna){
        return casillasTablero[fila][columna];
    }
    /**
     * Metodo para encontrar los indices de la matriz de casillas de acuerdo al numero que tiene en el tablero del juego.
     * @param pos Se debe indicar el numero de la posición de la casilla en el juego
     * @return Retorna un vector que contiene en la primera posición la fila y en la segunda la columna de la casilla.
     */

    public int[] getIndiceMatriz(int pos){
        int [] indices = new int[2];
        for (int i = 0; i < casillasTablero.length; i++) {
            for (int j = 0; j < casillasTablero[i].length; j++) {
                if (pos == casillasTablero[i][j].getNum()) {
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        return indices;
    }

    /*
    private int[] getIndicesMatriz(int cantPos){ //indices[0] = fila, indices[1] = columna
        int[] indices = new int [2];
        if (cantPos > 0 && cantPos <= filas) {
            indices[0] = 0;
            indices[1] = cantPos-1;
        }else{
            indices[0] = (int) (Math.floor(cantPos/filas));
            indices[1] = cantPos%filas;
        }
        return indices;
    }
    
    public JLabel getLabelCasilla(int fila, int columna){
        return casillasTablero[fila][columna].getLabelCasilla();
    }
    */

    

}
