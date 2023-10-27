package org.example.alghoritms.whileExercises;

/*
    Diseñe un algoritmo que imprima los numeros pares entre 0 y 100
 */
public class PrintEvenNumber {

    public static void main(String[] args) {

        int numero = 0;

        while (numero <= 100){
            System.out.println(numero);
            numero = numero + 2;
        }

    }
}
