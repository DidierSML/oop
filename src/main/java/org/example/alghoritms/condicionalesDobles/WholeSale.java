package org.example.alghoritms.condicionalesDobles;

import java.util.Scanner;

/*
    Una tienda ofrece un descuento a quienes compren más de 3 docenas
    de sus productos (36). Siendo estos los respectivos descuentos:

    (Condicion)
    - Si se compran > 3 docenas (36 unidades) = descuento del 15%
    - Si se compran < 3 docenas (36 unidades) = descuento del 10%

    (?)
    Diseñe un algoritmo que determine:
        - el monto de la compra.
        - el monto del descuento.
        - el monto a pagar.
 */
public class WholeSale {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el costo por unidad del producto seleccionado: ");
        //(Input)
        double valorUnidadProducto = input.nextDouble();

        System.out.println("Ingrese la Cantidad de unidades que va a comprar del producto: ");
        //(Input)
        int cantidadUnidades = input.nextInt();

        //(Constant)
        int tresDocenas = 36;

        //(Process)
        double valorUnidadesSinDescuento = (valorUnidadProducto * cantidadUnidades);



       if (cantidadUnidades > tresDocenas){
           System.out.println("El descuento que se le aplicará a su compra es del 15% por adquirir más de 3 docenas de unidades.");
           System.out.println("Valor sin descuento de los productos es: " + valorUnidadesSinDescuento);
           double valorFinal = (valorUnidadesSinDescuento * 0.85);
           double valorDelDescuento = (valorUnidadesSinDescuento - valorFinal);
           System.out.println("El descuento aplicado equivale a:" + valorDelDescuento );
           System.out.println("El valor final de la compra es: " + valorFinal);
       }else{
           System.out.println("El descuento que se le aplicará a su compra es del 10% por adquirir menos de 3 docenas de unidades.");
           System.out.println("Valor sin descuento de los productos es: " + valorUnidadesSinDescuento);
           double valorFinal = (valorUnidadesSinDescuento * 0.85);
           double valorDelDescuento = (valorUnidadesSinDescuento - valorFinal);
           System.out.println("El descuento aplicado equivale a:" + valorDelDescuento );
           System.out.println("El valor final de la compra es: " + valorFinal);
       }

    }
}

/*
    El calculo se pudo realizar tambien usando esta formula:

        valorDescuento = (valorIncialTotal * 15)/100
        valorFinal = (ValorInicialTotal + valorDescuento)
 */