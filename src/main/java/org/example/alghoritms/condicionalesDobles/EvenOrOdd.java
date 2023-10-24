package org.example.alghoritms.condicionalesDobles;

import java.util.Scanner;

/*
    Diseñar un algoritmo para determinar si el numero
    ingresado por teclado es par o impar.
 */
public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero para determinar si es par o impar:\n");

        //(Input)
        int numero = input.nextInt();

        //(Process)
        if(numero % 2 == 0){
            System.out.println("El numero es Par");
        }else{
            System.out.println("El numero es Impar");
        }

    }
}
