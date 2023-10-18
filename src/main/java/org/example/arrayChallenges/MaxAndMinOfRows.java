package org.example.arrayChallenges;

public class MaxAndMinOfRows {
    public static void main(String[] args) {

        int[][] numbers = {
                {1, 2, 5, 4}, //Row1
                {5, 9, 7, 8}, //Row2
                {9, 10, 11, 12} //Row3
        };
        for (int i = 0; i < 3; i++){ //ciclo (i) para Filas/rows
            int max = 0;  //Var sum inicia en 0
            for (int j = 0; j < 4; j++) //Ciclo (j) para Columns
                max = (numbers[i][j] > max) ? numbers[i][j] : max ; //Suma de valores inicia volviendo sum el valor en la fila [0] col [0] y va sumando

            System.out.println("The max of row "+ (i + 1) + ": "+max); //
        }

    }
}
