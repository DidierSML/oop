package org.example.alghoritms;

public class ReverseString {

    public static String reverse(String input) {
        // Convierte la cadena a un array de caracteres
        char[] charArray = input.toCharArray();

        // Índices para recorrer el array desde ambos extremos
        int start = 0;
        int end = charArray.length - 1;

        // Intercambia los caracteres desde los extremos hacia el centro
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Mueve los índices hacia el centro
            start++;
            end--;
        }

        // Convierte el array de caracteres de nuevo a una cadena
        return new String(charArray);
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        String original = "Hola, mundo!";
        String reversed = reverse(original);

        System.out.println("Original: " + original);
        System.out.println("Reversa: " + reversed);
    }
}
/*
while (start < end) {
    // Línea 1: Compara si el índice 'start' es menor que el índice 'end'.
    // Si es verdadero, ejecuta el bloque de código dentro del bucle.

    char temp = charArray[start];
    // Línea 2: Crea una variable 'temp' y le asigna el valor del carácter en la posición 'start'.

    charArray[start] = charArray[end];
    // Línea 3: Asigna el valor del carácter en la posición 'end' al carácter en la posición 'start'.

    charArray[end] = temp;
    // Línea 4: Asigna el valor almacenado en 'temp' (que era el carácter original en 'start') al carácter en la posición 'end'.

    start++;
    // Línea 5: Incrementa el valor de 'start' en 1.

    end--;
    // Línea 6: Decrementa el valor de 'end' en 1.
}
// Línea 7: Cuando 'start' ya no sea menor que 'end', el bucle se detendrá.
 */