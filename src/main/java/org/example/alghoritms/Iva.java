package org.example.alghoritms;

import java.util.Scanner;

/*
    Diseñe un algoritmo que lea por consola el valor de una factura,
    en este caso aplique un IVA del 18%.

    input: valor de la factura
    process: valor de la factura * 1.18
    output: valor de la factura más iva
 */
public class Iva {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el valor de la factura para añadirle el IVA");
        //input(datos de entrada)
        double factura = input.nextDouble();

        //Constant(constante)
        double iva = 1.18;

        //Process(proceso)
        double totalConIva = (factura * iva);

        //Output(output)
        System.out.println("La Factura con el IVA incluido tiene un valor total de: " + totalConIva);


    }
}

 /*
    El calculo suma inmediatamente el iva a la factura, aunque tambien pudimos
    hacerlo así:

        double iva = 0,18;
        double factura = input.nextDouble();

        double valorIvaASumar = (factura * iva);
        double totalConIva = (factura + valorIvaASumar)

        sout(valorIvaASumar);
        sout(totalConIva);
 */
