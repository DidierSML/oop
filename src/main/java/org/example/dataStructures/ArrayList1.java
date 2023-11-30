package org.example.dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

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

        //Creando un Objeto iterator para recorrer una Lista (Asignando la listaColores al objeto -iterator-)
        ListIterator <String> iterator = listaColores.listIterator();

        //Recorrido normal de una List usando Iterator
        System.out.println("\n\nRecorrido con Iterator: ");
        while (iterator.hasNext()){ //Mientras haya algo que iterar en sentido normal
            System.out.println("Color: " + iterator.next()); //Imprima lo que hay en cada índice
        }

        //Recorrido a la inversa de una List usando Iterator
        System.out.println("\n\nRecorrido con Iterator a la Inversa");
        while (iterator.hasPrevious()){ //Mientras haya algo que iterar pero en sentido inverso
            System.out.println("Color: " + iterator.previous());//Imprima lo que hay en cada índice a la inversa
        }
/*

        Este ciclo While deberia funcionar, sin embargo, como anteriormente iteramos con hasNext
        el progrma entiende que ya no hay nada que iterar. Por ende usaremos en lugar el ciclo (For)

        //Removiendo un elemento mediante los Metodos de ListIterator
        System.out.println("\n\nRecorrido con Iterator sin Amarillo");
        while (iterator.hasNext()){ //Mientras haya algo que iterar
            if (iterator.next().equalsIgnoreCase("Amarillo")){
                iterator.remove();
            }
            System.out.println("Color: " + iterator.previous());//Imprima lo que hay en cada índice a la inversa
        }

 */
        //Recorriendo la lista y removiendo según la condición
        while (iterator.hasNext()){
            if (iterator.next().equals("Amarillo")){
                iterator.remove();
            }
        }

        System.out.println("\n\nRecorrido con iterator removiendo el color Amarillo usando For");
        for (ListIterator <String> iterator2 = listaColores.listIterator();iterator2.hasNext();){
            System.out.println("Color: " + iterator2.next());
        }



    }


}
