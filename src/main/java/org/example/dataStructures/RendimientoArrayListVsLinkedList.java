package org.example.dataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RendimientoArrayListVsLinkedList {

    public static void main(String[] args) {

        List<Person> listaArray = new ArrayList<>();
        List <Person> listaLinkedList = new LinkedList<>();
        long antes;//var

        //Ciclo que itera 1M de veces y sobre esa iteración añade -Person- a ambas listas
        for (int i = 0; i < 1000000; i++){
            listaArray.add(new Person(i,"Persona"+i,i));
            listaLinkedList.add(new Person(i,"Persona"+i,i));
        }

        System.out.println("Tiempo invertido en insertar una persona en listaArray (en nanonsegundos:");
        antes = System.nanoTime();//variable tiempo actual en nanosegundos
        listaArray.add(1000000, new Person(10001, "Persona",1001)); //Agregamos un nuevo Objeto - Person - en una posición index (x)
        System.out.println(System.nanoTime()-antes); //Calculamos el tiempo que nos tomó hacer esta acción

        System.out.println("Tiempo invertido en insertar una persona en listaLinkedList (en nanonsegundos:");
        antes = System.nanoTime();//variable tiempo actual en nanosegundos
        listaLinkedList.add(1000000, new Person(10001, "Persona",1001)); //Agregamos un nuevo Objeto - Person - en una posición index (x)
        System.out.println(System.nanoTime()-antes); //Calculamos el tiempo que nos tomó hacer esta acción

    }



    static class Person{

        int idPerson;
        String nombre;
        int altura;

        //Clase estática Interna con su Constructor
        public Person(int idPerson, String nombre, int altura) {
            this.idPerson = idPerson;
            this.nombre = nombre;
            this.altura = altura;
        }
    }
}

/*
    Nota: Realizando las pruebas podemos notar que en materia de busqueda es más rápido -ArrayList
          Sin embargo, si lo que queremos es agilidad al ingresar o remover datos al inicio o al fin
          de una Lista, LinkedList es más eficiente, pues aunque no es tan rápida en búsqueda, si que lo
          es reacomodando los nodos simplemente reubicando sus punteros.

          No obstante, cuando la insercion la vamos a hacer mas o menos en la mitad del array, ArrayList se
          vuelve más eficiente pues no tarda tanto en llegar a dicho indice como lo hace LinkedList que va
          elemento por elemento.

          Usar alguna de las dos es algo subjetivo
 */

