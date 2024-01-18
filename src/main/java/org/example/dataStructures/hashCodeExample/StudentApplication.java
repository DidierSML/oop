package org.example.dataStructures.hashCodeExample;

import java.util.HashMap;
import java.util.Map;

public class StudentApplication {

    public static void main(String[] args) {

        //Creando la Tabla HashMap llamada -students-
        Map <Student,Student> students = new HashMap<>();

        //Creando Objetos tipo -students-
        Student student1 = new Student(1, "Jerry", "jerry@gmail.com", "1234567891");
        Student student2 = new Student(2, "Carlos", "carlos@gmail.com", "2234567892");
        Student student3 = new Student(3, "Pepe", "pepe@gmail.com", "3234567893");
        Student student4 = new Student(4, "Julio", "julio@gmail.com", "4234567894");

        //Agregando students creados a la Tabla HashMap llamada -students-
        students.put(student1,student1);
        students.put(student2,student2);
        students.put(student3,student3);
        students.put(student4,student4);

        //Imprimiendo HashCode student1
        //  System.out.println("hashcode de student1: " + student1.hashCode()); //Método hash proporcionado por la (C)Object
        //hashcode de student1: 950721611
    }
}
