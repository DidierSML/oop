package org.example.alghoritms.whileExercises;

import java.util.Scanner;

/*
    Diseñe un algoritmo que permita ingresar el ultimo numero de una serie.
    Ej: mostrado a continuación :
    2, 4, 6 , 8 , 10 ,……..;
    Mostrar la suma total de la serie completa en la pantalla.
 */
public class Serie {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el ultimo numero de la serie: ");
        int numeroFinal = input.nextInt();

        int serie = 0;
        int suma = 0;

        while (serie <= numeroFinal){
            System.out.println(serie);
            suma = suma + serie;
            serie = serie + 2;
        }

        System.out.println("la suma total de los pares desde 0 hasta "+ numeroFinal + " es: " + suma);
    }
}
