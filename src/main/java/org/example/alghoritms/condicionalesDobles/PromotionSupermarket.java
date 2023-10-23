package org.example.alghoritms.condicionalesDobles;

import java.util.Random;
import java.util.Scanner;

/*
    Un supermercado desea brindarle descuentos a clientes al momento
    de pagar sus articulos en la caja registradora. Dandole a estos la
    opcion de elegir un numero cualquiera; si este elige un numero
    < 74 se le aplicará un descuento del 15%, si por el contrario es
    >74 el descuento será del 20%.

    (?) Mostrar por pantalla cuanto dinero se le desconto y el
        valor final de su compra
 */
public class PromotionSupermarket {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Supermercado la Promocion.");

        System.out.println("Ingrese el monto total a pagar por su compra: ");
        //(Input)
        double montoInicial = input.nextDouble();

        //(Random) Numero Aleatorio
        Random random = new Random();
        //Estableciendo rango
        int aleatorio = random.nextInt(150);


        int numeroBase = 74;

        if (aleatorio < numeroBase){
            System.out.println("Numero aleatorio: " + aleatorio);
            System.out.println("Felicidades! a obtenido un descuento del 15% en su compra.");
            System.out.println("Monto inicial a pagar: " + montoInicial);
            double descuento = (montoInicial * 15)/100;
            System.out.println("Su descuento equivale a: " + descuento);
            double valorFinal = (montoInicial - descuento);
            System.out.println("El valor final de su compra es: " + valorFinal);
        }else{
            System.out.println("Numero aleatorio: " + aleatorio);
            System.out.println("Felicidades! a obtenido un descuento del 20% en su compra.");
            System.out.println("Monto inicial a pagar: " + montoInicial);
            double descuento = (montoInicial * 20)/100;
            System.out.println("Su descuento equivale a: " + descuento);
            double valorFinal = (montoInicial - descuento);
            System.out.println("El valor final de su compra es: " + valorFinal);
        }
    }
}
