package org.example.alghoritms;

import java.util.Scanner;

/*
    Diseñar un algoritmo que permita calcular el salario mensual de un
    trabajador, teniendo en cuenta los dias que trabajó y el valor de
    cada día.
 */
public class MonthlyPayment {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Input(datos de entrada)
        System.out.println("Ingrese el número de días que trabajó: ");
        int diasTrabajados = input.nextInt();

        //Input(datos de entrada)
        System.out.println("Ingrese el valor a pagar por día:");
        int valorDia = input.nextInt();

        //Process(proceso)
        int salario = (diasTrabajados * valorDia);

        //Output(Salida)
        System.out.println("El salario a pagar según los dias laborados es: " + salario);


    }
}
