package org.example.dataStructures.queueExamples;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class StringPriorityQueue {

    public static void main(String[] args) {

        Queue <String> queue = new PriorityQueue<>();

        //Añadimos items de tipo Sting
        queue.add("Java");
        queue.add("C");
        queue.add("C++");
        queue.add("C#");
        queue.add("Python");

        //Mostramos (sin eliminar) el elemento que tiene la mayor prioridad
        System.out.println("El elemento del Head de esta PriorityQueue es: " + queue.peek());
        //Aquí veremos como la prioridad la tiene: "C", ya que la (C) String implementa (I) Comparable y se ordena alfabéticamente

        //Aquí eliminamos a "C" como elemento de mayor prioridad
        System.out.println("Removiendo el elemento de mayor prioridad: ");
        String elementoDesencolado = queue.poll();
        //Recuerda que con poll podemos tomar este elemento eliminado y asignarlo a otra tarea

        //Ahora realizamos la impresión de la -queue- para ver como quedó
        System.out.println("El elemento del Head de esta PriorityQueue es: " + queue);
        //Podemos ver que "C" ya no existe: [C#, Java, C++, Python]

        //Ahora haremos lo mismo que antes pero usando Iterator
        System.out.println("El elemento del Head de esta PriorityQueue es - usando Iterator: ");
        Iterator <String> iterando = queue.iterator();
        while (iterando.hasNext()){
            System.out.println(iterando.next());
        }

        /*
            C#
            Java
            C++
            Python
        */

        //Imprimiendo con un for
        for (String printing : queue) {
            System.out.println(printing);
        }

        //Imprimiendo la Cola con método referenciado
        System.out.println("Imprimiendo la cola con método referenciado: ");
        queue.forEach(System.out::println);

        // Ahora vamos a mostrar quien tiene la prioridad posterior al cambio
        System.out.println("El elemento del Head que tiene ahora la prioridad es: " + queue.peek());


        //Eliminando un elemento específico de la cola usando -remove-
        queue.remove("Java");
        System.out.println("Eliminando un objeto específico usando el método -remove-");
        queue.forEach(System.out::println);
        /*
            C#
            Python
            C++
        */

        //usando el método contains para verificar si el objeto esta o no en la cola
        boolean existeEnLaCola = queue.contains("Java");
        System.out.println("Existe el elemento -Java- en la Cola?: " + existeEnLaCola );

        //
    }
}
