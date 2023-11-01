package org.example.alghoritms.whileExercises;



/*
  Diseñe un algoritmo que permita imprimir los números del 1 al 100.
  Que calcule la suma de todos los números pares por un lado y por
  el otro la suma de los impares.

  (Constants) numeroInicial, numeroFinal

  (?) Pares e Impares

*/
public class CalculationOfNumbersFrom1To100 {

    public static void main(String[] args) {

        System.out.println("Calculo de numeros pares e impares desde el numero 1 hasta el 100 y su sumatoria");

        //(Constants)
        int numeroInicial = 0;
        int pares = 0;
        int impares = 0;

        //(Bucle)
        while(numeroInicial <= 100) { //Mientras el numeroIncial (0) sea <= (100)
            int numeros = numeroInicial;// La variable (números) tomara el valor del (numero Incial)
            System.out.println(numeros);// y se imprimira dicha var (numeros)

            if(numeroInicial % 2 == 0){ //si durante el bucle de (0) a (100) se cumple esta condicion
                pares = pares + numeroInicial; //los num pares se acumularan en la var (pares) sumandose entre ellos
            }

            if (numeroInicial % 2 != 0){//si durante el bucle de (0) a (100) se cumple esta condicion
                impares = impares + numeroInicial;//los num impares se acumularan en la var (impares) sumandose entre ellos
            }

            numeroInicial++; // luego del 1er bucle este evento continuara repitiendos, pues el numeroIncial ira incrementando de 1 en 1

        }


        System.out.println(pares); //Finalmente la sumatoria de valores (pares) se imprime
        System.out.println(impares);//Finalmente la sumatoria de valores (impares) se imprime

    }
}
/* //Solucion con For:


        for(int i = 0; i <= 100; i++){
            if (i % 2 == 0 ){
                System.out.println(i);
                pares = pares + i;
            }
        }

        for(int i = 0; i <= 100; i++){
            if(i % 2 != 0){
                impares = impares + i;
            }
        }

        System.out.println(pares);
        System.out.println(impares);

*/
