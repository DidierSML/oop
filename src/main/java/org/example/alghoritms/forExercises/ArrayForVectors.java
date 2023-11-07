package org.example.alghoritms.forExercises;

import java.util.Scanner;

// Recorriendo indice por indice de un array unidimensional
public class ArrayForVectors {

    public static void main(String[] args) {

        //Array inicializado con un tamaño de 4
        int [] vector = new int[4]; //[][][][]

        //Recorra el arreglo vector e imprima su indice en cada iteracion
        for (int i = 0; i < vector.length; i++){
            System.out.println(i);
        }
    }

}

//Recorriendo e imprimiendo tanto el indice como el elemento dentro de un vector unidimensional
class RecorriendoVectorYElementos {

    public static void main(String[] args) {

        //Array inicializado con un tamaño de 4
        int [] vector = {2,3,5,8}; //[][][][]

        //Recorra el arreglo vector e imprima su indice en cada iteracion
        for (int i = 0; i < vector.length; i++){
            int elemento = vector[i]; //Extrayendo lo que hay en cada indice
            System.out.println("Índice " + i + ": Valor " + elemento);

        }
    }
}

class CargandoVector {

    public static void main(String[] args) {

        int [] vector = new int [5];

        vector[0] = 1;
        vector[1] = 23;
        vector[2] = 43;
        vector[3] = 89;
        vector[4] = 18;
        //vector[5] = 12;

        for (int i = 0; i < vector.length; i++){
            System.out.println("Indice: " + i + " Elemento: "+ vector[i]);
        }
    }


}

//Ingresando el Tamaño de un Array y sus elementos por teclado
class RecibiendoTamanoPorTeclado {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del array:");
        int tamano = input.nextInt();

        int [] array = new int [tamano];

        for(int i = 0; i < array.length; i++){
            System.out.println("Ingrese un elemento: ");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length; i++){
            System.out.println("Indice: "+ i + " Elemento: " + array[i]);
        }


    }

}