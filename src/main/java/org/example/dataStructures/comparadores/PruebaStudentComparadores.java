package org.example.dataStructures.comparadores;

import java.util.ArrayList;
import java.util.Collections;

public class PruebaStudentComparadores {

    public static void main(String[] args) {

        ArrayList <Student> students = new ArrayList<>();

        students.add(new Student(1,"Paco",23));
        students.add(new Student( 2, "Jeremy", 24));
        students.add(new Student( 3, "Liliana", 43));
        students.add(new Student(4, "Maria", 39));
        students.add(new Student(5, "Felicia", 22));
        students.add(new Student(6, "Bernardo", 22));

        System.out.println("______________CompareTo a Partir de la Implementación standard de Comparable___________________");

        //Usando Collections.sort para -orden natural- acuerdo CompareTO
        Collections.sort(students);

        //Imprimiendo la Lista con método referenciado
        students.forEach(System.out::println);
        System.out.println("\n");

        //Usando Collection.sort para un -orden inverso- Gracias a Collection
        Collections.sort(students,Collections.reverseOrder());
        students.forEach(System.out::println);

        System.out.println("\n");
        System.out.println("______________CompareTo a Partir del Integer del atributo age___________________");

        ArrayList <Student2> students2 = new ArrayList<>();

        students2.add(new Student2(1,"Paco",23));
        students2.add(new Student2( 2, "Jeremy", 24));
        students2.add(new Student2( 3, "Liliana", 43));
        students2.add(new Student2(4, "Maria", 39));
        students2.add(new Student2(5, "Felicia", 22));
        students2.add(new Student2(6, "Bernardo", 22));

        //Ordenamiento usando sort
        Collections.sort(students2);
        students2.forEach(System.out::println);


    }

    /*
        ______________CompareTo a Partir de la Implementación standard de Comparable___________________

        Orden Natural:
        Student{name='Felicia', age=22}
        Student{name='Bernardo', age=22}
        Student{name='Paco', age=23}
        Student{name='Jeremy', age=24}
        Student{name='Maria', age=39}
        Student{name='Liliana', age=43}

        Orden Inverso:
        Student{name='Liliana', age=43}
        Student{name='Maria', age=39}
        Student{name='Jeremy', age=24}
        Student{name='Paco', age=23}
        Student{name='Felicia', age=22}
        Student{name='Bernardo', age=22}

        ______________CompareTo a Partir del Integer del atributo age___________________
        Student{name='Felicia', age=22}
        Student{name='Bernardo', age=22}
        Student{name='Paco', age=23}
        Student{name='Jeremy', age=24}
        Student{name='Maria', age=39}
        Student{name='Liliana', age=43}
     */
}
