package org.example.algoritms;

import java.util.Scanner;

/*
    Diseñe un algoritmo que permita aplicar un descuento en el supermercado
    de tal forma que permita visualizar el monto a pagar despues de aplicar
    dicho descuento.
 */
public class ApplyingDiscount {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Bienvenida al Supermercado
        System.out.println("Bienvenido al Supermercado - Colombia -");

        System.out.println("Ingrese el valor total de su compra:");
        //input (Dato de entrada)
        double compra = input.nextDouble();

        //input (Dato de entrada)
        System.out.println("Ingrese el valor de su descuento");
        double descuento = input.nextDouble();

        //Proceso:
        double valorFinal = (compra - (compra * descuento) / 100);

        //Output (Salida)
        System.out.println("El valor final a pagar aplicado el descuento es de: "+valorFinal);

    }
}

        /* Esta formula es también válida, ingresando el descuento en decimales.
           Ej: (0,10) que sería igual a 10%, así no se tendría que incluir la / 100

                    double valorFinal2 = (compra - (compra * descuento));
        */