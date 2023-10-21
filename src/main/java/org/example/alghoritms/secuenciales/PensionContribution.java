package org.example.alghoritms.secuenciales;

import java.util.Scanner;

/*
    Tenemos un trabajador gana S/69.23 al día, durante 26 días laborables, nos pide hallar
    cuanto recibe de sueldo y cuanto se aporta a su seguro pensionario si se sabe que el
    porcentaje de aporte mensual es el 11.74% el cual esta compuesto por :

    - 10% ingresa a su AFP.
    - 0.38% es el Cobro por la administración e inversión de tu fondo.
    - 1.36% por Seguro de Invalidez, Sobrevivencia y Gastos de Sepelio.

    input = valorDia, diasLaborales

    porcentajePensional(-11.74%) = ?
 */
public class PensionContribution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Ingrese el salario por dia del trabajador: ");
        //Input(dato de entrada)
        double salarioDiario = input.nextDouble();

        System.out.println("Ingrese los dias laborados:");
        //Input(dato de entrada)
        int diasLaborados = input.nextInt();

        System.out.println("Ingrese el porcentaje de aporte mensual a gastos de pension por parte del trabajador:");
        //Input(dato de entrada)
        double aporteGlobalPension = input.nextDouble();

        //Process(Proceso)
        double salarioMensual = (salarioDiario * diasLaborados);


        double descuentoPorPension = (salarioMensual * aporteGlobalPension) / 100;
        double sueldoConDescuento = salarioMensual - descuentoPorPension;

        double ingresoAFP = (salarioMensual * 10) / 100;

        double cobroAdministrativo = (salarioMensual * 0.38) / 100;

        double seguros = (salarioMensual * 1.36) / 100;


        //Output(salida)
        System.out.println("El salario mensual del trabajador es: " + salarioMensual);

        System.out.println("El descuento general por detalles de Pension equivalente al "
                                + aporteGlobalPension + "% es de: " + descuentoPorPension);

        System.out.println("Siendo estos los detalles de estos aportes: \n1) Ingreso al Fondo AFP por el 10%: " + ingresoAFP);
        System.out.println("2) Cobro Administrativo por el 0.38%: " + cobroAdministrativo);
        System.out.println("3) Seguros varios por el 1.36%: " + seguros);

        System.out.println("El Sueldo Neto a recibir despues de estos aportes es igual a: "
                                + sueldoConDescuento );

    }
}

/*
    Esta manera de calcular los valores tambien habria sido valida si se ingresaran los % en forma decimal:

        Ejemplo: 11,74% = (0,1174), 10% = (0,10), 0,38% = (0,0038), 1,36% (0,0136)

        //double descuentoPorPension = (salarioMensual * aporteGlobalPension);

        //double ingresoAFP = (salarioMensual * 0.10);

        //double cobroAdministrativo = (salarioMensual * 0.0038);

        //double seguros = (salarioMensual * 0.0136);
 */
