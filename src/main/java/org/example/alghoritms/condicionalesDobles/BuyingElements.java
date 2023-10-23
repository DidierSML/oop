package org.example.alghoritms.condicionalesDobles;

import java.util.Scanner;

/*
    Como empresarios se plantea realizar la compra de varias piezas de una misma clase a
    una fabrica (tornillos). Dependiendo del monto total de la compra se
    decidirá que hacer para pagar al fabricante.

    (Condicion)
    Si el monto total de la compra es > 500.000 la empresa hara lo siguiente:
        - Invertira 50% del capital de la empresa
        - Pedirá prestado a un banco el 30%.
        - Y solicitará crédito del 20% al fabricante para pagar por cuotas.

    Si el monto total de la compra es < 500.000 la empresa hará lo siguiente:
        - Invertirá 70% del capital de la empresa.
        - Pedira prestado a un banco el 25%.
        - Y solicitará credito del 5% al fabricante para pagar por cuotas.

   (?)
   Diseñe un algoritmo que determine el monto propio de la empresa, el monto del
   prestamo y el credito a pedir dependiendo del valor de la compra.
 */
public class BuyingElements {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el Valor total de la compra a realizar a la Ferreteria Colombia:\n");
        //(Input)
        double montoTotal = input.nextDouble();

        //(Constant)
        double valorCondicional = 500000;

        //(Process)
        if (montoTotal > valorCondicional){
            System.out.println("La compra es mayor a 500.000. Esta se pagará de la siguiente forma: ");

            double pagoConCapital = montoTotal * 0.50;
            System.out.println("Pago con capital propio de la empresa: " + pagoConCapital + " equivalente al 50%");
            double pagoConPrestamoBancario = montoTotal * 0.30;
            System.out.println("Pago con prestamo Bancario: "+ pagoConPrestamoBancario + " equivalente al 30%");
            double pagoConCreditoDelFabricante = montoTotal * 0.20;
            System.out.println("Pago con prestamo Bancario: "+ pagoConCreditoDelFabricante + " equivalente al 20%");
        }else {
            System.out.println("La compra se menor a 500.000. Esta se pagará de la siguiente forma: ");

            double pagoConCapital = montoTotal * 0.70;
            System.out.println("Pago con capital propio de la empresa: " + pagoConCapital + " equivalente al 70%");
            double pagoConPrestamoBancario = montoTotal * 0.25;
            System.out.println("Pago con prestamo Bancario: "+ pagoConPrestamoBancario + " equivalente al 25%");
            double pagoConCreditoDelFabricante = montoTotal * 0.05;
            System.out.println("Pago con prestamo Bancario: "+ pagoConCreditoDelFabricante + " equivalente al 5%");
        }

    }
}
