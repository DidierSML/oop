package org.example.algoritms;

import java.util.Scanner;

/*
    Determine el area y volumen de un cilindro, aplicando un radio
    ingresando su valor por teclado y tambien su altura.

    input: radio(r), altura(h)
    area:?, volumen:?
 */

public class AreaAndVolumeOfACylinder {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el radio del Cilindro:");
        //input(datos de entrada)
        double radio = input.nextDouble();


        System.out.println("Ingrese la altura del Cilindro:");
        //input(datos de entrada)
        double altura = input.nextDouble();

        //Constant(constante)
        double pi = 3.14159;

        //Process(proceso)
        double volumen = (pi * (radio * radio)) * altura;
        double  areaSuperficieLateral = (2 * pi * radio * altura);
        double areaTotal = (2 * pi * radio * (radio + altura));

        //(output)salida
        System.out.println("El Volumen del Cilindro es: " + volumen +
                "\nEl Area de la Superficie lateral es: "+ areaSuperficieLateral +
                "\nEl Area Total es: " + areaTotal);
    }
}
