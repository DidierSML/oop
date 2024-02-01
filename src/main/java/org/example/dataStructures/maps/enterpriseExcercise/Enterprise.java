package org.example.dataStructures.maps.enterpriseExcercise;

import java.util.Objects;

/**
 * Esta Clase albergará datos de Tipo Empresa, en la cual se registrarán
 * los empleados de la Clase Employee.
 */
public class Enterprise {

    //Attributes
    private int id;
    private String name;
    private String sector;

    //Constructor with name as Parameter
    public Enterprise(String name){
        this.name= name;
    }

    //Constructor with All Parameters
    public Enterprise (int id, String name, String sector){
        this.id = id;
        this.name = name;
        this.sector = sector;
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

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    //Equals -> Criterio de Igualdad entre objetos (Si tienen el mismo -name- serán iguales)

    @Override
    public boolean equals(Object o) {

//        if (this == o) return true;
//
//        if (!(o instanceof Enterprise that)) return false;
//        return Objects.equals(getName(), that.getName());

        if (this ==o ){
            return true;
        }
        if(o == null){
            return false;
        }
        if (getClass() != o.getClass()){
            return false;
        }
        final Enterprise other = (Enterprise) o;
        if (!Objects.equals(this.name, other.name)){
            return false;
        }
        return true;
    }

    //HashCode -> Ubicación en la Colección tipo Hash (El parámetro para crear el hashCode será solo el -name-)
    @Override
    public int hashCode() {
        return Objects.hash( getName());
    }

    //ToString
    @Override
    public String toString() {
        return "Enterprise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sector='" + sector + '\'' +
                '}';
    }
}
