package org.example.dataStructures.linkedLists;

/**
 * Esta Clase va a representar los (Nodos o elementos) de la
 * Lista Enlazada.
 * Esta contará con 2 atributos:
 * 1. El -dato- que representará el Objeto
 * 2. La referencia -next- que representará el puntero al siguiente nodo
 */
public class Node {

    private Object data;
    private Node next;

    //Constructor para inicializar el -dato-
    public Node(Object data){
        this.data = data;
    }

    //Método que nos devuelve el valor de este -nodo-
    public Object value (){
        return this.data;
    }

    //Método que nos devuelve la referencia al siguiente-nodo- con el que esta enlazado
    public Node next (){
        return this.next;
    }

    //Método que nos permita establecer el nodo con el que va a estar enlazado este -nodo-
    public void setNext (Node next){
        this.next = next;
    }

    //Método que nos imprima el valor por pantalla
    public void showContent(){
        System.out.println("Value: " + data);
    }
}
