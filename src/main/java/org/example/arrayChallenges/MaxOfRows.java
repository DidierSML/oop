package org.example.arrayChallenges;

public class MaxOfRows {

    public static void main(String[] args) {

        int[][] numbers = {
                {1, 2, 5, 4}, //Row1
                {5, 9, 7, 8}, //Row2
                {9, 10, 11, 12} //Row3
        };

        for (int i = 0; i < 3; i++)
            System.out.println("Row" + (i + 1) + ": " + getMax(numbers[i]));
    }       //Este metodo imprimirá the maximum value of the current row[i] row, by row

    private static int getMax(int[] numbers) { //metodo creado

        int max = numbers[0]; //solo usaremos una dimension con el 1er valor de la fila
        for (int i = 0; i < numbers.length; i++)
            max = (numbers[i] > max) ? numbers[i] : max;

        return max;//return = stop, despues envia señal al sout get max para imprimir el maximo de la fila
    }
}
