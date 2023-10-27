package org.example.alghoritms.whileExercises;

import java.util.Scanner;

/*
    Diseñe un algoritmo que permita determinar la media de una lista
    indefinida de numeros positivos.
    El programa se debe de acabar ingresando un numero negativo.
 */
public class AverageNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //(Constants)
        double media = 0;
        int contador = 0;

        System.out.println("Ingrese números positivos (o un número negativo para finalizar):");
        //(Input)
        int numero = input.nextInt();

        while (numero >= 0) {
            media = media + numero;
            contador = contador + 1;
            numero = input.nextInt();//lee el nuevo numero que se ingrese y repite el codigo
            //Siempre y cuando se ingresen numeros positivos se acumularán en la var media y contador.
        }

        if (contador > 0) {
            double promedio = media / contador;
            System.out.println("La media de los números ingresados es: " + promedio);
        } else {
            System.out.println("No se ingresaron números válidos para calcular la media.");
        }
    }
}

