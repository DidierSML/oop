package org.example.alghoritms.doWhileEx;

import java.util.Scanner;

/**
 Programa que simula una Rifa o Sorteo y que mostrará la palabra
 "Acertaste!" hasta que el usuario ingrese el numero indicado entre 1 y 10.
 */
public class Raffle {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int numero=0;

        System.out.println("Desea participar del sorteo (S) (N)");
        String participa = input.nextLine();

        if (participa.equalsIgnoreCase("S")) {

                do {

                    System.out.println("Ingrese un numero:");
                    numero = input.nextInt();

                }while(numero != 7);

                System.out.println("Felicidades acertaste, el numero era: 7");

        }else {
            System.out.println("En otra ocasion sera.");
        }


    }
}
