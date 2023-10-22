package org.example.alghoritms.condicionalesSimples;

import java.util.Scanner;

/*
    Diseña un algoritmo que lea:
        - (Input) Nombre de un empleado, Salario Básico x hora, Nro Horas trabajadas x dia
                  y díasLaboradosAlMes.
        - (Process) Calcular el salario mensual

        - (?) = Si el salario Mensual es > a dos veces el SMMLV aplique el subsidio e imprima
                por pantalla.
                (Constants) = SMMLV (930), Subsidio (50)

 */
public class TotalMonthlyPayment {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Calculo Total sueldo de empleado");

        //Input(dato de entrada)
        System.out.println("Ingrese el nombre del trabajador: ");
        String nombre = input.nextLine();

        //Input(dato de entrada)
        System.out.println("Ingrese el Salario por hora del trabajador: ");
        double sueldoHora = input.nextDouble();

        //Input(dato de entrada)
        System.out.println("Ingrese las horas trabajadas por dia: ");
        int horasTrabajadasDiarias = input.nextInt();

        //Input(dato de entrada)
        System.out.println("Ingrese el numero de dias trabajados por mes: ");
        int diasTrabajados = input.nextInt();

        //Constants (Constantes)
        double subsidio = 50;
        double salarioMinimo = 930;

        //Process(Proceso)
        double salarioMensual = (sueldoHora * horasTrabajadasDiarias * diasTrabajados);

        if (salarioMensual >= salarioMinimo * 2){
            double salarioTotal = (salarioMensual + subsidio);
            System.out.println("Nombre del trabajador: " + nombre);
            System.out.println("Salario Mensual: " + salarioMensual);
            System.out.println("Subsidio de transporte: " + subsidio);
            System.out.println("Sueldo Total (Sueldo Mensual + Subsidio): " + salarioTotal);
        }


    }
}
