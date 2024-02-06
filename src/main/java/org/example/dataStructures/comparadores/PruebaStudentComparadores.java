package org.example.dataStructures.comparadores;

import java.util.ArrayList;
import java.util.Collections;

public class PruebaStudentComparadores {

    public static void main(String[] args) {

        ArrayList <Student> studentsList1 = new ArrayList<>();

        studentsList1.add(new Student(1,"Paco",23));
        studentsList1.add(new Student( 2, "Jeremy", 24));
        studentsList1.add(new Student( 3, "Liliana", 43));
        studentsList1.add(new Student(4, "Maria", 39));
        studentsList1.add(new Student(5, "Felicia", 22));
        studentsList1.add(new Student(6, "Bernardo", 22));

        System.out.println("______________CompareTo a Partir de la Implementación standard de Comparable___________________");

        //Usando Collections.sort para -orden natural- acuerdo CompareTO
        Collections.sort(studentsList1);

        //Imprimiendo la Lista con método referenciado
        studentsList1.forEach(System.out::println);
        System.out.println("\n");

        //Usando Collection.sort para un -orden inverso- Gracias a Collection
        Collections.sort(studentsList1,Collections.reverseOrder());
        studentsList1.forEach(System.out::println);

        System.out.println("\n");
        System.out.println("______________CompareTo a Partir del Integer del atributo age___________________");

        ArrayList <Student2> studentsList2 = new ArrayList<>();

        studentsList2.add(new Student2(1,"Paco",23));
        studentsList2.add(new Student2( 2, "Jeremy", 24));
        studentsList2.add(new Student2( 3, "Liliana", 43));
        studentsList2.add(new Student2(4, "Maria", 39));
        studentsList2.add(new Student2(5, "Felicia", 22));
        studentsList2.add(new Student2(6, "Bernardo", 22));

        //Ordenamiento usando sort
        Collections.sort(studentsList2);
        studentsList2.forEach(System.out::println);

        System.out.println("______________Comparación Usando (I) Comparator / atributo Age___________________");

        //Comparando mediante compare de la I. Comparator (AgeComparator)
        Collections.sort(studentsList1, new AgeComparator());
        studentsList1.forEach(System.out::println);

        System.out.println("\n");
        System.out.println("______________Comparación Usando (I) Comparator / atributo Nombre___________________");

        //Comparando mediante compare de la I. Comparator (NameComparator)
        Collections.sort(studentsList1, new NameComparator());
        studentsList1.forEach(System.out::println);
        //Aquí podemos ver como la comparación dejo de ser por edad, y paso a ser por nombres

        System.out.println
                ("______________Comparación x / atributo Name - usando Exp. Lambda sin tener que crear una Clase aparte___________________");

        ArrayList <Student2> studentsByName = new ArrayList<>();

        studentsByName.add(new Student2(1,"Paco",23));
        studentsByName.add(new Student2( 2, "Jeremy", 24));
        studentsByName.add(new Student2( 3, "Liliana", 43));
        studentsByName.add(new Student2(4, "Maria", 39));
        studentsByName.add(new Student2(5, "Felicia", 22));
        studentsByName.add(new Student2(6, "Bernardo", 22));


        //En lugar de usar como 2do param. la Clase (NameComparator) usaremos una exp. Lambda
        Collections.sort(studentsByName, (std1, std2) -> std1.getName().compareTo(std2.getName()));
        studentsByName.forEach(System.out::println);
        //Aquí podemos ver como la comparación dejo de ser por edad, y paso a ser por nombres
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


