package org.example.alghoritms.condicionalesDobles;

import java.util.Scanner;

/*
Los empleados de una fabrica trabajan en dos turnos: diurno y nocturno.
El salario se paga segun la siguiente tarifa (50 x horas diurna), (80 x hora nocturna):
Teniendo en cuenta el numero de horas diurnas y nocturnas que trabajo un empleado durante el día
elabore un algoritmo que calcule cuanto debe pagársele, y si si si gana mas de $600 se le debe descontar un 1%

    (Input)
    - horasDiurnasTrabajadas
    - horasNocturnasTrabajadas

    (Constants)
    - Tarifa diurna $50 por hora.
    - Tarifa nocturna $80 por hora.

    (?)
    - Salario

    (Condition)
    - Si el trabajador gana > 600 descuentele el 1% de su salario.


 */
public class WorkDays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el numero de horas diurnas que trabajo el empleado:");
        //(Input)
        int horasTrabajadasDiurnas = input.nextInt();

        System.out.println("Ingrese el numero de horas nocturnas que trabajo el empleado:");
        //(Input)
        int horasTrabajadasNocturnas = input.nextInt();

        //(Constant)
        int valorDiurna = 50;
        int valorNocturna = 80;
        double calculoSalario = (horasTrabajadasDiurnas * valorDiurna) + (horasTrabajadasNocturnas * valorNocturna);


        //(Process)
        if(calculoSalario > 600){
            double salarioFinal = (calculoSalario * 0.99);
            System.out.println("El salario suyo es igual a: " + salarioFinal + "\n- Se le aplico un descuento del 1%" );
        }else {
            System.out.println("El salario suyo es igual a: " + calculoSalario + "\n- No se le aplicaron descuentos");
        }
    }


}
