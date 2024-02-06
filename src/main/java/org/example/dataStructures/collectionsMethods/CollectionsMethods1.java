package org.example.dataStructures.collectionsMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsMethods1 {
    public static void main(String[] args) {

        //Array sencillo
        String[] colores = {"rojo", "verde", "azul", "amarillo"};

        //Lista 1 a la que la pasamos la lista Colores como contenido
        List<String> lista1 = new ArrayList<>(Arrays.asList(colores));

        //Lista 2
        List<String> lista2 = new ArrayList<>();

        //Agregando elementos a la lista2
        lista2.add("blanco");
        lista2.add("rojo");
        lista2.add("morado");
        lista2.add("naranja");
        lista2.add("negro");

        System.out.println("* Antes de (addAll) list2 contiene: ");

        for (String lista : lista2) {
            System.out.println(lista);
        }

        System.out.println("\n");

        System.out.println("* Después de (addAll) list2 contiene: ");

        /*
           Con el método (addAll) agregamos una Lista a otra, siendo el 1er
           argumento, la lista a la que queremos transferirle la otra lista.
         */

        Collections.addAll(lista2,colores);
        for (String print: lista2){
            System.out.println(print);
        }

        /*
            Con el método (frecuency) podemos ver la frecuencia con la que
            en una lista (1er argumento) se repite un elemento (2do argumento)
         */

        int frecuenciaColorRojo = Collections.frequency(lista2,"rojo");
        System.out.println("El Color rojo se repite: " + frecuenciaColorRojo + " veces");

        /*
            Con el método (disjoint) verificamos si entre dos Colecciones hay
            Coincidencias. Si no tienen coincidencias retorna (true) y si sí las
            tiene retorna (false)
         */

        //Usando operador ternario, si no tienen convierte el true en = no tienen,
                                        //si sí tienen convierte el false en= si tienen
        boolean desunion = Collections.disjoint(lista1,lista2);
        System.out.printf("%nlist1 y list2 %s elementos en común%n ", desunion ? "no tienen" : "tienen");
    }


}

/*
    * Antes de (addAll) list2 contiene:
        blanco
        rojo
        morado
        naranja
        negro


    * Después de (addAll) list2 contiene:
        blanco
        rojo
        morado
        naranja
        negro
        rojo
        verde
        azul
        amarillo
        El Color rojo se repite: 2 veces

    list1 y list2 tienen elementos en común
 */

