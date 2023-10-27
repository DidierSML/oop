package org.example.alghoritms.whileExercises;

/*
    Diseñe un algoritmo que permita imprimir la cantidad de números impares entre 0 y 100.
 */
public class PrintOddNumbers {

    public static void main(String[] args) {

        int number = 1;
        int cantidad = 0;

        while (number <= 100){
            System.out.println(number);
            number = number + 2;
            cantidad = cantidad + 1;
        }

        System.out.println("cantidad de numeros impares entre 1-100: " + cantidad);
    }
}
