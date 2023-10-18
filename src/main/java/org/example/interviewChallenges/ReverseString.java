package org.example.interviewChallenges;

public class ReverseString {
    /*
        Los Strings son inmutables, por ende si modificas un String
        No estarás modificando esa instancia, sino que por el contrario
        estarás creando una nueva instancia en memoria con nueva información
        así no se vea. En orden de hacer mutable este aspecto se prefiere usar
        StringBuilder el cual si permite modificaciones sobre la misma instancia,
        sin embargo, al momento de querer imprimir algo por pantalla, necesariamente
        tendremos que usar la conversion a builder.toString();
     */

            public static void main(String[] args) {
                StringBuilder builder = new StringBuilder("Hola");
                builder.append(", mundo!"); // Modifica la instancia actual

                //String resultado = builder.toString(); // Convierte a String si es necesario

                System.out.println("Resultado: " + builder);
            }
}
