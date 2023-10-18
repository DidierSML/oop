package org.example.algoritms;

import java.util.Scanner;
/*
Programa que recibe datos por pantalla para un usuario
y los imprime (nombre,edad y ciudad)
 */
public class KeyboardInput {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);


        System.out.println("Ingrese el nombre del usuario");
        //Lectura del dato de entrada
        String nombre = input.nextLine();

        System.out.println("Ingrese la edad del usuario");
        //Lectura del dato de entrada
        int edad = input.nextInt();

        /*
        //Despues de un dato de entrada int se debe agregar el nextLine para que reconozca el siguiente dato a
          imprimir, de lo contrario al dar enter se reconocerá ese enter como el dato siguiente, lo cual no queremos
         */
        input.nextLine();

        System.out.println("Ingrese la ciudad del usuario");
        //Lectura del dato de entrada
        String ciudad = input.nextLine();

        //Impresion de los datos recibidos por entrada
        System.out.println("Los datos ingresados para el usuario son: nombre= "+ nombre + ", edad= " + edad + ", ciudad= " + ciudad);
    }
}
