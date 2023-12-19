package org.example.dataStructures.stacks;

import java.util.EmptyStackException;
import java.util.Stack;

public class PruebaStack {

    public static void main(String[] args) {

        Stack <Number> pila = new Stack <>();

        //Agregar elementos usando el método -push-
        pila.push(12l);
        System.out.println("Se agregó a la Pila el valor 12L");
        imprimirPila(pila);

        pila.push(1345678);
        System.out.println("Se agregó a la Pila el valor 345678");
        imprimirPila(pila);

        pila.push(1.0F);
        System.out.println("Se agregó a la Pila el valor 1.0F");
        imprimirPila(pila);

        pila.push(12345.999);
        System.out.println("Se agregó a la Pila el valor 12345.999");
        imprimirPila(pila);

        //Eliminar elementos pila
        try{
            Number objetoEliminado = null;

            //Se van a eliminar los elementos de la Pila 1 x 1 hasta que quede vacia.
            while (true){
                objetoEliminado = pila.pop();
                System.out.println("Se eliminó el objeto " + objetoEliminado);
                imprimirPila(pila);
            }
        }catch (EmptyStackException e){ //Exception que maneja la situación cuando la pila queda vacia
            e.printStackTrace();
        }
    }

    //Método imprimir -Pila-
    private static void imprimirPila(Stack<Number> pila) {
        if(pila.isEmpty()){
            System.out.println("La pila esta vacía");
        }else{
            System.out.println("El elemento superior de la pila es: "+ pila.peek());
            System.out.println("La pila contiene: "+ pila);
        }
    }

}

/*
    Se agregó a la Pila el valor 12L
    El elemento superior de la pila es: 12
    La pila contiene: [12]
    Se agregó a la Pila el valor 345678
    El elemento superior de la pila es: 1345678
    La pila contiene: [12, 1345678]
    Se agregó a la Pila el valor 1.0F
    El elemento superior de la pila es: 1.0
    La pila contiene: [12, 1345678, 1.0]
    Se agregó a la Pila el valor 12345.999
    El elemento superior de la pila es: 12345.999
    La pila contiene: [12, 1345678, 1.0, 12345.999]
    Se eliminó el objeto 12345.999
    El elemento superior de la pila es: 1.0
    La pila contiene: [12, 1345678, 1.0]
    Se eliminó el objeto 1.0
    El elemento superior de la pila es: 1345678
    La pila contiene: [12, 1345678]
    Se eliminó el objeto 1345678
    El elemento superior de la pila es: 12
    La pila contiene: [12]
    Se eliminó el objeto 12
    La pila esta vacía

    java.util.EmptyStackException
	at java.base/java.util.Stack.peek(Stack.java:103)
	at java.base/java.util.Stack.pop(Stack.java:85)
	at org.example.dataStructures.stacks.PruebaStack.main(PruebaStack.java:35)

 */
