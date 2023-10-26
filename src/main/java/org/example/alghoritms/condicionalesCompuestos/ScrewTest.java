package org.example.alghoritms.condicionalesCompuestos;

import java.util.Scanner;

/*
    Diseñe un algoritmo para obtener el grado de eficiencia
    de un operario, de acuerdo a las siguientes condiciones:

    - Si el operario produce menos de 300 tornillos, grado de eficiencia 1.
    - Si el operario produce menos de 1000 tornillos, grado de eficiencia 2.
    - Si el operario produce mas de 1000 tornillos, grado de eficiencia 3.
 */
public class ScrewTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el numero de tornillos producidos por el operario.");
        int numeroTornillos = input.nextInt();

        //(Process)
        if (numeroTornillos <= 300){
            System.out.println("El operario es de grado 1");
        } else if (numeroTornillos <= 1000) {
            System.out.println("El operario es de grado 2");
        } else {
            System.out.println("El operario es de grado 3");
        }

    }
}
