package org.example.alghoritms.forExercises;

import java.util.Scanner;

/*
    Diseñe un algoritmo que imprima la suma de los numeros pares entre (0 y X) Numero
 */
public class SumOfEvenNumbersBetween0toX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el valor de X: ");
        int valorX = input.nextInt();

        int suma = 0;

        for (int i = 0; i <= valorX; i++){
            if(i % 2 == 0){
                suma = suma + i;
            }

        }

        System.out.println("Suma de numeros pares desde (0 hasta " + valorX + ") es: " + suma);

    }
}
