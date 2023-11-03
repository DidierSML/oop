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

        System.out.println("Total numeros pares: " + pares);
        System.out.println("Total numeros impares: " + impares);

        if (pares == 0){
            System.out.println("Promedio numeros pares NO se puede realizar (division x cero)");
        }else{
            int promedioPares = (sumaPares/pares);
            System.out.println("Promedio numeros pares: " + promedioPares);
        }


        if (impares == 0){
            System.out.println("Promedio numeros impares NO se puede realizar (division x cero)");
        }else{
            int promedioImpares = (sumaImpares/impares);
            System.out.println("Promedio numeros impares: " + promedioImpares);
        }

    }
}

/*
    Diseñe un algoritmo que permita ingresar 10 números por
    teclado y que permita calcular la media de números pares
    e impares.
 */
class PromedioYSumaDeNumerosParesEImpares {


    public static void main(String[] args) {


        int contador = 1;
        int pares = 0;
        int impares = 0;
        int sumaPares = 0;
        int sumaImpares = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros a evaluar: ");
        int cantidad = input.nextInt();

        while (contador <= cantidad){

            System.out.println("Ingrese un numero: ");
            int numero = input.nextInt();

            if(numero % 2 == 0){
                sumaPares = sumaPares + numero;
                pares++;
            }else{
                sumaImpares = sumaImpares + numero;
                impares++;
            }

            contador++;
        }

        System.out.println("Total numeros pares: " + pares);
        System.out.println("Total numeros impares: " + impares);

        if (pares == 0){
            System.out.println("Promedio numeros pares NO se puede realizar (division x cero)");
        }else{
            int promedioPares = (sumaPares/pares);
            System.out.println("Promedio numeros pares: " + promedioPares);
        }

        if (impares == 0){
            System.out.println("Promedio numeros impares NO se puede realizar (division x cero)");
        }else{
            int promedioImpares = (sumaImpares/impares);
            System.out.println("Promedio numeros impares: " + promedioImpares);
        }

    }


}