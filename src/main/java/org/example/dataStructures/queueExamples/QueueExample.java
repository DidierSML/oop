package org.example.dataStructures.queueExamples;

import java.util.LinkedList;
import java.util.Queue;

/*
    Nota: La (C)-LinkedList- implementa tanto la (I)Queue como la (I)List
 */
public class QueueExample {

    public static void main(String[] args) {

        //Crearemos una LinkedList que empleará los métodos propios de la (I) Queue
        Queue<Integer> queue = new LinkedList<>();

        //Agregamos los elementos {0,1,2,3,4} a la LinkedList que tratamos como Queue
        for (int i = 0; i < 5; i++){
            queue.add(i);
            //también podemos usar = queue.offer(i)
        }

        //Elementos de la Cola como se fueron insertando - queue
        System.out.println("Elementos de la cola: " + queue);

        //Muestra el contenido de la Queue
        System.out.println("Elementos de la LinkedList tratada como Cola o Queue:");
        for(Integer print: queue){
            System.out.println(print);
        }

        //Elominar el head de la queue
        int head = queue.remove();
        //también lo podemos hacer usando: int head = queue.poll();

        //Los elementos siempre se eliminan en el orden de ingreso con las queue.
        System.out.println("El head eliminado de esta cola es: " + head);
        System.out.println("");

        //Ahora al imprimir la Cola podemos ver que el head que era 0 fue eliminado
        System.out.println(queue);

        //El tamaño de la cola es:
        System.out.println("El tamaño de la Cola es: " + queue.size());

        //la Cabeza de la cola ahora es (Inspección):
        System.out.println("La cabeza de la Cola ahora es: " + queue.peek());



    }
}
/*
    Elementos de la cola: [0, 1, 2, 3, 4]

    Elementos de la LinkedList tratada como Cola o Queue:
    0
    1
    2
    3
    4
    El head eliminado de esta cola es: 0

    [1, 2, 3, 4]
    
    El tamaño de la Cola es: 4
    
    La cabeza de la Cola ahora es: 1

 */