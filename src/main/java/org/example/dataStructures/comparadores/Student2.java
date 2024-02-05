package org.example.dataStructures.comparadores;

import java.util.Objects;

//En esta 2da forma la edad la usamos Con <Integer> para que esta disponga del metodo -compareTo-
public class Student2 implements Comparable <Student2> {

    private int id;
    private String name;
    private Integer age;

    public Student2 (int id,String name, Integer age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //Equals & HashCode - Solo con Id y name

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student2 student)) return false;
        return getId() == student.getId() && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    //La Comparación si quiero que sea por la edad (I) Comparable
    @Override
    public int compareTo(Student2 student) {

        //Dicho esto, usaremos el met. CompareTo a partir de la Edad
        return this.age.compareTo(student.getAge());
        //Dicho esto con el mismo CompareTo de la Clase Integer de Age estaremos generando el orden natural de Comparación

    }

    //toString para impresión de datos con un formato legible


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

