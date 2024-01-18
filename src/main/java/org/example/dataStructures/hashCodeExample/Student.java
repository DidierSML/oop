package org.example.dataStructures.hashCodeExample;

import java.util.Objects;

public class Student {

    //Atributos
    private int id;
    private String name;
    private String email;
    private String telephone;

    //Constructor con todos los parámetros generados
    public Student (int id, String name, String email, String telephone){
        this.id = id;
        this.name = name;
        this.email = email;
        this.telephone = telephone;
    }

    //Getters & Setters Generados
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    //HashCode generado
    @Override
    public int hashCode() {
        //Calculo hash interno que generará el codigo hash y que asignamos a la var: -hashCodeResult-
        int hashCodeResult = Objects.hash(id, name, email, telephone);
        //Impresión de todos los HashCode generados desde el método
        System.out.println("HashCode: " + hashCodeResult);
        //retorno del código hashCode generado para cada caso
        return hashCodeResult;
    }

    /*
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return id == student.id && Objects.equals(name, student.name) && Objects.equals(email, student.email) && Objects.equals(telephone, student.telephone);
        }
     */
}
