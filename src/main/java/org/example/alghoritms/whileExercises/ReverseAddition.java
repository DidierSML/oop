package org.example.alghoritms.whileExercises;

import java.util.Scanner;

/*
    Diseñe un algoritmo que permita mostrar la suma de la serie completa en reversa
    desde un numero Inicial hasta 0, especificando el numero de veces que desea que
    se repita la serie:

    200, 198, 196, 194, …….

    (Input) numeroInicio

 */
public class ReverseAddition {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Programa que recorre una serie de numeros desde un numero x hasta 0");
        System.out.println("Ingrese cauntas veces quiere repetir la serie");

        int serie = input.nextInt();

        int numeroInicio = 202;
        int suma = 0;


        //Mientras (serie) sea menor a (0)
        while (serie > 0){
            numeroInicio = numeroInicio - 2; //El nroInicial sera igual al mismo nroInicial -2
            suma = suma + numeroInicio; //Suma va a ser igual a (suma) + el (nroIncial).
            System.out.println(numeroInicio);//imprima el nroIncial por cada ciclo
            serie--; //reste la (serie) hasta que sea igual a (0)
        }

        System.out.println(suma); //Finalmente imprima la (suma de todos los numeros reflejados durante la serie)
    }
}


