package org.example.dataStructures.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Ejemplo de como funcionan HashSet y LinkedHashSet
 * - Ambas No permiten elementos duplicados
 * - HashSet emplea Internamente un HashMap,por ende, no guarda los elementos en orden
 * - LinkedHashSet emplea Internamente un LinkedHashMap,por ende, guarda los elementos respetando el orden de inserción
 */
public class HashSet_LinkedHasSet {

    public static void main(String[] args) {

        //Colección Set tipo (HashSet)
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Árbol");
        hashSet.add("Montaña");
        hashSet.add("Montaña");//Este elemento repetido no se almacena
        hashSet.add("Océano");
        hashSet.add("Continente");
        hashSet.add("Isla");

        //Al momento de imprimir no se respeta el Orden de Inserción
        System.out.println("hashSet = " + hashSet);

        //Colección Set tipo (LinkedHashSet)
        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Árbol");
        linkedHashSet.add("Montaña");
        linkedHashSet.add("Océano");
        linkedHashSet.add("Océano");;//Este elemento repetido no se almacena
        linkedHashSet.add("Continente");
        linkedHashSet.add("Isla");

        //Al momento de imprimir si se respeta el Orden de Inserción
        System.out.println("linkedHashSet = " + linkedHashSet);

    }
}

/*
    Output:

    hashSet = [Océano, Continente, Montaña, Árbol, Isla]
    linkedHashSet = [Árbol, Montaña, Océano, Continente, Isla]

 */