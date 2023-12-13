package org.example.dataStructures.linkedLists;

public class LinkListApp {

    public static void main(String[] args) {

        ListaEnlazadaSimple list = new ListaEnlazadaSimple();
        list.push(1.23); //valor de nodo
        list.push(10.96); //valor de nodo
        list.push(15.78); //valor de nodo

        list.printContent();

        //Prueba metodo insert después de un valor dado: (10.96) -> 78.25
        Node nodo = list.insert(10.96, 78.25);
        if(nodo == null){
            System.out.println("No se pudo insertar el nuevo nodo");
        }else{
            System.out.println("El nodo se ha insertado correctamente");
        }
        System.out.println("El nuevo contenido de la lista enlazada es: ");
        list.printContent();

        //Prueba método contains

        double valorBuscado = 15.78;
        nodo = list.contains(valorBuscado);

        if (nodo == null){
            System.out.println("El nodo no se encontró en la lista enlazada");
        }
        else{
            System.out.println("El nodo con valor " + valorBuscado + " se encuentra en la lista");
        }

        //Prueba método pop
        System.out.println("Eliminación de nodos");
        while (!list.isEmpty()){
            nodo = list.pop(); //Elimina nodo x nodo mientras itera
            System.out.println("Nodo eliminado");
            nodo.showContent();
        }

        list.printContent();//Muestra al final la lista vacía

        //Nueva inserción de datos

        System.out.println("Nueva inserción de datos:");
        list.push("Cat");
        list.push("Dog");
        list.push("Mouse");

        list.printContent(); //Impresión del contenido

        //Eliminación de nodo x valor
        list.delete("Mouse");
        System.out.println("Lista post eliminación por valor - Mouse");

        list.printContent(); //Impresión del contenido


    }
}

/*
        Mostrar elementos de la Lista Enlazada:
        Value: 15.78
        Value: 10.96
        Value: 1.23

        El nodo se ha insertado correctamente
        El nuevo contenido de la lista enlazada es:
        Mostrar elementos de la Lista Enlazada:
        Value: 15.78
        Value: 10.96
        Value: 78.25
        Value: 1.23

        El nodo con valor 15.78 se encuentra en la lista

        Eliminación de nodos
        Nodo eliminado
        Value: 15.78
        Nodo eliminado
        Value: 10.96
        Nodo eliminado
        Value: 78.25
        Nodo eliminado
        Value: 1.23

        Nueva inserción de datos:
        Mostrar elementos de la Lista Enlazada:
        Value: Mouse
        Value: Dog
        Value: Cat

        Lista post eliminación por valor - Mouse
        Mostrar elementos de la Lista Enlazada:
        Value: Dog
        Value: Cat

 */