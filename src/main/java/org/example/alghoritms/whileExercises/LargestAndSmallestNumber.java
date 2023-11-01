package org.example.alghoritms.whileExercises;

import java.util.Scanner;

/*
    Diseñe un algoritmo que permita mostrar el numero mayor y el
    numero menor de una serie de cinco números que vamos introduciendo
    por teclado.
 */
public class LargestAndSmallestNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mayor = 0;
        int menor = 0;
        int series = 5;
        int contador = 1;

        while(contador <= series){
            System.out.println("Ingrese un numero para analizar:");
            int numero = input.nextInt();

            //Este ciclo se cumple una sola vez, aqui donde asignaremos incialmente el 1er numero al valor mayor y menor
            if(contador == 1) {
                mayor = numero;
                menor = numero;
            }

            //Asignacion numero mayor
            if (numero > mayor){
                mayor = numero;
            }

            //Asignacion numero menor
            if(numero < menor){
                menor = numero;
            }

            //Incremento contador
            contador++;
        }

        System.out.println(menor);
        System.out.println(mayor);
    }

}

/*
    Solucion alternativa para asignar el Maximo Valor al entero llamado (menor)
        int menor = Integer.MAX_VALUE;
 */