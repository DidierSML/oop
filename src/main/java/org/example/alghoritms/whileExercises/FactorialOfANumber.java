package org.example.alghoritms.whileExercises;

import java.util.Scanner;

/*
    Diseñe un algoritmo que permita calcular el factorial
    de un número ingresado por teclado, este número ingresado
    debe estar entre 1 a 15.
 */
public class FactorialOfANumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero para hallar su factorial, este numero debe estar entre 1-15");

        int numero = input.nextInt();

        int factorial = 1;
        int contador = 1;

        if (numero < 1 || numero > 15){
            System.out.println("El numero ingresado no esta entre 0 - 15");
        }else {

            while (contador <= numero) {
                factorial = factorial * contador;
                System.out.println(factorial + " ");
                contador++;
            }
            System.out.println(factorial);
        }
    }
}
