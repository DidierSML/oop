package org.example.alghoritms.condicionalesCompuestos;

import java.util.Scanner;

/*
    Diseñar un algoritmo que reciba (3) numeros.
        - Indique si hay numeros iguales y diferentes.
        - Asi mismo indicar, si estan ordenados:
                ascendentemente, descendentemente o en desorden

     (Input) primerNumero, segundoNumero, tercerNumero.

 */
public class SortingNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");
        int primerNumero = input.nextInt();

        System.out.println("Ingrese el segundo numero:");
        int segundoNumero = input.nextInt();

        System.out.println("Ingrese el tercer numero:");
        int tercerNumero = input.nextInt();

        //(Process)
        if (primerNumero == segundoNumero || primerNumero == tercerNumero || segundoNumero == tercerNumero){
            System.out.println("Hay numeros iguales");
        } else if (primerNumero < segundoNumero && segundoNumero < tercerNumero) {
            System.out.println("El orden de los numeros es ascendente");
        } else if (primerNumero > segundoNumero && segundoNumero > tercerNumero) {
            System.out.println("El orden de los numeros es descendente");
        } else{
            System.out.println("Los numeros estan en desorden");
        }
    }
}
