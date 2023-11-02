package org.example.alghoritms.whileExercises;

import java.util.Scanner;

/*
    En una empresa trabajan “n” empleados cuyos sueldos oscilan entre $100 y $500,
    realizar un algoritmo que lea los sueldos que cobra cada empleado e informe
    cuántos empleados cobran entre $100 y $300 y cuántos cobran más de $300.
    Además el programa deberá informar el importe que gasta la empresa en sueldos
    al personal.

    (Constantes) = sueldos
 */
public class EmployeesOfACompany {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //(Constants)
        int sueldoMin = 100;
        int sueldoMax = 500;
        int importe = 0;
        int contador = 1;
        int cobranMenos = 0;
        int cobranMas = 0;

        System.out.println("Ingrese el numero de empleados que tiene la empresa: ");
        int empleados = input.nextInt();

        while(contador <= empleados){

            System.out.println("A continuacion ingrese el sueldo del trabajador");
            int sueldo = input.nextInt();

            if (sueldo >= sueldoMin && sueldo <= sueldoMax ){

                if (sueldo > 300){
                    cobranMas++;
                } else {
                    cobranMenos++;
                }

                importe = importe + sueldo;

            }else {
                System.out.println("El sueldo ingresado esta fuera del rango.");
                break;
            }
            contador++;
        }

        System.out.println("Empleados que cobran entre (100 - 300):" + cobranMenos);
        System.out.println("Empleados que cobran (mas de 300): " + cobranMas);
        System.out.println("Total gasto de la empresa en sueldos: " + importe);
    }
}
