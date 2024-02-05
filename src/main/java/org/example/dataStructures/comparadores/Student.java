package org.example.dataStructures.comparadores;

import java.util.Objects;

//Comparable es una (I) Genérica, por lo que voy a establecer Comparación con los elementos <Student>
public class Student implements Comparable<Student> {

    private int id;
    private String name;
    private int age;

    public Student (int id,String name, int age){
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

    public void setAge(int age) {
        this.age = age;
    }

    //Equals & HashCode - Solo con Id y name

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getId() == student.getId() && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    //La Comparación si quiero que sea por la edad (I) Comparable
    @Override
    public int compareTo(Student student) {

        //Nota: esta implementación garantiza un orden natural, si deseo un
        //orden inverso, tendría que modificar los números
        if (this.age == student.getAge()) {

            return 0;
        } else if (this.age > student.getAge()) {
            return 1;
            //return -1(Para orden inverso)
        } else {
            return -1;
            //return 1 (Para orden inverso)
        }

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
