package org.example.arrayChallenges;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySumProductAverage {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of elements of the list: "); //#Elementos
        int n = s.nextInt(); //lectura de # elementos ingresados
        int[] arrays = new int[n]; //lista creada para recibir los elementos asignados en (n)

        fillArrays(arrays);    //Asignacion de metodos - llenar las posiciones y muestrelas
        displayMaths(arrays);  //mostrar suma, producto y promedio de las cifras en la lista
    }

    private static void fillArrays(int[] arrays) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the elements: ");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("indice " + i + ": ");
            arrays[i] = s.nextInt();

        }
        System.out.println(Arrays.toString(arrays)); //se puede dejar fuera del ciclo o incluirse en un metodo aparte
    }

    private static void displayMaths(int[] arrays) {
        int sum = 0;
        int product = 1;
        double ave;
        for (int i = 0; i < arrays.length; i++) {
            sum = sum + arrays[i];
            product = product * arrays[i];
        }
        ave = (double) sum / arrays.length;
        System.out.println("sum = " + sum + ", product = " + product + ", average = " + ave);
    }

}
