package org.example.alghoritms.forExercises;

/*
    Aqui trabajamos con dos indices uno para las filas y otro para las columnas.
    Siempre! Siempre! se declara primero la (fila) y luego la (columna).
 */

//Recorriendo una matriz
public class ArrayForMatrices {

    public static void main(String[] args) {

        //Array inicializado con un tamaño de 2 filas y 3 columnas
        int [][] matriz = new int[2][3];

        //Recorra la matriz e imprima sus indices en cada iteracion [filas] [columnas]
        for(int fila = 0; fila < 2; fila++){
            for(int columna = 0; columna < 3; columna++){
                System.out.println("Índice [" + fila + "][" + columna + "]: " + matriz [fila][columna]);
            }
        }

    }

}
