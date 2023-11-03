package org.example.alghoritms.doWhileEx;

import java.util.Scanner;

/*
    Diseñe un algoritmo que permita ingresar 10 números por
    teclado y que permita calcular la media de números pares
    e impares.
 */
public class AverageOfEvenAndOddNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Ingrese la cantidad de numeros que desea evaluar: ");
        int cantidad = input.nextInt();

        int pares = 0;
        int sumaPares = 0;
        int impares = 0;
        int sumaImpares = 0;
        int contador = 1;

        do {
            System.out.println("Ingrese un numero: ");
            int numero = input.nextInt();

            if (numero % 2 == 0){
                pares++;
                sumaPares = (sumaPares + numero);
            } else {
                impares++;
                sumaImpares = (sumaImpares + numero);
            }

            contador++;

        }while (contador <= cantidad);

        int promedioPares = (sumaPares / pares);
        int promedioImpares = (sumaImpares / impares);

        System.out.println("Promedio numero pares ingresados: " + promedioPares);
        System.out.println("Total numeros pares contados: " + pares);
        System.out.println("Promedio numero pares ingresados: " + promedioImpares);
        System.out.println("Total numeros pares contados: " + impares);
    }
}
