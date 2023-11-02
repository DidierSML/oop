package org.example.alghoritms.doWhileEx;

import java.util.Scanner;

public class FactorialOfANumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int factorial = 1;
        int contador = 1;

        System.out.println("Ingrese el numero al cual quiere calcularle su factorial: ");
        int numero = input.nextInt();

        do {
            factorial = factorial * contador;
            contador++;
        }while(contador <= numero);

        System.out.println(factorial);

        /*
            while(contador <= numero){
                factorial = factorial * contador;
                contador++;
            }

            System.out.println(factorial);
        */

    }
}
