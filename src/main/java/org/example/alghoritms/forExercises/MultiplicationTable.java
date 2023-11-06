package org.example.alghoritms.forExercises;

import java.util.Scanner;

/*
    Tabla de multiplicar de un numero que este entre ( 1 - 12)
    usando for loop
 */
public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Tabla de multiplicar para numeros entre (1 - 12)");
        System.out.println("Ingrese el numero del cual desea saber la tabla:");

        int numero = input.nextInt();

        if (numero >= 1 && numero <= 12){

            for (int i = 1; i <= 12; i++){

                int producto = (numero * i);
                System.out.println(numero + " X " + i + " = " + producto );

            }
        }else{
            System.out.println("El numero ingresado esta fuera de los parametros solicita");
        }


    }
}


