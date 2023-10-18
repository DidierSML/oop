package org.example.arrayChallenges;

import java.util.Arrays;

public class MinAndMaxOfArra2 {

    public static void main(String[] args) { //UniDimensional

        int [] numbers = {-1,0,9,4,5};

        Arrays.sort(numbers); //clasifica la lista de menor a mayor (-1,0,4,5,9)

        System.out.println("min = "+ numbers[0]); //imprime la pos en el indice 0 = -1
        System.out.println("max = "+ numbers[numbers.length-1]); //imprime la pos en el indice (5-1) = 4 =9
    }
}
