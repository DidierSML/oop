package org.example.alghoritms.forExercises;

import java.util.Scanner;

/*
   Diseñar un algoritmo que permita calcular el factorial de un número,
   si el rango permitido debe estar entre 2 y 12.
 */
public class FactorialOfNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int factorial = 1;

        System.out.println("Ingrese un numero para hallar su factorial: ");
        int numero = input.nextInt();


        //Usando el ciclo for el contador siempre va a ser (i)
        if (numero >= 2 && numero <= 12){
            for (int i = 1; i <= numero; i++ ){
                factorial = (factorial * i);
            }

            System.out.println("El factorial de " + numero +  " es: " + factorial);

        }else{
            System.out.println("El numero ingresado esta fuera del rango establecido (2 - 12).");
        }



    }
}
