package org.example.arrayChallenges;

import java.util.Arrays;

public class SortArrayOddAndEven {

    public static void main(String[] args) {

        int[] numbers = {-3, 2, -1, 3, 5, 6, 4};
        int[] temp = new int[numbers.length]; //inicialmente vacios [0,0,0,0,0,0,0,0]

        int od = 0;       //variable int que empezará a partir del indice 0
        int ev = numbers.length - 1; //variable int que empezará del indice 5 hacia atras

        for (int i = 0; i < numbers.length; i++)
            if(numbers[i] % 2 != 0) // si el resto es =0 od incrementará en la lista temp
                temp[od++] = numbers[i];// el valor de i se ubicará en la lista od en el sentido
            else
                temp[ev--] = numbers[i];

        copyArray(temp, numbers); //asignacion de metodo modificador de array numbers a array temp
        System.out.println(Arrays.toString(numbers));

    }

    private static void copyArray(int[] temp, int[] numbers) {
        for (int i = 0; i < temp.length; i++)
            numbers [i] = temp [i] ;          //ahora array numbers tendrá los valores de array temp
    }
}
