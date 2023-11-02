package org.example.alghoritms.doWhileEx;

import java.util.Scanner;

/*
    Diseñe un algoritmo que permita calcular el residuo
    y cociente por medio de restas sucesivas.
 */

// Usando While
public class QuotientAndRemainder {

    public static void main(String[] args) {


            Scanner input = new Scanner(System.in);

            System.out.println("Ingrese el dividendo:");
            int dividendo = input.nextInt();

            System.out.println("Ingrese el divisor:");
            int divisor = input.nextInt();

            if (divisor == 0) {
                System.out.println("No se puede dividir por cero.");
            } else {
                int cociente = 0;
                int residuo = dividendo;

                while (residuo >= divisor) {//5 >= 2
                    residuo = residuo - divisor; //5 - 2 = 3
                    cociente++;
                }

                System.out.println("Cociente: " + cociente);
                System.out.println("Residuo: " + residuo);
            }

    }
}

// Usando DoWhile
class CocienteYResiduo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el dividendo:");
        int dividendo = input.nextInt();
        System.out.println("Ingrese el divisor:");
        int divisor = input.nextInt();

        if (divisor == 0) {
            System.out.println("No se puede dividir por cero.");
        } else {
            int cociente = 0;
            int residuo = dividendo;

            do {
                residuo -= divisor;
                cociente++;
            } while (residuo >= divisor);

            System.out.println("Cociente: " + cociente);
            System.out.println("Residuo: " + residuo);
        }
    }
}
