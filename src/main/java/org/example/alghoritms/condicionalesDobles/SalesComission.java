package org.example.alghoritms.condicionalesDobles;

import java.util.Scanner;

/*

Una empresa desea conocer el monto de comisión correspondiente a una venta realizada
por un vendedor bajo las siguientes condiciones:
Si la venta es menor a $1000 se le otorga el 3% de comisión al vendedor.
Si la venta es de $1000 a mas el vendedor recibirá el 5% de comisión.

    (Input) = valorVentaRealizada

    (Condicion) = Si la valorVentaRealizada > 1000, el Vendedor Comisiona 5% de la venta.
    (Condicion) = Si la valorVentaRealizada < 1000, el Vendedor Comisiona 3% de la venta.

    (?) = valorComisionVendedor
 */
public class SalesComission {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el nombre del Vendedor: ");
        String nombre = input.nextLine();

        System.out.println("Ingrese el valor de la Venta que realizo: ");
        double valorVentaRealizada = input.nextDouble();

        //(Constant)
        double valorBaseVentas = 1000;

        //(Process)
        if (valorVentaRealizada > valorBaseVentas){
            double valorComisionVendedor = valorVentaRealizada * 0.05;
            System.out.println(nombre + " haz ganado el 5% de la venta por comision, el cual es: " + valorComisionVendedor);
        } else if (valorVentaRealizada <= valorBaseVentas) {
            double valorComisionVendedor = valorVentaRealizada * 0.03;
            System.out.println(nombre + " haz ganado el 3% de la venta por comision, el cual es: " + valorComisionVendedor);
        }
    }
}
