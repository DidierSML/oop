package org.example.alghoritms.condicionalesDobles;

import java.util.Scanner;

/*
    Una persona es apta para prestar el servicio militar si:
    Es de Genero Masculino y tiene entre 18 - 25 años.
    - Realizar un algoritmo que permita determinar si la persona es apta o no
      para el servicio militar.

    - (Input) = ingrese el genero, ingrese la edad.
    -(apto o no) = ?

 */
public class MilitarService {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Aptitud de Servicio Militar:");

        System.out.println("Ingrese el Nombre de la Persona:");
        //(Input)
        String nombre = input.nextLine();

        System.out.println("Ingrese el Genero de la Persona:");
        //(Input)
        String genero = input.nextLine();

        System.out.println("Ingrese la edad de la persona:");
        //(Input)
        int edad = input.nextInt();

        //(Process)
        if (genero.equals(("M")) && edad >17 && edad <26){
            System.out.println( nombre +" usted es apto(a) para prestar el servicio Militar");
        }else{
            System.out.println("Lo sentimos, " + nombre +" usted no cumple con los requisitos para prestar el servicio militar");
        }
    }
}
