package org.example.alghoritms.forExercises;

/*
    Aqui trabajamos con dos indices uno para las filas y otro para las columnas.
    Siempre! Siempre! se declara primero la (fila) y luego la (columna).
 */

import java.util.Scanner;

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

//Aisgnando valores y recorriendo la matriz
class AsignandoValoresMatriz {

    public static void main(String[] args) {

        int [][] matriz = {
                {1,2,3,4},
                {5,6,7,8},
        };

        for (int fila = 0; fila < matriz.length; fila++){
            for (int columna = 0; columna < matriz[fila].length;columna++){
                int valor = (matriz[fila][columna]);
                System.out.println("Fila: " + fila + " Columna: " + columna + " = " + valor);
            }
        }


    }

}

//Asignando valores tamaño de la matriz y valores por teclado
class AsignacionPorTeclado {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de filas:");
        int totalFilas = input.nextInt();

        System.out.println("Ingrese la cantidad de columnas:");
        int totalColumnas = input.nextInt();

        int [][] matriz = new int[totalFilas][totalColumnas];

        //Muestre los indices de la matriz
        for (int fila = 0; fila < totalFilas; fila ++) {
            for (int columna = 0; columna < totalColumnas; columna++) {
                System.out.println("Fila: " + fila + " Columna: " + columna);

            }
        }

        System.out.println("Ingrese los valores de la matriz:");
        //Ingrese los valores de la matriz
        for (int fila = 0; fila < totalFilas; fila++){//2
            for (int columna = 0; columna < totalColumnas; columna++){//3
                matriz [fila][columna] = input.nextInt();
            }
        }


        //Imprima los valores de la matriz
        for (int fila = 0; fila < totalFilas; fila++){
            for (int columna = 0; columna < totalColumnas; columna++){
                System.out.print(matriz [fila][columna] + " ");
            }
            System.out.println();
        }
    }



}

/*
             int [][] matriz = new int [2][2];

             matriz [0][0]=1;
             matriz [0][1]=2;
             matriz [1][0]=3;
             matriz [1][1]=4
*/