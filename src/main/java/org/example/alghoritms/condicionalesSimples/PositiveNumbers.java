package org.example.alghoritms.condicionalesSimples;

import java.util.Scanner;

/*
    Diseñe un algoritmo que lea dos numeros y si son
    positivos ambos, imprima por pantalla "son positivos"
 */
public class PositiveNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");
        //Input(datos de Entrada)
        int primerNumero = input.nextInt();

        System.out.println("Ingrese el primer numero:");
        //Input(datos de Entrada)
        int segundoNumero = input.nextInt();

        //Calculo
        if(primerNumero > 0 && segundoNumero > 0){
            System.out.println("Ambos numeros son positivos");
        }
    }
}
