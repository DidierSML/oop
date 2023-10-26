package org.example.alghoritms.condicionalesCompuestos;


import java.util.Scanner;

/*
    Diseñar un algoritmo que calcule el valor de R
    de acuerdo a la siguiente relacion:

     Si X * I > 0
            Entonces, R = (A*B) / (C*D)
     Si X * I = 0
            Entonces, R = (A+B) / (C+D)
     Si X * I < 0
            Entonces, R = (A+B) - (C+D)

     (Input) Ingrese el valor de X, Ingrese el valor de I

 */
public class ValueOfR {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el valor de X ");
        double valorX = input.nextDouble();

        System.out.println("Ingrese el valor de I ");
        double valorI = input.nextDouble();

        System.out.println("Ingrese el valor de A ");
        double valorA = input.nextInt();

        System.out.println("Ingrese el valor de B ");
        double valorB = input.nextDouble();

        System.out.println("Ingrese el valor de C ");
        double valorC = input.nextDouble();

        System.out.println("Ingrese el valor de D ");
        double valorD = input.nextDouble();

        //(Process)
        if (valorX * valorI > 0){
            double valorR = (valorA * valorB) / (valorC * valorD);
            System.out.println("El valor de (R) es: " + valorR);
        } else if (valorX * valorI == 0) {
            double valorR = (valorA + valorB) / (valorC + valorD);
            System.out.println("El valor de (R) es: " + valorR);
        } else if (valorX * valorI < 0) {
            double valorR = (valorA + valorB) - (valorC + valorD);
            System.out.println("El valor de (R) es: " + valorR);
        }

    }
}
