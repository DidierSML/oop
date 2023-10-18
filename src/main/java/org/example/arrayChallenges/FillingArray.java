package org.example.arrayChallenges;

import java.util.Arrays;
import java.util.Scanner;

public class FillingArray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("How many elements? (Max is 20): ");
        int n = s.nextInt();

        while (n > 20 || n <= 0) { //Condicion para almacenar los #
            System.out.println("Invalid number, try again: ");//Si no, pregunte otro #
            n = s.nextInt();

        }

        int[] numbers = new int[n]; //Luego creamos una lista llamada numbers con enteros
        fillArrayOfIntegers(numbers); //Asignación de un metodo que tome la lista 'numbers' como parametro y las guarde dentro del metodo
        printArrayOfIntegers(numbers);///Asignación un metodo que imprima los datos almacenados en la lista 'numbers'

    }

    private static void fillArrayOfIntegers(int[] numbers) { //Creación del método que guardará los datos ingresados
        Scanner s = new Scanner(System.in);//al ser un nuevo metodo necesita un nuevo scanner para leer los valores introducidos en el metodo

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = s.nextInt(); //leera y almacenara los datos ingresados por el usuario

    }

    private static void printArrayOfIntegers(int[] numbers) {//Creación del método que imprimira los datos ingresados
        System.out.println("The elements are: ");
        System.out.println(Arrays.toString(numbers));//imprimira la lista haciendo uso de la calse Arrays
    }
}
