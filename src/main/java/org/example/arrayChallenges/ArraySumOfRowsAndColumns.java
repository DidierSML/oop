package org.example.arrayChallenges;

public class ArraySumOfRowsAndColumns {

    public static void main(String[] args) {

        int [][] numbers = {
                {1,2,3,4}, //Row1
                {5,6,7,8}, //Row2
                {9,10,11,12} //Row3
        };

        for (int i = 0; i < 3; i++){ //ciclo (i) para Filas/rows
            int sum = 0;  //Var sum inicia en 0
            for (int j = 0; j < 4; j++) //Ciclo (j) para Columns
                sum += numbers[i][j]; //Suma de valores inicia volviendo sum el valor en la fila [0] col [0] y va sumando

            System.out.println("The sum of row "+ (i + 1) + ": " + sum); //
        }

        System.out.println("\n"); // imprime despues de dos espacios

        for (int i = 0; i < 4; i++){ //ciclo (i) para Columnas esta vez
            int sum = 0;  //Var sum inicia en 0
            for (int j = 0; j < 3; j++) //Ciclo (j) para Filas/rows esta vez
                sum += numbers[j][i]; //Suma de valores inicia volviendo sum el valor en la Col [0] fila [0] y va sumando


            System.out.println(" The sum of Column "+ (i + 1) + ": " + sum); //
        }
    }
}
