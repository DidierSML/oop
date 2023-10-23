package org.example.alghoritms.condicionalesDobles;

import java.util.Scanner;

/*
    Programa de beneficios para los alumnos que obtengan una nota
    mayor o igual a 25 en total.

    En un periodo academico los alumnos tienen 6 calificaciones parciales;
    Donde cada calificacion va de (1-5).

    (Condicion)
    Si el alumno obtiene al final del periodo una calificacion total >= 25
    este obtendrá un descuento del 30% en el pago de su siguiente periodo
    academico, de lo contrario solo obtendrá un 10% de descuento.

    (Input)
    Valor del siguiente periodo Academico

    (?)
    valor descuento segun nota final obtenida,
    valor final a pagar despues de aplicar el descuento.
 */
public class BenefitsForStudents {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Analisis de descuentos por calificaciones para alumnos\n");

        //(Input)
        System.out.println("Ingrese el nombre del alumno: ");
        String nombre = input.nextLine();

        System.out.println("Ingrese la 1ra Nota Parcial obtenida del periodo academico que finalizo: ");
        int primeraNota = input.nextInt();

        System.out.println("Ingrese la 2da Nota Parcial obtenida del periodo academico que finalizo: ");
        int segundaNota = input.nextInt();

        System.out.println("Ingrese la 3ra Nota Parcial obtenida del periodo academico que finalizo: ");
        int terceraNota =input.nextInt();

        System.out.println("Ingrese la 4ta Nota Parcial obtenida del periodo academico que finalizo: ");
        int cuartaNota = input.nextInt();

        System.out.println("Ingrese la 5ta Nota Parcial obtenida del periodo academico que finalizo: ");
        int quintaNota = input.nextInt();

        System.out.println("Ingrese la 6ta Nota Parcial obtenida del periodo academico que finalizo: ");
        int sextaNota = input.nextInt();

        System.out.println("Ingrese el costo del siguiente periodo academico:");
        double costoInicialSiguienteMatricula = input.nextDouble();

        //(Process)
        int notaFinalPeriodo = (primeraNota + segundaNota + terceraNota
                                + cuartaNota + quintaNota + sextaNota);


        if (notaFinalPeriodo >= 25){
            System.out.println("Su nota final en el periodo academico que finalizo fue: " + notaFinalPeriodo);
            System.out.println( nombre + " usted tiene un descuento del 30% " +
                                    "en su matricula para el siguiente periodo academico.");

            System.out.println("Costo inicial siguiente matricula: " + costoInicialSiguienteMatricula );
            double valorFinalMatricula = (costoInicialSiguienteMatricula * 0.70);
            double descuentoAplicado = (costoInicialSiguienteMatricula - valorFinalMatricula);
            System.out.println("Descuento aplicado: " + descuentoAplicado );
            System.out.println("Valor final de la matricula: " + valorFinalMatricula );

        }else{

            System.out.println("Su nota final en el periodo academico que finalizo fue: " + notaFinalPeriodo);
            System.out.println( nombre + " usted tiene un descuento del 10% " +
                    "en su matricula para el siguiente periodo academico.");

            System.out.println("Costo inicial siguiente matricula: " + costoInicialSiguienteMatricula );
            double valorFinalMatricula = (costoInicialSiguienteMatricula * 0.90);
            double descuentoAplicado = (costoInicialSiguienteMatricula - valorFinalMatricula);
            System.out.println("Descuento aplicado: " + descuentoAplicado );
            System.out.println("Valor final de la matricula: " + valorFinalMatricula );

        }
    }
}
