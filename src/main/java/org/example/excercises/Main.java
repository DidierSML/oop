package org.example.excercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int[] lista = new int[]{2, 4, 5, 8};
        int objetivo = 9;

        Map<Integer, Integer> mapa = new HashMap<>();
        boolean encontrado = false;

        for (int i = 0; i < lista.length; i++) {
            int numeroActual = lista[i];
            int complemento = objetivo - numeroActual;

            if (mapa.containsKey(complemento)) {
                int indiceComplemento = mapa.get(complemento);
                System.out.println("los indices son " + indiceComplemento + " y " + i);
                encontrado = true;
                break;
            }

            mapa.put(numeroActual, i);
        }
        if (!encontrado){
            System.out.println("null");
        }
    }
}
