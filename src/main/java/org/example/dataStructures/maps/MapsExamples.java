package org.example.dataStructures.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapsExamples {

    public static void main(String[] args) {

        //Creando Mapa tipo HashMap
        Map<String, String> hashMap = new HashMap<>();

        //Creando Mapa tipo LinkedHashMap
        Map<String, String> linkedHashMap = new LinkedHashMap<>();

        //Añadiendo elementos al mapa tipo -hashMap-
        hashMap.put("uno","Andres");
        hashMap.put("dos", "Pepe");
        hashMap.put("tres", "Camilo");
        hashMap.put("cuatro", "Ernesto");
        hashMap.put("cinco", "Ramiro");

        System.out.println("Usando -hashMap-: El orden de inserción depende del hashCode");
        System.out.println("\s");

        //Recorriendo el Mapa tipo -hashMap-
        System.out.println(hashMap);

        System.out.println("\s");

        //Recorriendo -hashMap-
        for(Map.Entry<String, String> entry : hashMap.entrySet()){
            System.out.println("Clave: " + entry.getKey() + " - Valor: " + entry.getValue() );
        }

        //Ahora repliquemos pero en el Map tipo -LinkedHashMap-

        //Añadiendo elementos al mapa tipo -hashMap-
        linkedHashMap.put("uno","Andres");
        linkedHashMap.put("dos", "Pepe");
        linkedHashMap.put("tres", "Camilo");
        linkedHashMap.put("cuatro", "Ernesto");
        linkedHashMap.put("cinco", "Ramiro");

        System.out.println("\s");
        System.out.println("Usando -LinkedhashMap-: Se mantiene el Orden de Inserción");

        //Recorriendo el Mapa tipo -hashMap-
        System.out.println(linkedHashMap);

        System.out.println("\s");

        //Recorriendo -hashMap-
        for(Map.Entry<String, String> entry : linkedHashMap.entrySet()){
            System.out.println("Clave: " + entry.getKey() + " - Valor: " + entry.getValue() );
        }




    }
}

/*
    * Usando -hashMap-: El orden de inserción depende del hashCode, si la Clave es Integer respetará el orden

    {cinco=Ramiro, uno=Andres, dos=Pepe, tres=Camilo, cuatro=Ernesto}

    Clave: cinco - Valor: Ramiro
    Clave: uno - Valor: Andres
    Clave: dos - Valor: Pepe
    Clave: tres - Valor: Camilo
    Clave: cuatro - Valor: Ernesto

    * Usando -LinkedhashMap-: Se mantiene el Orden de Inserción
    {uno=Andres, dos=Pepe, tres=Camilo, cuatro=Ernesto, cinco=Ramiro}

    Clave: uno - Valor: Andres
    Clave: dos - Valor: Pepe
    Clave: tres - Valor: Camilo
    Clave: cuatro - Valor: Ernesto
    Clave: cinco - Valor: Ramiro
 */
