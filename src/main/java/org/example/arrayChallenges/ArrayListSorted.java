package org.example.arrayChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSorted {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Integer> listnumbers = new ArrayList<>(); //lista denominada listnumbers

        System.out.print(" Enter 5 Integers: "); //escriba 5 enteros

        for (int i = 0; i < 5; i++){ //de 0 a 4 almacene los enteros escritos por teclado
            int temp = s.nextInt(); //Variable creada para almacenar los numeros ingresados por teclado

            if(!listnumbers.contains(temp))// si la lista NO contiene el valor a ingresar,
                listnumbers.add(temp);     //entonces agreguelo.
        }

        Collections.sort(listnumbers); //organice la lista
        System.out.println(listnumbers); // imprima la lista obtenida
    }
}
