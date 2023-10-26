package org.example.alghoritms.condicionalesCompuestos;

import java.util.Scanner;

/*
    Segun un examen de sangre se determina si una persona tiene anemia o no.
    Esto depende de factores como (nivel de hemoglobina en sangre, edad).

    Si el nivel de hemoglobina es menor al rango (edad - hemoglobina) la persona tiene anemia
 */
public class BloodTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la edad de la persona: ");
        double edad = input.nextDouble();

        System.out.println("Ingrese el procentaje en gramos que figura en el resultado: ");
        double resultado = input.nextDouble();

        if (edad <= 0.1 && resultado > 13 && resultado <= 16){
            System.out.println("usted no tiene anemia.");
        } else if (edad >= 0.6 && edad <= 1 && resultado >= 11 && resultado <= 18 ) {
            System.out.println("usted no tiene anemia");
        } else if (edad > 1 && edad <=5 && resultado >= 11.5 && resultado <= 15 ) {
            System.out.println("usted no tiene anemia");
        } else if (edad > 5 && edad <= 10 && resultado >= 12.6 && resultado <= 15.5){
            System.out.println("usten no tiene anemia");
        }else {
            System.out.println("Usted tiene anemia");
        }
    }
}
