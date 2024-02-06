package org.example.dataStructures.comparadores;

import java.util.Comparator;

/**
 * Clase que Implementa (I) Comparator
 * Definiendo que vamos a Comparar objetos de tipo <Student>
 * a través de su argumento (Age) posteriormente implementamos
 * el único método abstracto que tiene. -> compare
 */
public class AgeComparator implements Comparator <Student> {
    @Override
    public int compare(Student std1, Student std2) {
        if(std1.getAge() == std2.getAge()){
            return 0;
        }else if(std1.getAge() > std2.getAge()){
            return -1;
        }else{
            return 1;
        }
        //Implementación con Comparator que aplicará el orden Inverso
    }
}
