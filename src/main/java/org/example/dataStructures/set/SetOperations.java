package org.example.dataStructures.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *  Union= Suma ambos Conjuntos y elimina los duplicados (addAll)
 *  Intersección = Obtiene los elementos en común de ambos Conjuntos (retainAll)
 *  Diferencia = Elimina los Elementos en Común de cada conjunto (removeAll)
 */
public class SetOperations {

    public static void main(String[] args) {

        //Conjunto A tipo HashSet
        Set<Integer> conjuntoA =
                new HashSet<>(Arrays.asList(0,1,2,3,4,5,9));

        //Mostrar -Conjunto A-
        System.out.println("conjuntoA = " + conjuntoA);

        //Conjunto B tipo HashSet
        Set<Integer> conjuntoB =
                new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8));

        //Mostrar -Conjunto B-
        System.out.println("conjuntoB = " + conjuntoB + "\n");

        // Union
        Set<Integer> union = new HashSet<>(conjuntoA);
        union.addAll(conjuntoB);
        System.out.println("union de conjuntos= " + union);

        System.out.println("\s");

        //Intersección
        Set <Integer> intersection = new HashSet<>(conjuntoA);
        intersection.retainAll(conjuntoB);
        System.out.println("intersection de Conjuntos = " + intersection);

        System.out.println("\s");

        //Diferencia
        Set <Integer> diferencia = new HashSet<>(conjuntoA);
        diferencia.removeAll(conjuntoB);
        System.out.println("diferencia de Conjuntos = " + diferencia);

    }
}

/*
    Output:
    conjuntoA = [0, 1, 2, 3, 4, 5, 9]
    conjuntoB = [1, 2, 3, 4, 5, 6, 7, 8]

    union de conjuntos= [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

    intersection de Conjuntos = [1, 2, 3, 4, 5]

    diferencia de Conjuntos = [0, 9]
 */