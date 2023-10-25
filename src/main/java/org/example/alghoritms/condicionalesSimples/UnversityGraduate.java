package org.example.alghoritms.condicionalesSimples;

import java.util.Scanner;

/*
    Programa que lee el nombre y valor de matricula de un estudiante; si este
    es egresado de la misma universidad recibirá un descuento del 25%.
 */

public class UnversityGraduate {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("""
                Programa que lee si un estudiante es egresado de la universidad,\s
                de serlo, recibira un descuento de 25% en cualquier programa académico.
                """);

        System.out.println("Ingrese el nombre del estudiante:");
        //Input(entrada)
        String nombre = input.nextLine();

        System.out.println("Valor de la matricula del programa a estudiar:");
        //Input(entrada)
        double matricula = input.nextDouble();

        input.nextLine(); //Salto de linea para consumir el siguiente dato de entrada tipo String

        System.out.println("Es egresado de algun programa de la Universidad: SI(S) o No(N)");
        //Input(entrada)
        String confirmeEgreso = input.nextLine();

        //Constant(constante)
        double descuentoEgresado = 0.75;

        double descuentoAplicado = (matricula * descuentoEgresado);

        //Process (Proceso)
        if(confirmeEgreso.equals("S")){
            System.out.println("El programa seleccionado a estudiar tiene un descuento del 25%");
            System.out.println(nombre + " el valor final de su matricula es: " + descuentoAplicado);
        }
    }


}

/*
    Otra manera aplicar el dcto del 25% al egresado en un nuevo programa de estudio es:

        valorADescontar = (matricula * 0.25)
        ValorFinalMatricula = (matricula - valorADescontar)

        o
            valorADescontar = ((matricula * 25) / 100))
            ValorFinalMatricula = (matricula - valorADescontar)

 */
