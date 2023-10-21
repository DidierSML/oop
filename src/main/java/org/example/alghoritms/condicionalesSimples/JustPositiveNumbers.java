package org.example.alghoritms.condicionalesSimples;

/*
    Diseñar un algortimo que lea 2 numeros ingresados por teclado, en la
    cual al efectuar la suma de ambos numeros debe visualizarse los numeros
    ingresados y el resultado final, solo si el resultado no es negativo.

    - input= numero1, numero2
    - proceso = suma de los numeros
    - Condicional = si el resultado es + (Print)

 */

import java.util.Scanner;

public class JustPositiveNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ejercicio que imprime la sumatoria de 2 numeros siempre y cuando la sumatoria de estos de un numero positivo");
        System.out.println("Ingrese el primer numero por teclado:");
        //Input(datos de entrada)
        int primerNumero = input.nextInt();

        System.out.println("Ingrese el segundo numero por teclado:");
        //Input(datos de entrada)
        int segundoNumero = input.nextInt();

        //Process(proceso)
        int resultado = primerNumero + segundoNumero;

        //Condicional simple
        if(resultado >= 1){
            System.out.println("Primer numero ingresado: "+ primerNumero);
            System.out.println("Segundo numero ingresado: "+segundoNumero);
            System.out.println("La sumatoria de los numeros es: " + resultado);
        }

    }
}
