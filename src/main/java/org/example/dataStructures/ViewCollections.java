package org.example.dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ViewCollections {

    /*
        Una -ViewCollection- es una especie de Collection que depended Si o Si de
        una Collection de respaldo para almacenar los elementos reales.
        Dicho esto los elementos que contiene esta no son de ella, sino de otra colecction.
        - En algunos casos son modificables y en otros no modificables
     */

    public static void main(String[] args) {

        //Array Inicializado con 3 valores tipo String
        String [] nombres = {"Juan","Manuel", "Sandra"};

        //Lista tipo -Arrays- a partir del array -nombres- al ser .asList No es modificable
        List<String> nombresList = Arrays.asList(nombres);

        //Ciclo foreach para imprimir los valores de la lista -nombreList-
        for(String nombre: nombresList){
            System.out.println(nombre);
        }

        /*
            Juan
            Manuel
            Sandra
         */

        //Modificando el valor en el inidice [1] del arreglo original -nombres-
        nombres [1] = "Yadira";

        System.out.println("\nNombres después de la modificación:");
        for(String nombre: nombresList){
            System.out.println(nombre);
        }

        /*
            -Lista modificada pero a partir del arreglo original-
            Juan
            Yadira
            Sandra
         */

        //Creando una segunda lista a partir del arrays.asList(nombres), solo que esta será de tipo ArrayList
        List <String> nombresList2 = new ArrayList<>(Arrays.asList(nombres));

        System.out.println("\nNombres de la lista número 2");
        for (String nombre: nombresList2){
            System.out.println(nombre);
        }

        //nombresList2.add("Marco"); No permite agregar este dato

        /*
            -Lista modificada, pero a partir de la nueva lista que es un ArrayList
            Juan
            Yadira
            Sandra
         */

        //Método sublist: este metodo permite realizar cambios en la lista 2 pero estos si afectaran la lista original
        System.out.println("\nNombres de la sublista: ");

        List <String> sublista = nombresList2.subList(0,1);
        for (String print: sublista){
            System.out.println(print);
        }

        /*
            -Sublist- Solo muestra a "Juan"

            Juan

         */

        //la Sublista si permite agregar este dato
        sublista.add("Maria");

        //Nombres de la sublista post modificación
        System.out.println("\nNombres de la sublista agregando: ");

        for (String print: sublista){
            System.out.println(print);
        }

        /*
            -Sublist permite agregar-

            Juan
            Maria

         */

        //Modificando la lista 2 de Juan a Jose
        nombresList2.set(0,"Jose");

        //Nombres de la sublista post modificación
        System.out.println("\nNombres de la sublista post modificación : ");

        for (String print: sublista){
            System.out.println(print);
        }

        /*
            Ahora la sublista refleja el cambio que la sublista hizo en la lista original.

            Jose
            Maria
         */

        //Verificando Lista original
        //Nombres de la sublista post modificación
        System.out.println("\nNombres de la lista 2 post cambios : ");

        for (String print: nombresList2){
            System.out.println(print);
        }

        /*
        Nombres de la lista 2 post cambios:

        Jose -modificado
        María - agregado
        Yadira
        Sandra

        */


    }
}

/*
    En conclusion las acciones de add, remove... en las ViewCollection pueden verse
    reflejadas en la Collection original
 */
