package org.example.alghoritms.doWhileEx;

import java.util.Scanner;

/*
    Diseñe un algoritmo que permita al usuario ingresar una lista de números
    y listar cuantos son positivos y cuantos son negativos.
 */
public class QuantityOfPositiveAndNegativeNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros a evaluar: ");
        int cantidad = input.nextInt();

        int positive = 0;
        int negative = 0;
        int contador = 0;
        int total = 0;

        do {
            System.out.println("Ingrese un numero: ");
            int numero = input.nextInt();

            if (numero < 0){
                negative++;
            }else{
                positive++;
            }

            total++;
            contador++;

        }while(contador < cantidad);

        System.out.println("Total de numeros: " +  total);
        System.out.println("cantidad de numeros negativos: " + negative);
        System.out.println("cantidad de numeros positivos: " + positive);
    }
}


class CantidadDeNumerosPositivosYNegativos {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int negative = 0;
        int positive = 0;
        int contador = 0;
        int total = 0;

        System.out.println("Ingrese la cantidad de numeros a evaluar: ");
        int cantidad = input.nextInt();

        while (contador < cantidad){

            System.out.println("Ingrese un numero: ");
            int numero = input.nextInt();

            if (numero < 0){
                negative++;
            }else{
                positive++;
            }

            total++;
            contador++;

        }

        System.out.println("Total de numeros evaluados: " + total);
        System.out.println("La cantidad de numeros negativos es: " + negative);
        System.out.println("La cantidad de numeros positivos es: " + positive);


    }
}
