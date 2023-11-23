package org.example.alghoritms.condicionalesDobles;

import java.util.Arrays;
import java.util.Scanner;

/*
    Diseñe un algoritmo que imprima si un numero (true)
    si un numero es par o (false) si es impar.
 */
public class MainTests {

    public static void main(String[] args) {

        int[] array = {2,5,6,23,8};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int maximo = 0;
        int maximo2 = 0;

        for(int i = 0; i < array.length; i++){
            int elemento = array[i];

            if (array.length > 2){
               if (elemento > maximo){
                   maximo= elemento;
               }
               maximo = 0;
               for (int j = 0; j < array.length; j++){
                   int elemento2 = array[j];
                   if (array.length > 2) {
                       if (elemento > maximo) {
                           maximo2 = elemento;
                       }
                   }
               }
            }else{
                System.out.println("El array es menor a 2");
            }
        }

        System.out.println("El segundo maximo es: " + maximo2);


    }
}
