package org.example.dataStructures.queueExamples;

import java.util.PriorityQueue;

/* nuestra Queue tendrá el siguiente orden de inserción:

    [6,9,8,1,5,6,0,11,10,4]

 */
public class PriorityQueueExample {

    public static void main(String[] args) {

        PriorityQueue <Integer> priorityQ = new PriorityQueue<>();

        priorityQ.add(6);
        priorityQ.add(9);
        priorityQ.add(8);
        priorityQ.add(1);
        priorityQ.add(5);
        priorityQ.add(6);
        priorityQ.add(0);
        priorityQ.add(11);
        priorityQ.add(10);
        priorityQ.add(4);

        //Que contiene la Queue - si lo notas contiene los valores pero en desorden
        System.out.println(priorityQ);
        //[0, 4, 1, 9, 5, 8, 6, 11, 10, 6]

        //Ahora vamos a desencolar el 1er elemento (siempre el de mayor prioridad)
        System.out.println("El elemento desencolcado o eliminado fue: " + priorityQ.poll());

        //Ahora la Cola se reajusta y como podemos ver (1 pasa a ser el mayor en prioridad ahora)
        //Y a partir de ahi los nodos se reajustan
        System.out.println(priorityQ);
        //[ 1, 4, 6, 9, 5, 8, 6, 11, 10]

    }
}
