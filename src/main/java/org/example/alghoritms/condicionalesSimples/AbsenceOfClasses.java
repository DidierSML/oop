package org.example.alghoritms.condicionalesSimples;

import java.util.Scanner;

public class AbsenceOfClasses {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese los datos del alumno para saber si sus inasistencias fueron " +
                "\nsuperiores al 20% en relacion a las clases del semestre");


        System.out.println("Ingrese el nombre del alumno");
        //Input(entrada)
        String nombre = input.nextLine();

        System.out.println("Ingrese el nombre la Asignatura");
        //Input(entrada)
        String Asignatura = input.nextLine();

        System.out.println("Ingrese la nota del alumno");
        //Input(entrada)
        double nota = input.nextDouble();

        System.out.println("Ingrese el numero de clases del semestre");
        //Input(entrada)
        int clasesSemestre = input.nextInt();

        System.out.println("Ingrese el numero de inasistencias del semestre");
        //Input(entrada)
        int inasistencias = input.nextInt();

        //Calculo
        int porcentajeInasistencias = (inasistencias * 100) / clasesSemestre;

        if (porcentajeInasistencias >= 20){
            System.out.println("El alumno Reprobo, tuvo un porcentaje de inasistencias mayores al 20% ");
        }

    }
}

/*
    Otra alternativa para el calculo es la siguiente:

        int porcentajeInasistencias = (inasistencias/clasesSemestre);

        if (porcentajeInasistencias >= 0.20){
            System.out.println("El alumno Reprobo, tuvo un porcentaje de inasistencias mayores al 20% ");
        }
 */
