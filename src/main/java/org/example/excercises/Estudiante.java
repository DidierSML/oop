package org.example.excercises;

public class Estudiante extends Persona{


    public Estudiante(String nombre, int edad, String direccion) {
        super(nombre, edad, direccion);
    }


    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Paco", 18, "La loma");
        estudiante1.mostrarDetalles();
        estudiante1.setNombre("Pipe");

        estudiante1.mostrarDetalles();


        Estudiante estudiante2 = new Estudiante("lulo", 28, "ITalia");
        System.out.println(estudiante2.getDireccion());


    }
}
