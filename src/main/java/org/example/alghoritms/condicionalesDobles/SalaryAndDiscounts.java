package org.example.alghoritms.condicionalesDobles;

import java.util.Scanner;

/*
    Desarrollar un algoritmo que permita hallar el sueldo neto y descuento provisional de un trabajador, tener en
    cuenta que si un cargo administrativo se le descontará el 12% del sueldo bruto, y si es operativo se le
    descontara el 17%.
 */
public class SalaryAndDiscounts {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el salario base del trabajador: ");
        //(Input)
        double salarioBase = input.nextDouble();

        input.nextLine();

        System.out.println("Ingrese el area en que labora el trabajador Adiministrativo (A) u Operativo (O): ");
        //(Input)
        String area = input.nextLine();

        //(Constants)
        double descuentoAdministrativo = 0.88;
        double descuentoOperativo = 0.83;

        //(Process)
        if (area.equals("A")){
            double salarioFinal = (salarioBase * descuentoAdministrativo);
            double descuentoEquivalente = (salarioBase - salarioFinal);
            System.out.println("Descuento del 12% que equivale a: " + descuentoEquivalente);
            System.out.println("El salario final del trabajador es: " + salarioFinal);
        }else if(area.equals("O")){
            double salarioFinal = (salarioBase * descuentoOperativo);
            double descuentoEquivalente = (salarioBase - salarioFinal);
            System.out.println("Descuento del 17% que equivale a: " + descuentoEquivalente);
            System.out.println("El salario final del trabajador es: " + salarioFinal);
        }else{
            System.out.println("La categoria que ingreso no existe, intente de nuevo");
        }
    }
}
