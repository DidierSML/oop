package org.example.alghoritms.condicionalesSimples;

import java.util.Scanner;

/*
    - Un hombre desea invertir en un banco para generar intereses a favor.
    - El decidirá reinvertir los intereses siempre y cuando el capital
      obtenido de estos no exceda a $7000

      input: dineroAInvertir, PorcentajeInteres
      capitalMasIntereses: ?

 */
public class InterestOnMoney {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Cuanto dinero va a invertir? :");
        //Input(datos de entrada)
        double dineroAInvertir = input.nextDouble();

        System.out.println("Ingrese el porcentaje de intereses a aplicar al monto a invertir:");
        //Input(datos de entrada)
        double porcentajeInteres = input.nextDouble();

        //Constante
        double capitalLimite = 7000;

        //Process(Proceso)
        double interesesGenerados = (dineroAInvertir * porcentajeInteres) / 100;

        //double CapitalFinal = (dineroAInvertir + interesesGenerados);

        if(interesesGenerados > capitalLimite){
            System.out.println("No se reinvierten los intereses obtenidos por ser mayor al Capital Limite. " +
                            "\nIntereses obtenidos: " + interesesGenerados);

        }


    }
}

/*
    La proyeccion tambien se puede calcular de la siguiente manera
    si se usan valores decimale de entrada, ejemplo:

    dineroAInvertir= 100,000;
    porcentajeInteres = 0,10

        double proyeccion = (dineroAInvertir * porcentajeInteres);
 */

