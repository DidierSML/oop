package org.example.alghoritms.condicionalesCompuestos;

import java.util.Scanner;

/*
    En una llanteria se ha establecido una promocion de llantas marca "Ponchadas",
    dicha promocion consiste en lo siguiente:
    - Si se compran < 5 llantas el precio es de: $30000 cada una
    - Si se compran > 5 && compra < 10 el precio es de: $25000 cada una.
    - Si se compran > 10 el precio es de: $20000

    - Diseñar un algoritmo para obtener la cantidad de dinero que tiene que pagar por el total de
      la compra.

      (Input) = Ingrese el numuero de llantas que desea comprar.

      (Constant) =
        - compraMenorA5unidades = 30000;
        - compraMayorA5unidadesYMenorA10 = 25000;
        - compraMayorA10unidades = 20000;

 */
public class WheelShop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el numero de llantas que desea comprar: ");
        //(Input)
        int unidadesAComprar = input.nextInt();

        //(Constants)
        double menosDe5Unidades = 30000;
        double menosDe5UnidadesYMasDe10Unidades = 25000;
        double masDe10Unidades = 20000;

        if (unidadesAComprar <= 5 ){
           double valorTotal = (unidadesAComprar * menosDe5Unidades);
            System.out.println("El valor total por " + unidadesAComprar + " unidades es de: " + valorTotal);
        } else if (unidadesAComprar > 5 && unidadesAComprar <= 10) {
            double valorTotal = (unidadesAComprar * menosDe5UnidadesYMasDe10Unidades);
            System.out.println("El valor total por " + unidadesAComprar + " unidades es de: " + valorTotal);
        } else if (unidadesAComprar > 10) {
            double valorTotal = (unidadesAComprar * masDe10Unidades);
            System.out.println("El valor total por " + unidadesAComprar + " unidades es de: " + valorTotal);
        }
    }
}
