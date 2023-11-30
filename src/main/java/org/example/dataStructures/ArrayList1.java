package org.example.dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A continuación veremos como se pueden crear ArrayList tradicionales,
 * ArrayList que almacenen un Array ya creado, como adicionar elementos
 * a un ArrayList, como adicionar una Colección a un ArrayList y como
 * iterar una lista mediante el uso de un método de referencia o expresión
 * lambda y mediante el for each tradicional
 */

public class ArrayList1 {

    public static void main(String[] args) {

        //Creando nueva lista tipo -ArrayList-
        List<String> listaColores = new ArrayList<>();

        //Creacion de una Lista de Arrays usando la (C) Arrays
        String [] nombres = {"Arturo","Daniel","Felipe", "Maria"};

        List<String> listaNombres = Arrays.asList(nombres);

        //Adición de elementos individuales a la Lista Colores
        listaColores.add("Amarillo");
        listaColores.add("Verde");
        listaColores.add("Azul");

        //Construir lista a partir de otra lista
        List <String> elementos = new ArrayList<>(listaColores);

        //Adición de elementos de otra colección
        elementos.addAll(listaNombres);

        //Imprimiendo una lista a través del for-each, usando un método referenciado
        System.out.println("Lista de Nombres");
        listaNombres.forEach(System.out::println);

        System.out.println("Lista de Colores");
        listaColores.forEach(System.out::println);

        System.out.println("Lista de Elementos");
        elementos.forEach(System.out::println);

        //Imprimiendo una lista a través del for-each, segunda forma

        System.out.println("Imprimiendo lista Colores con el for-each tradicional");
        for (String imprimir:listaColores) {
            System.out.println(imprimir);
        }


    }


}
