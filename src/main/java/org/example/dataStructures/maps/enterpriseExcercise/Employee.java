package org.example.dataStructures.maps.enterpriseExcercise;

import java.util.Objects;

/**
 * Clase Normal de Tipo Empleado, que albergará los datos de un empleado
 * que posteriormente será vinculado a una empresa.
 */
public class Employee {

    //Attributes
    private int id;
    private String name;
    private String ss;
    private String enterprise;

    //Constructor with Parameters
    public Employee(int id, String name, String ss, String enterprise){
        this.id = id;
        this.name = name;
        this.ss = ss;
        this.enterprise = enterprise;
    }

    //Getters & Setters

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

    public String getSs() {
        return ss;
    }

    public void setSs(String ss) {
        this.ss = ss;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    //Equals & HashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getId() == employee.getId() && Objects.equals(getName(), employee.getName()) && Objects.equals(getSs(), employee.getSs()) && Objects.equals(getEnterprise(), employee.getEnterprise());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSs(), getEnterprise());
    }


    //ToString


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ss='" + ss + '\'' +
                ", enterprise='" + enterprise + '\'' +
                '}';
    }
}
