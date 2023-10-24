package org.example.alghoritms.condicionalesDobles;

import java.util.Scanner;

/*
    Diseñar un algoritmo que permita emitir una factura correspondiente a una
    compra de un articulo del cual se adquieren varias unidades, lo que sabe
    es que solo tenemos el precio pero sin IGV (18%).

   Si el monto total supera los S/70 entonces aplicamos un descuento del 5% ,de
   lo contrario pagará el total calculado , tener en cuenta incluir el precio +
   IGV

 */
public class IvaAndDiscount {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el valor unitario del elemento a comprar: ");
        double valorUnidad = input.nextDouble();

        System.out.println("Ingrese la cantidad de unidades a comprar: ");
        double cantidadUnidades = input.nextDouble();

        //(Process)
        double valorTotal = (valorUnidad * cantidadUnidades);

        //(Constants)
        double iva = 1.18;
        double valorBase = 70;
        double porcentajeDescuento = 0.05;

        if (valorTotal > valorBase){
            System.out.println("El valor total es de: " + valorTotal);
            double descuento = (valorTotal * porcentajeDescuento);
            System.out.println("Descuento adquirido del 5%, equivalente a: " + descuento);
            double valorConDescuento = (valorTotal - descuento);
            System.out.println("Valor con Descuento: " + valorConDescuento);
            double valorFinalConIva = (valorTotal - descuento) * iva;
            System.out.println("El valor Final a pagar mas el iva del 18% es: " + valorFinalConIva);

        }else{

            System.out.println("El valor total es de: " + valorTotal);
            double valorFinalConIva = (valorTotal * iva);
            System.out.println("El valor Final a pagar mas el iva del 18% es: " + valorFinalConIva);
        }


    }
}
