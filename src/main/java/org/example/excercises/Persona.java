package org.example.excercises;

public class Persona {

    //Atributos
    private String nombre;
    private int edad;
    private String direccion;

    //Constructor con parametros
    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    //Getter & Setters
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    //Metodo Mostrar Detalles
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Dirección: " + direccion);
    }

    //Metodo ejecutor
    public static void main(String[] args) {
        Persona persona1 = new Persona("Pepe", 15, "Miramar");
        Persona persona2 = new Persona("Paco", 15, "Miramar");
        Persona persona3 = new Persona("Pablo", 15, "Miramar");

        System.out.println("Detalles de la persona 1:");
        persona1.mostrarDetalles();

        System.out.println("\nDetalles de la persona 2:");
        persona2.mostrarDetalles();

        System.out.println("\nDetalles de la persona 3:");
        persona3.mostrarDetalles();

        System.out.println(persona1.nombre + persona1.edad);

        //System.out.println(persona1);
    }
}



