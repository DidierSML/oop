package org.example.alghoritms.forExercises;

/*
    Diseña un algoritmo que permita determinar si un numero ingresado por
    teclado es primo o no.
 */

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero por teclado para saber si es primo o no: ");
        int numero = input.nextInt();

        int contador = 0;

        for (int i = 1; i <= numero; i++){
            if (numero % i == 0){
                contador++;
            }
        }

        if (contador == 2){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }
}
