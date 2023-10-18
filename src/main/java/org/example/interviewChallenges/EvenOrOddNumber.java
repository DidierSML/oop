package org.example.interviewChallenges;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3;i++){

            System.out.println("Ingrese 3 números para saber si son pares o no");
            int primerNumero = s.nextInt();

            if (primerNumero % 2 == 0) {
                System.out.println("El número es par");
            } else {
                System.out.println("El número es impar");
            }
        }


    }
}