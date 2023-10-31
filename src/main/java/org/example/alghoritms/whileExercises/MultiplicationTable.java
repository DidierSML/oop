package org.example.alghoritms.whileExercises;

/*Diseñe un algoritmo que permita imprimir la tabla de multiplicar de un número que se pide y
  vaya desde el 1 hasta el 12.
*/

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la tabla de numero que quiere visualizar hasta (12):");
        //(Input)
        int numero = input.nextInt();

        //Condicion inicial ( si el numero ingresado es menor a 12, continue y asigne el valor de 1 a i inicialmente)
        if (numero <= 12){
            int i = 1;

            //Tabla de X numero a mostrar
            System.out.println("La tabla del : " + numero + " hasta 12 es la siguiente:");
            //Bucle donde se aumentará (i) hasta el valor de 12 y se multiplicara cada vez por (numero)
            while(i <= 12){
                int producto = (numero * i);
                System.out.println(numero + " X " + i + " = " + producto);
                i++;
            }

        }else {
            System.out.println("El numero ingresado es mayor a 12");
        }
    }
}
