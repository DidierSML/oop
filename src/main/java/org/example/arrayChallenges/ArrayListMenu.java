package org.example.arrayChallenges;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMenu {    //se crea una clase main en donde se ejecutaran las condiciones
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //Scanner Object

        ArrayList < Integer > menu = new ArrayList<>();//se crea la lista

        while (true){     //mientras la condicion sea cierta mostrará el menu
            displaymMenu(); //la condicion inicia (true)
            int choice = s.nextInt(); // se declara la variable que reconocerá el # del menú a acceder

            if (choice == 1){ // Si la seleccion es (1) Add an element
                System.out.print("Enter an integer that you want add to the list");
                menu.add(s.nextInt());
                System.out.println("Added");
            }

            else if //Si la selección es (2) Remove an element
            (choice == 2){
                System.out.print("Enter the number to remove: "); //se ingresa el # a eliminar
                int elementToRemove = s.nextInt(); //se lee el # a eliminar

                if (menu.contains(elementToRemove)){ //use el metodo (Contains) para hayar la cifra a eliminar
                    menu.remove(Integer.valueOf(elementToRemove));//se usa el metodo remover y se especifica el
                    System.out.println("Removed");  //elemento a remover como valor integral tal cual la declaracion
                } else
                    System.out.println("Element not found"); //si no se haya el valor se imprime que no se hayo
            }

            else if //Si la seleccion es (3) Mostrará lo que hay en el menu
            (choice == 3){
                System.out.print("Your list "+ menu);

            }

            else if (choice == 4){ //Si la seleccion es (4) finalizara el programa
                System.out.println("Program Finished, bye");
                break; //finsh the execution of the program

            }
        }

    }

    private static void  displaymMenu (){ //Method to show the user
        System.out.println();
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.println();
    }
}
/**
 * ArrayList que tiene 4 funciones:
 * 1. Agrega enteros a una Lista tipo array
 * 2. Remueve enteros guardados en la lista
 * 3. Muestra los enteros guardados en la lista
 * 4. Sale del Menu
 */