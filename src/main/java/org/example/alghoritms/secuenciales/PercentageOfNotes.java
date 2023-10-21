package org.example.alghoritms.secuenciales;

import java.util.Scanner;

/*
    Defina un algoritmo que permita calcular la nota final de un alumno, teniendo en cuenta
    que ha realizado 3 evaluaciones y cada una esta sometida a un valor diferente:

    input(entrada)
    Nota 1: 25%
    Nota 2: 45%
    Nota 3: 30%

    NotaFinal 100%: ?

 */
public class PercentageOfNotes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Calculador de nota Final");

        System.out.println("Ingrese la Primera Nota:");
        //Input(dato de entrada)
        double nota1 = input.nextDouble();

        System.out.println("Ingrese la Segunda Nota:");
        //Input(dato de entrada)
        double nota2 = input.nextDouble();

        System.out.println("Ingrese la Tercera Nota:");
        //Input(dato de entrada)
        double nota3 = input.nextDouble();

        //Procces(Proceso)
        double valorPrimeraNota = nota1 * 0.25;
        double valorSegundaNota = nota2 * 0.45;
        double valorTerceraNota = nota3 * 0.30;

        double notaFinal = (valorPrimeraNota + valorSegundaNota + valorTerceraNota);

        //Output(Salida)
        System.out.println("La nota Final equivale a: " + notaFinal);


    }
}
