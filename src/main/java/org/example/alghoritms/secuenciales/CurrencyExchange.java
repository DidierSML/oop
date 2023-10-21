package org.example.alghoritms.secuenciales;

import java.util.Scanner;

/*
    Realizar un algoritmo de tipo de cambio de moneda
    sabiendo que 1 dolar es igual a 3,34 soles peruanos.

    input = dolares;
    constant = soles (3.34);
    process = dolares * soles;

 */
public class CurrencyExchange {

     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

         System.out.println("Ingrese la cantidad de USD a convertir en Soles:");
         //Input(datos de entrada)
         double dolaresEntrada = input.nextDouble();

         System.out.println("Ingrese la cantidad de Soles a convertir en Dolares:");
         //Input(datos de entrada)
         double solesEntrada = input.nextDouble();

         //Constant(constante) Equivalencia 1USD 3.34 Soles
         double solesConstante = 3.34;

         //Process(proceso)
         double conversionASoles = (dolaresEntrada * solesConstante);

         //Process(proceso)
         double conversionADolares = (solesEntrada / solesConstante);

         //Output(salida)
         System.out.println(dolaresEntrada + " USD equivale(n) a " + conversionASoles + " Soles");
         System.out.println(solesEntrada + " Soles equivale(n) a " + conversionADolares + " USD");
     }
}
