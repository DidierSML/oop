package org.example.alghoritms.secuenciales;

import java.util.Scanner;

/*
    Defina una algoritmo que permita calcular el nuevo
    salario de un trabajador, si a este le incrementaron
    su sueldo en un 25% adicional a su sueldo anterior.

    input = salario actual
    constant = 25%
    nuevoSueldo= ?


 */
public class IncreasingSalary {

     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

         System.out.println("Ingrese el salario actual del trabajador para aplicarle el respectivo incremento");

         //Input(datos de entrada)
         double salarioActual = input.nextDouble();

         //Constant(Constante)
         double incremento = 0.25;

         //Process(Proceso)
         double nuevoSalario = salarioActual * incremento + salarioActual;

         //Output(salida)
         System.out.println("Su nuevo sueldo con el incremento aplicado es de: " + nuevoSalario);
     }
}

/*
         //Esta otra alternativa permite recibir por pantalla el incremento que se le quiera aplicar
           al salario.

         double porcentajeIncremento = input.nextDouble();

         System.out.println("Ingrese el porcentaje a incrementar");
         double nuevoSalario = salarioActual * porcentajeIncremento + salarioActual;

 */
