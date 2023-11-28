package org.example.dataStructures;

import java.util.*;

/**
 * Los Genericos de las Collections <E> nos permite delimitar que tipo de dato
 * queremos almacenar en nuestro Coleccion, y esta puede ser por ejemplo:
 *  String, int ..
 *  entre otras.

 * Collection <E> = Collection <String>


 * Si bien podemos usar inmediatamente la (I) Collection es buena práctica, delimitar
 * el tipo exacto de Coleccion que vamos a usar al momento de inicializar la colección
 * en mención:

 *      Ej: Collection de tipo ArrayList
 */
public class ColeccionesGenericos {

    public static void main(String[] args) {

        Collection <String> nombres = new ArrayList<>();

        nombres.add("Juan");

        //Cola - Queue (FIFO)
        Queue <PersonaLista> colaTipoLista = new LinkedList<>();

        // Crear una instancia de PersonaLista
        PersonaLista persona1 = new PersonaLista(23, "Merry");
        persona1.setEdad(25);
        persona1.setNombre("Juana"); //Modificando a Merry, ahora es Juana

        // Agregar la persona a la cola
        colaTipoLista.offer(persona1); //Agregando a Juana a la cola

        //Agregando otra persona
        PersonaLista persona2 = new PersonaLista(24, "Karen");

        // Otra forma de agregar (puedes usar add() también) - agregando a Karen a la Cola
        colaTipoLista.add(persona2);

        //Agregando usando offer
        colaTipoLista.offer(new PersonaLista(18,"Jenny"));
        colaTipoLista.offer(new PersonaLista(33,"Magda"));

        //Imprimiendo
        for(PersonaLista imprimiendo : colaTipoLista){
            System.out.println("Nombre: " + imprimiendo.getNombre() + ", Edad: " + imprimiendo.getEdad());
        }
        //Esta implementación me permitirá usar métodos tanto de Collection como de Queue,
        //no es una buena práctica, pero se puede hacer.

    }

    static class PersonaLista {

        private int edad;
        private String nombre;

        public PersonaLista(int edad, String nombre) {
            this.edad = edad;
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }



    }
}
