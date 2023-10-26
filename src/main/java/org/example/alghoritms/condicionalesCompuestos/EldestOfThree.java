package org.example.alghoritms.condicionalesCompuestos;

import java.util.Scanner;

/*
    Encuentre el mayor de 3 numeros.
 */
public class EldestOfThree {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int primerNumero = input.nextInt();

        System.out.println("Ingrese el primer numero");
        int segundoNumero = input.nextInt();

        System.out.println("Ingrese el primer numero");
        int tercerNumero = input.nextInt();

        //int menorDe3 = Math.min(Math.min(primerNumero,segundoNumero),tercerNumero);
        //System.out.println("El menor de los 3 numeros ingresados es: " + menorDe3);

        //int mayorDe3 = Math.max(Math.max(numero1,numero2),numero3);
        //System.out.println("El mayor de los 3 numeros ingresados es: " + mayorDe3);

        //(Process)
        if(primerNumero < segundoNumero && primerNumero < tercerNumero){
            System.out.println("Numero Menor es el primer Numero: " + primerNumero);
        } else if (segundoNumero < primerNumero && segundoNumero < tercerNumero) {
            System.out.println("Numero Menor es el segundo Numero: " + segundoNumero);
        } else if (tercerNumero < primerNumero && tercerNumero < segundoNumero) {
            System.out.println("Numero Menor es el tercer Numero: " + tercerNumero);
        }

        //(Process)
        if(primerNumero > segundoNumero && primerNumero > tercerNumero){
            System.out.println("Numero Mayor es el primer Numero: " + primerNumero);
        } else if (segundoNumero > primerNumero && segundoNumero > tercerNumero) {
            System.out.println("Numero Mayor es el segundo Numero: " + segundoNumero);
        } else if (tercerNumero > primerNumero && tercerNumero > segundoNumero) {
            System.out.println("Numero Mayor es el tercer Numero: " + tercerNumero);
        }


    }
}
