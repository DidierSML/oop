package org.example.alghoritms.condicionalesDobles;

import java.util.Scanner;

/*
    Determine si un alumno aprueba o reprueba un curso,
    conociendo sus notas(3) y basandose en el promedio de estas.

    (Input) = nota1, nota2, nota 3

    (Proceso) = promedio

    (Condicion)
    - Si el promedio es > 7 el alumno aprueba, de lo contrario no.
 */
public class PassOrFail {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Calculo de notas para saber si el alumno Arobo o Desaprobo la materia de Filosofia.");

        System.out.println("Ingrese el nombre del alumno: ");
        //(Input)
        String nombre = input.nextLine();

        System.out.println("Ingrese la primera nota parcial: ");
        //(Input)
        int nota1 = input.nextInt();

        System.out.println("Ingrese la segunda nota parcial: ");
        //(Input)
        int nota2 = input.nextInt();

        System.out.println("Ingrese la tercera nota parcial: ");
        //(Input)
        int nota3 = input.nextInt();

        //(Process)
        double promedio = (double) (nota1 + nota2 + nota3) /3;

        //(Constant)
        double notaParametro = 7;

        if (promedio > notaParametro){
            System.out.println("Su promedio es: "+promedio);
            System.out.println( nombre +": usted ha Aprobado");
        }else{
            System.out.println("Su promedio es: "+promedio);
            System.out.println(nombre +": usted ha Reprobado");
        }


    }
}
