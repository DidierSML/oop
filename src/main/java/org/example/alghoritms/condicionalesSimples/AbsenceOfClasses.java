package org.example.alghoritms.condicionalesSimples;

import java.util.Scanner;

/*
    Diseñe un algoritmo que capture:

    - input
    (nombre del estudiante, nombre del curso, nota definitiva,
     numero de clases semestre, numero de clases ausentes).

     Si las ausencias son superiores al 20% al numero de clases en
     el semestre, debe mostrar nota desaprobatoria igual a 0.

     Clases semestres = 100%
     Clases ausencia = X

 */
public class AbsenceOfClasses {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Sistema que verifica si un estudiante reprobo por inasistencias " +
                "\ndel semestre superiores al 20% :");

        System.out.println("Ingrese el nombre del alumno:");
        //Input(dato de entrada)
        String nombre = input.nextLine();

        System.out.println("Ingrese el nombre del curso:");
        //Input(dato de entrada)
        String nombreDelCurso = input.nextLine();

        System.out.println("Ingrese la nota definitiva:");
        //Input(dato de entrada)
        double notaDefinitiva = input.nextDouble();

        System.out.println("Ingrese el numero de clases del semestre:");
        //Input(dato de entrada)
        int numeroDeClasesSemestre = input.nextInt();

        System.out.println("Ingrese el numero de inasistencias del alumno:");
        //Input(dato de entrada)
        int ausenciasEnElSemestre = input.nextInt();

        //Calculo
        int porcentajeAsistencia = (ausenciasEnElSemestre * 100) / numeroDeClasesSemestre;

        if (porcentajeAsistencia >= 20){
            System.out.println("El alumno reprobo por inasistencia superior al 20% \nNota Final = 0");
        }

    }
}

/*
    Otra manera de calcularlo seria la siguiente:

        int porcentajeAsistencias = (ausenciasEnElSemestre / numeroDeClasesSemestre)

        if (porcentajeAsistencias >= 0,20 ){
            sout("El alumno reprobo por insasitencias superiores al 20%);
        }

 */
