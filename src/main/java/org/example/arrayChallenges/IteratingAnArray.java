package org.example.arrayChallenges;

public class IteratingAnArray {
    public static void main(String[] args) {

        int [] Array = {5, 2, 2, 0};

        int i = 0;
        for ( Integer item : Array)
            System.out.println(item + " " + i++);

    }
}
/**
 * Recorriendo un Array Simple e imprimiendo el valor que contiene y
 * en frente el indice. Ej: [5 0]
 */