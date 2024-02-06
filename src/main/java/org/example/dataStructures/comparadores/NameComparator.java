package org.example.dataStructures.comparadores;

import java.util.Comparator;

/**
 * Clase que Implementa (I) Comparator
 *
 * Definiendo que vamos a Comparar objetos de tipo <Student>
 * a través de su argumento (Name) posteriormente implementamos
 * el único método abstracto que tiene. -> compare
 */
public class NameComparator implements Comparator <Student> {
    @Override
    public int compare(Student std1, Student std2) {
        //Aquí al ser un String se apoya en la I. Comparable que utiliza la C. Wrapper
        return std1.getName().compareTo(std2.getName());
    }
}
