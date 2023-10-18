package org.example.arrayChallenges;

public class MinAndMaxOfArray {

    public static void main(String[] args) {

        int[] numbers = {9, 2, 8, 4, 0};//Array-Lista - UniDimensional

        int min = numbers[0];  //Variable creada para min empieza valiendo 0 luego en el ciclo toma el 1er valor y empieza a analizar numero por numero
        int max = numbers[0];  //Variable creada para max empieza valiendo 0 luego en el ciclo toma el 1er valor

        for (int i = 0; i < numbers.length;i++){       //Ciclo repetitivo
            max =(numbers[i] > max) ? numbers[i] : max; //Buscador maximo
            min =(numbers[i] < min) ? numbers[i] : min; //Buscador minimo
        }

        System.out.println("max ="+max+"  min="+min);

    }
}
