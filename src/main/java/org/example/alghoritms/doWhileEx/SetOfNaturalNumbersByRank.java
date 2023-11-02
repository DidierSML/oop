package org.example.alghoritms.doWhileEx;

import java.util.Scanner;

/*
    Diseñe un algoritmo que permita determinar en un conjunto de “n” números naturales:
    - ¿Cuántos son menores que 18?
    - ¿Cuantos están en el rango de 18 y 50?
    - ¿Cuantos son mayores que 50?
 */
public class SetOfNaturalNumbersByRank {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros a evaluar para saber en que rango se encuentran: ");
        int cantidad = input.nextInt();

        //(Constants)
        int contador = 0;
        int rangoMenor = 0;
        int rangoIntermedio = 0;
        int rangoSuperior = 0;

        //(While)
        while (contador <= cantidad) {


            System.out.println("Ingrese un numero: ");
            int numero = input.nextInt();

            if(numero <= 17){
                rangoMenor++;
            } else if (numero >= 18 && numero <= 50 ) {
                rangoIntermedio++;
            }else{
                rangoSuperior++;
            }

            contador++;
        }

        System.out.println("Total rango Menor (Menores a 18): " + rangoMenor);
        System.out.println("Total rango Intermedio (Entre 18 y 50) : " + rangoIntermedio);
        System.out.println("Total rango Superior (Mayores a 50): " + rangoSuperior);
    }
}

//Do While
class ConjuntoDeNumerosPorRango {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la cantiad de numeros a analizar: \n");
        int cantidad = input.nextInt();

        //(Constants)
        int rangoMenor = 0;
        int rangoIntermedio = 0;
        int rangoMayor = 0;
        int contador = 1;

        //(do While)
        do {
            System.out.println("Ingrese un numero: ");
            int numero = input.nextInt();

            if (numero < 18){
                rangoMenor++;
            } else if (numero >= 18 && numero <= 50) {
                rangoIntermedio++;
            }else {
                rangoMayor++;
            }

            contador++;

        }while(contador <= cantidad);

        System.out.println("Total rango Menor (Menores a 18): " + rangoMenor);
        System.out.println("Total rango Intermedio (Entre 18 y 50) : " + rangoIntermedio);
        System.out.println("Total rango Mayor (Mayores a 50): " + rangoMayor);


    }

}
