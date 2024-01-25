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
        //Cálculo hash interno que generará el código hash y que asignamos a la variable: -hashCodeResult-
        int hashCodeResult = Objects.hash(id, name, email, telephone);
        //Impresión de todos los HashCode generados desde el método
        System.out.println("HashCode: " + hashCodeResult);
        //retorno del código hashCode generado para cada caso
        return hashCodeResult;
    }

    /*
        Generando el Método Equals podemos definir cuales serán los criterios para definir
        si un objeto es igual a otro o no; en este caso los criterios serán sus atributos
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//Comparación si el Obj es igual al otro a nivel de memoria ram
        if (o == null || getClass() != o.getClass()) return false; //Si el obj comparado es null devolvera false  y si no es la misma clase -false
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(email, student.email) && Objects.equals(telephone, student.telephone);
    }

    //El método toString nos permitirá que la impresión de un Objeto sea personalizada o indique su contenido
    //Y no que arroje un valor extraño y sin función alguna
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}

/**
 * Consideraciones Método Equals:
 *
 * El Método Equals debe de ser:
 *  - Reflexivo: En el caso de una referencia "a", a.equals(a) deber de retornar -true
 *  - Simétrico: Dada una referencia a y b, si a.equals(b) retorna true, entonces b.equals(a) debe de retornar true.
 *  - Transitivo: Dadas las referencias a, b y c. sí a.equals(b) devuelve true, y b.equals(c) devuelve true, entonces a.equals(c) debe devolver true.
 *  - Consistente: Dadas las referencias a y b, multiples invocaciones de a.equals(b) deben de retornar siempre true o bien siempre false.
 *
 *  Nota: El métod Hash emplea el método Equals internamente, ya que si se presenta colision
 *        por 2 objetos diferentes con el mismo valor hash generado, este procedera a ubicarlos
 *        luego de comparar igualdades en las linkeList internas de estas.
 *
 *        De igual manera, el método contains de toda Colección usa internamente el método equals
 *        para verificar el contenido a buscar
 *
 *  Nota: Siempre se recomienda implementar el Método Equals y HashCode
 *
 */
