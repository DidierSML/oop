package org.example.alghoritms.secuenciales;

import java.util.Scanner;

/*
    Diseñe un algoritmo que permita calcular las operaciones
    aritméticas básicas (+ - * /) ingresando 2 valores numericos
    por teclado.
 */
public class ArithmeticOperations {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese los 2 números sobre los cuales quiere realizar calculos aritmeticos:");

        //Datos de entrada (input)
        int primerNumero = input.nextInt();
        int segundoNumero = input.nextInt();

        //Acciones (suma - resta - multiplicación- division)
        int suma = (primerNumero + segundoNumero);
        int resta = (primerNumero - segundoNumero);
        int multiplicacion = (primerNumero * segundoNumero);
        int division = (primerNumero / segundoNumero);

        //Salida (Output)
        System.out.println("Resultados: \nLa suma de los numeros es: " + suma);
        System.out.println("La resta de los numeros es: " + resta);
        System.out.println("La multiplicacion de los numeros es: " + multiplicacion);
        System.out.println("La division de los numeros es: " + division);
    }
}
