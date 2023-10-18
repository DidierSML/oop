package org.example.excercises;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        Rectangle[] rect = new Rectangle[3];//Array de 3 rectangulos

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < rect.length; i++) { //ciclo de pregunta
            System.out.println(
                    "Do you want to enter the widht and the height (y/n)");

            char choice = input.next().charAt(0); // y/n
            if (choice == 'y') // si 'y' asigne los valores que ingrese el usuario
                rect[i] = new Rectangle(input.nextDouble(), input.nextDouble());
            else if (choice == 'n') //si 'n' asigne el valor por default del 1er construtor
                rect[i] = new Rectangle();

        }

        System.out.println("The Rectangles are:");
        for (int i = 0; i < rect.length;i++)
            System.out.println(
                    "Rectangle "+ (i+1) +
                            ":widht: "+ rect[i].getWidth() +
                            ", height " + rect[i].getHeight());

    }
}


