package org.example.alghoritms.whileExercises;

/*
    Diseñe un algoritmo que imprima los numeros entre 0 y 100 en
    orden descendiente.
 */
public class UntilOneHundred {

    public static void main(String[] args) {

        //numero establecido
        int numero = 100;

        //Mientras el numero(100) sea mayor o igual a (0)
        while (numero >= 0 ){
            //imprima el numero actual
            System.out.println(numero);
            //y luego restele 1 al numero actual
            numero = (numero - 1);
        }
        //repita el proceso hasta llegar a (0)
    }
}
