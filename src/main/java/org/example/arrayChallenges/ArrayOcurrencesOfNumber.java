package org.example.arrayChallenges;

public class ArrayOcurrencesOfNumber {

    public static void main(String[] args) {

        int[] numbers = {1, 1, 1, 2, 3, 4}; //Lista de números a evaluar
        int searchElement = 1;              //número a contar cuantas veces se repite

        //Imprima el resultado del -Método getNumberOcc- que recibe los parámetros anteriores
        System.out.println(getNumberOcc(numbers,searchElement));

    }
    public static int getNumberOcc(int[] numbers, int searchElement){  // Método getNumberOcc

        int occ = 0;                              //repeticiones iniciales del (1) = 0
        for (int i = 0;i < numbers.length; i++)   //recorra la lista de números completa
            if(searchElement == numbers [i])      //si el Número buscado(1) se repite en la lista
                occ++;                            //incremente este valor de conteo en 1 hasta recorrerla completamente

        return occ;                               //finalmente retorne el conteo

    }
}
