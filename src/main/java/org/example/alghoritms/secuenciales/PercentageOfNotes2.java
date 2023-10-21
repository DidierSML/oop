package org.example.alghoritms.secuenciales;

import java.util.Scanner;

/*
  Un alumno desea saber cual será su calificación final en la materia de Matemáticas,
  dicha calificación se compone por 3 porcentajes , a su vez cada porcentaje tiene
  cierta cantidad de notas, primero diremos los siguiente:

  - La nota de los 3 primeros exámenes parciales tiene un peso de 55%.
  - La nota del examen final tiene un peso de 30%.
  - La nota del trabajo final tiene un peso de 15%.
  - Hallar la calificación final de todas notas

  input = nota1, nota2, nota3, notaExamenFinal, notaTrabajoFinal.

  calificaciónFinal = ?


 */
public class PercentageOfNotes2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Input(datos de entrada)
        System.out.println("Ingrese la nota del examen parcial 1:");
        double examenParcial1 = input.nextDouble();

        //Input(datos de entrada)
        System.out.println("Ingrese la nota del examen parcial 2:");
        double examenParcial2 = input.nextDouble();

        //Input(datos de entrada)
        System.out.println("Ingrese la nota del examen parcial 3:");
        double examenParcial3 = input.nextDouble();

        //Input(datos de entrada)
        System.out.println("Ingrese la nota del examen Final:");
        double examenFinal = input.nextDouble();

        //Input(datos de entrada)
        System.out.println("Ingrese la nota del Trabajo Final:");
        double trabajoFinal = input.nextDouble();

        //Constants(Constantes)
        double valorPorcentualExamenParciales = 0.18;
        double valorPorcentualExamenFinal = 0.30;
        double valorPorcentualTrabajoFinal = 0.15;

        //Process(Proceso)
        double notaFinalExamenesParciales = (examenParcial1 * valorPorcentualExamenParciales) +
                                                (examenParcial2 * valorPorcentualExamenParciales) +
                                                    (examenParcial3 * valorPorcentualExamenParciales);

        double notaFinalExamenFinal = (examenFinal * valorPorcentualExamenFinal);

        double notaFinalTrabajoFinal = (trabajoFinal * valorPorcentualTrabajoFinal);

        double calificacionFinalGeneral = (notaFinalExamenesParciales + notaFinalExamenFinal + notaFinalTrabajoFinal);

        //Output(salida)
        System.out.println("La nota Final despues es igual a :" + calificacionFinalGeneral);


    }
}

/*
    Tambien en el caso de las notas parciales se pudo haber usado:

        ((np1 + np2 + np3) / 3) * 0.55
 */
