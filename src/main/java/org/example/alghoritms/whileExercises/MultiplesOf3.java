package org.example.alghoritms.whileExercises;

/*
    Diseñe un algoritmo que permita imprimir en pantalla y contabilizar los
    múltiplos de 3 desde cero hasta un número introducido por teclado.
 */

import java.util.Scanner;

public class MultiplesOf3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero final hasta el cual quiere contabilizar los multiplos de 3");
        //(Input)
        int numero = input.nextInt();

        //(Constants)
        int inicio = 3;
        int contador = 0;

        while (inicio <= numero ){
            if(inicio % 3 == 0){
                System.out.println( inicio + " es multiplo de 3");
                contador++;
            }
            inicio++;//incrementa la iteracion para indiferente si es multiplo o no de 3
        }
        System.out.println("cantidad de multiplos encontrados " + contador);
    }


}

//        while(inicio <= numero - 3){
//            inicio = inicio + 3;
//            cantidadMultiplos++;
//            System.out.println(inicio + " ");
//
//        }
//        System.out.println(cantidadMultiplos);
