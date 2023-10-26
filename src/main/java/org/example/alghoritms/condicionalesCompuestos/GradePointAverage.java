package org.example.alghoritms.condicionalesCompuestos;

import java.util.Scanner;

/*
    El promedio de practicas se calcula asi:
    Total practicas (4) de la cuales se elimina la nota inferior y se promedian
    las 3 notas mas altas.
    
    Diseñe un algoritmo que determine la nota eliminada y el promedio de un estudiante.
    
    
 */
public class GradePointAverage {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la primera nota: ");
        double primeraNota = input.nextDouble();
        
        System.out.println("Ingrese la segunda nota: ");
        double segundaNota = input.nextDouble();
        
        System.out.println("Ingrese la tercera nota: ");
        double terceraNota = input.nextDouble();
        
        System.out.println("Ingrese la cuarta nota: ");
        double cuartaNota = input.nextDouble();

        //(Process)
        double notaEliminada = 0;

        double promedioFinal = (primeraNota + segundaNota + terceraNota + cuartaNota - notaEliminada) / 3;
        
        if (primeraNota < segundaNota && primeraNota < terceraNota && primeraNota < cuartaNota){

            System.out.println("Nota eliminada: "+ primeraNota);
            primeraNota = notaEliminada;
            System.out.println("promedio: " + promedioFinal);

        } else if (segundaNota < primeraNota && segundaNota < terceraNota && segundaNota < cuartaNota) {

            System.out.println("Nota eliminada: "+ segundaNota);
            segundaNota = notaEliminada;
            System.out.println("promedio: " + promedioFinal);

        } else if (terceraNota < primeraNota && terceraNota < segundaNota && terceraNota < cuartaNota) {

            System.out.println("Nota eliminada: "+ terceraNota);
            notaEliminada = terceraNota;
            System.out.println("promedio: " + promedioFinal);

        } else if (cuartaNota < primeraNota && cuartaNota < segundaNota && cuartaNota < terceraNota) {

            System.out.println("Nota eliminada: "+ cuartaNota);
            notaEliminada = cuartaNota;
            System.out.println("promedio: " + promedioFinal);
        }
    }
    
    
}

/*
    Esta funcion matematica permite tambien hayar el minimo:
        int notaEliminada = Math.min(Math.min(Math.min(primeraNota, segundaNota), terceraNota), cuartaNota);

 */