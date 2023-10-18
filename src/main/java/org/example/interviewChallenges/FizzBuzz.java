package org.example.interviewChallenges;

public class FizzBuzz {

    /**
     * Escriba un programa que imprima de 1 a 100 en una línea.
     * Para cada múltiplo de 3 imprima "Fizz" en lugar del número.
     * Para cada múltiplo de 5 imprima "Buzz" en lugar del número.
     * Para cada múltiplo de 3 y 5 imprima "FizzBuzz" en lugar del número.
     * Si no cumple con ninguna de las anteriores imprima solo el número (i).
     *
     * output:
     * 1
     * 2
     * Fizz
     * 4
     * Buzz
     * 15 (FizzBuzz)
     */


    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
