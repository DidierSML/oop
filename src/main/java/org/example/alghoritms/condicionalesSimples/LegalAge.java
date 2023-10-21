package org.example.alghoritms.condicionalesSimples;

import java.util.Scanner;

/*
    Diseñar un algoritmo que al ingresar la edad de un usuario, se imprima
    por mensaje si es mayor o no.
 */
public class LegalAge {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la edad del usuario para saber si es mayor de edad:");

        //Input(datos de entrada)
        int edad = input.nextInt();
        //Constant(constante)
        int mayorDeEdad = 18;

        if (edad >= mayorDeEdad ){
            System.out.println("El usuario es mayor de edad");
        }
    }
}
