package org.example.interviewChallenges;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwoIndexNumbers {

    /**
     * programa en Java que encuentra los índices de dos números cuya
     * sumatoria sea igual a un número objetivo definido previamente
     * y que estén dentro de un array:
     *
     */

    public static void main(String[] args) {

        int [] lista = new int []{2,4,6,8,11}; //array de números
        int objetivo = 8; // El número Objetivo

        //Mapa para almacenar los numeros del array y sus indices
        Map<Integer, Integer> mapa = new HashMap<>();
        boolean encontrado = false;

        //Iterar a través de un array
        for(int i = 0; i < lista.length; i++){
            int numeroActual = lista[i];//número actual
            int complemento = objetivo - numeroActual;//número objetivo - númeroActual

            //Verificar si el complemento está en el mapa
            if (mapa.containsKey(complemento)) {
                int indiceComplemento = mapa.get(complemento);
                System.out.println("Los indices son " + indiceComplemento + " y " + i);
                encontrado = true;
                break;// Terminar el bucle, ya que hemos encontrado la pareja
            }

            //Agregar el número actual al mapa
            mapa.put(numeroActual,i);

        }
        if (!encontrado){
            System.out.println("null");
        }
    }

}
