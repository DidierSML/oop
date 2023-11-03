package org.example.alghoritms.doWhileEx;

import java.util.Scanner;

/*
    Diseñe un algoritmo que permita convertir galones en litros,
    el programa deberá desplegar galones de 10 a 20 en incrementos
    de un galón y los litros equivalentes correspondientes.

    Nota: 1 galón: 3.785 Litros.
 */
public class GallonsToLiters {

    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);

//        System.out.println("Ingrese los galones a convertir en litros");
//        double galones = input.nextDouble();

        int cantidadMax = 20;
        int contador = 10;

        double unGalonEs = 3.785;
        double conversion = 0;

        while (contador <= cantidadMax){
            conversion = (contador * unGalonEs);
            System.out.println(contador + " galones son: " + conversion + " litros");
            Thread.sleep(1000);
            contador++;
        }
    }
}

class ConversionDeGalonesALitros {

    public static void main(String[] args) throws InterruptedException {

        int contador = 10;
        int limite = 20;
        double conversion = 0;
        double deGalonALitro = 3.785;

        do {
            conversion = (contador * deGalonALitro);
            System.out.println( contador + " galones son: " + conversion + " litros.");
            Thread.sleep(1000);
            contador++;

        }while(contador <= limite);

    }
}
