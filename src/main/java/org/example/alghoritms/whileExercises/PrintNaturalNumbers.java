package org.example.alghoritms.whileExercises;

import java.util.Scanner;

/*
    Diseñe un algoritmo que imprima todos los numeros naturales que hay
    desde x numeroInicial hasta y numeroFinal introducido por teclado,
    y cuentelos.

    (Input) numeroInicial,numeroFinal
 */
public class PrintNaturalNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el Natural inicial desde el cual va a partir: ");
        int numeroInicial = input.nextInt();

        System.out.println("Ingrese el Natural Final hasta donde va a contar: ");
        int numeroFinal = input.nextInt();


        int numeroInicialOriginal = numeroInicial;
        int contador = 0;

        while (numeroInicial <= numeroFinal){
            System.out.println(numeroInicial);
            contador = contador + 1;
            numeroInicial= numeroInicial + 1;

        }

        System.out.println("El conteo de numeros registrados desde "
                              + numeroInicialOriginal + " hasta " + numeroFinal + " es: " + contador);


    }
}
