package org.example.alghoritms.forExercises;


import java.util.Scanner;

/** Diseñe un algoritmo que determine el promedio de 9 números
   enteros ingresados por teclado.
 */
public class AverageOfNumbersEnteredByKeyboard {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros a evaluar: ");
        int cantidad = input.nextInt();

        int suma = 0;

        for (int i = 0; i < cantidad; i++){

            System.out.println("Ingrese un numero: ");
            int numero = input.nextInt();

            suma = (suma + numero);

        }

        int promedio = (suma / cantidad);

        System.out.println("La sumatoria de los numeros ingresados es: " + suma);
        System.out.println("El promedio de los numeros ingresados es: " + promedio);
    }
}
