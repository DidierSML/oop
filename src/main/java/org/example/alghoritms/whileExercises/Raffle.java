package org.example.alghoritms.whileExercises;

import java.util.Scanner;

/**
    Programa que simula una Rifa o Sorteo y que mostrará la palabra
    "Acertaste!" hasta que el usuario ingrese el numero indicado entre 1 y 10.
 */

public class Raffle {

    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner (System.in);

        //(Constantes)
        int numeroGanador = 6;
        int numeroParticipante;

        System.out.println("Desea participar del sorteo: (S) - (N) ");
        //(Input)
        String participacion = input.nextLine();

        //(Condicional1)
        if (participacion.equalsIgnoreCase("S")){
            System.out.println("Ok, preparate: ");
            Thread.sleep(1000);

            System.out.println("Ingresa un numero para participar, el numero debe estar entre 1 y 10:");
            //Asignacion a la variable numeroParticipante esta vez por teclado.
            numeroParticipante = input.nextInt();

            //(Condicional1)
            if (numeroParticipante > 0 && numeroParticipante < 11){

                while (numeroParticipante != numeroGanador){

                    System.out.println("Ingresa otro numero: ");
                    //De nuevo asignacion a la variable numeroParticipante esta vez por teclado.
                    numeroParticipante = input.nextInt();
                }
                System.out.println("Felicidades Acertaste!! el numero era " + numeroGanador);

            }else{
                System.out.println("numero invalido, debe estar entre 1 y 10");
            }


        }else{
            System.out.println("Tranquilo, en otra ocasion será:");
        }

    }
}

