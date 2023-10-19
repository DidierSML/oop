package org.example.alghoritms;

import java.util.Scanner;

/*
    En un salon de clase nos piden diseñar un algoritmo que permita
    determinar el porcentaje de varones y el porcentaje de mujeres.

    (input)
    hombres: 78, mujeres: 43
    total: 121

 */
public class PercentageOfMalesAndFemales {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de Hombres del salon:");
        //input(dato de entrada)
        int hombres = input.nextInt();

        System.out.println("Ingrese la cantidad de mujeres del salon:");
        //input(dato de entrada)
        int mujeres = input.nextInt();

        //Process(Proceso)
        int total = hombres + mujeres;

        int porcentajeHombres = hombres * 100 / total;
        int porcentajeMujeres = mujeres * 100 / total;

        //Output(salida)
        System.out.println("El Porcentaje de hombres es de:" + porcentajeHombres + "%");
        System.out.println("El Porcentaje de mujeres es de:" + porcentajeMujeres + "%");



    }
}

        /*
            Solución: Regla de 3

                 Total (121)    -   100 (% Global)
                hombres (78)    -    x  (% hombres)

                x  (% hombres) = (hombres (78)  *  100 (% Global)) = 7800
                                            Total (121)            =  121


                        (7800) / (121) = 64.46 (% hombres)
        */
