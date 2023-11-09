package org.example.alghoritms.forExercises;

/*
    Crea un array de números enteros y encuentra el número más grande en el array.
    Luego, por favor, proporciona tu solución y la revisaremos.
 */
public class LargestAndSmallerNumber {

    public static void main(String[] args) {

        int mayor = 0;

        int[] array = {7, 10, 6, 5, 9};


        for (int i = 0; i < array.length; i++) {

            if (mayor < array[i]){
                mayor = array[i];
            }

        }

        System.out.println(mayor);


    }

}
