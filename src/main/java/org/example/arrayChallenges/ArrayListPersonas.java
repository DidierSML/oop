package org.example.arrayChallenges;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPersonas {

    public static void main(String[] args) {

        /*  Creamos una lista "List" llamada "lista"
            y será de tipo "Arraylist" y guardará Objetos tipo -Persona-
        */

        List<Persona> lista = new ArrayList<>(); //Lista creada

        //Agregando objetos a la lista a traves del metodo add
        lista.add(new Persona(1, "Luisina", 30));
        lista.add(new Persona(2, "Mauro", 29));
        lista.add(new Persona(3, "Didier", 33));
        lista.add(new Persona(4, "Joha", 36));
        lista.add(new Persona(5, "Ericka", 31));

        System.out.println("__________________FOR___________________");
        //recorriendo la lista por indice - 0,1,2,3,4,

        for (int i=0; i<lista.size();i++){
            System.out.println("prueba: " + lista.get(i).getNombre() + ", edad: " + lista.get(i).getEdad());
        }

        System.out.println("__________________FOREACH_______________");

        //recorrido foreach - Recorre elemento por elemento
        for (Persona perso:lista){ //por cada (C)Persona (O)(perso) en la "lista" creada
            System.out.println("prueba: " + perso.getNombre()); //traigame el nombre de la persona
        }

    }

}

 class Persona {
    private int num; //Atributo 1
    private String nombre; // Atributo 2
    private int edad; // Atributo 3

    public Persona() { //Constructor vacio
    }
    public Persona(int num, String nombre, int edad) { //Constructor con parámetros
        this.num = num;
        this.nombre = nombre;
        this.edad = edad;
    }

    //getters y setters
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
