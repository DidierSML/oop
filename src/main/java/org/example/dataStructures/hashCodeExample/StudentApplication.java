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

        //Probando si ambos son objetos iguales o no.
        Student test1 = new Student(10, "Elias", "elias@gmail.com", "9876543211");
        Student test2 = new Student(10, "Elias", "elias@gmail.com", "9876543211");

        //Impresión post comparación
        System.out.println("El objeto " + test1 + " es igual al objeto " + test2 + " ? : " + test1.equals(test2) );

        //Imprimiendo HashCode student1
        //  System.out.println("hashcode de student1: " + student1.hashCode()); //Método hash proporcionado por la (C)Object
        //hashcode de student1: 950721611
    }
}

/*

    HashCode: 950721611
    HashCode: -1036347446
    HashCode: 956356873
    HashCode: -747272472

    El objeto Student{id=10, name='Elias', email='elias@gmail.com', telephone='9876543211'} es igual al objeto Student{id=10, name='Elias', email='elias@gmail.com', telephone='9876543211'} ? : true


 */
