package org.example.alghoritms.whileExercises;

import java.util.Scanner;

/*
    Diseñe un algoritmo que permita ingresar varios enunciados
    como sea posible y contabilizarlos.

    (Input) numeroFinalDeclaraciones

 */
public class SeveralStatements {

    public static void main(String[] args) {


            Scanner input = new Scanner(System.in);

            int contador = 0;
            //String enunciado;

            System.out.println("Presione 'S' para continuar ingresando enunciados o cualquier otra tecla para finalizar:");

            while (true) {
                System.out.print("Ingrese un enunciado: ");
                String enunciado = input.nextLine();
                //El 1er enunciado ingresado se lee aun cuando no se le pide ingresar "S", a partir de allí si se pide "S"

                if (enunciado.equalsIgnoreCase("S")) {
                    // continue ingresando otro enunciado

                } else { //Al hacerlo
                    contador++; //Aumente el contador en 1
                }

                //Se pregunta de nuevo y se compara la var (respuesta) para repetir el bucle o terminarlo.
                System.out.print("¿Desea ingresar otro enunciado? (Presione 'S' para continuar): ");
                String respuesta = input.nextLine(); //Lea la respuesta

                if (!respuesta.equalsIgnoreCase("S")) {
                    break; // Salir del bucle si no se presiona 'S'
                }
            }

            System.out.println("Se ingresaron " + contador + " enunciados."); //Imprimir Contador

    }
}
