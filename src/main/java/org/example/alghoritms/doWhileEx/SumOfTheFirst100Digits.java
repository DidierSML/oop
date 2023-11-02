package org.example.alghoritms.doWhileEx;

/*
    Diseñe un algoritmo que muestre la sumatoria de los digitos hasta x numero.
 */
public class SumOfTheFirst100Digits {

    public static void main(String[] args) {

        int limite = 100;
        int contador = 0;
        int sumaDeDigitos = 0;

        do {
            sumaDeDigitos = sumaDeDigitos + contador;
            contador++;
        }while(contador <= limite);

        System.out.println("La suma de los digitos hasta " + limite + " es: " + sumaDeDigitos);


    }


}

/*
    USANDO WHILE

    while (contador <= limite){
            totalDigitos = totalDigitos + contador;
            contador++;
        }

        System.out.println(totalDigitos);
 */