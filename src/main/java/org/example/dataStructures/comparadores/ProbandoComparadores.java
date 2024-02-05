package org.example.dataStructures.comparadores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProbandoComparadores {

    public static void main(String[] args) {

        List <String> nombres = new ArrayList<>();

        nombres.add("Raquel");
        nombres.add("Andrea");
        nombres.add("Lucy");
        nombres.add("Pepe");
        nombres.add("Cristiano");
        nombres.add("Robert");
        nombres.add("Beatriz");

        //Lista Inicial acuerdo Inserción
        System.out.println("nombres = " + nombres + "\n");

        //La Clase Collections viene implícita en los Wrapper (Integer,Double,String...) y permite usar sus métodos
        Collections.sort(nombres);
        System.out.println("nombres ordenados con Sort de la (C) Collections = " + nombres + "\n");

        //Usando el orden a la inversa con el 2do met de ordenamiento de la Clase Collections
        Collections.sort(nombres,Collections.reverseOrder());
        System.out.println("Orden Inverso pasado como 2do argumento (I) Comparator = " + nombres);
    }
}

/*
    OUTPUT: Aplica tanto para Strings como para Enteros

    nombres =
        [Raquel, Andrea, Lucy, Pepe, Cristiano, Robert, Beatriz]

    nombres ordenados con Sort de la (C) Collections =
        [Andrea, Beatriz, Cristiano, Lucy, Pepe, Raquel, Robert]

    Orden Inverso pasado como 2do argumento (I) Comparator =
        [Robert, Raquel, Pepe, Lucy, Cristiano, Beatriz, Andrea]

        Nota: Las (C) Wrapper ya internamente, vienen con la implementación de la (I) Comparable,
              que hace alusión al ordenamiento natural, mientras que la (I) Comparator
              permite usar un ordenamiento personalizado como se vio en el ejemplo.

 */
