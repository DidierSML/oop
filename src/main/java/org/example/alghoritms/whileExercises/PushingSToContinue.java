package org.example.alghoritms.whileExercises;

import java.util.Scanner;

/*
    Diseñe un algoritmo que al pulsar (S) permita continuar con
    el programa.
 */
public class PushingSToContinue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String respuesta = "S";

        while (respuesta.equalsIgnoreCase("S")) {
            // Coloca aquí el código que deseas ejecutar mientras se ingrese "S"

            // Pide al usuario si desea continuar
            System.out.print("¿Desea continuar? (S para sí, cualquier otra tecla para no): ");
            respuesta = input.next();
        }

        System.out.println("Fin del programa.");



    }

}

