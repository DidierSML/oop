package org.example.arrayChallenges;

import java.util.Scanner;

public class ArraySumProductoAverage {
    public static void main(String[] args) {
        int array [] = new int[3]; //Lista creada de 5 unidades

        int sum = 0;            //variables matematicas
        int product = 1;
        double average;

        Scanner s = new Scanner(System.in);
        for (int i =0; i < array.length;i++){
            System.out.println("Ingrese el valor para el indice "+i);
            array [i] = s.nextInt(); // almacene el valor para cada indice
            sum += array[i];      //sume los valores almacenados en cada indice
            product *= array[i];  //multiplique los valores almacenados en cada indice
        }

        average = (double) sum / array.length;  // calculo de promedio

        System.out.println("sum = " + sum );        //imprima los resultados
        System.out.println("Product = " + product);
        System.out.println("Average = " + average);
    }
}
