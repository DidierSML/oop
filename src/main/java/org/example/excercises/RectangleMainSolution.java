package org.example.excercises;

import java.util.Scanner;

public class RectangleMainSolution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Array of Max (3) Rectangles where we evaluate their widht and height");
        System.out.println("Enter the number of rectangles");
        int n = s.nextInt();

        while (n > 3) {
            System.out.println("Enter another quantity of rectangles to evaluate");
            n = s.nextInt();
        }
        Rectangle[] rectangles = new Rectangle[3];//null, null, null
        fillArrayOfData(rectangles);
        PrintArrayOfData(rectangles);
    }

    private static void fillArrayOfData(Rectangle[] rectangles) {
        Scanner s = new Scanner(System.in);

        for (int i = 0;i < rectangles.length; i++){
            System.out.println("Do you want use the value for Default (y/n)");

            char choice = s.next().charAt(0); // y/n
            if (choice == 'n') // si 'y' asigne los valores que ingrese el usuario
                rectangles[i] = new Rectangle(s.nextDouble(), s.nextDouble());
            if (choice == 'y')//si 'n' asigne el valor por default del 1er construtor
                rectangles[i] = new Rectangle();
        }
    }

    private static void PrintArrayOfData(Rectangle[] rectangles) {
        System.out.println("The datos for each Rectangle are: ");
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("( Rectangle "+ (i + 1) +
                    " :  widht: "+ rectangles[i].getWidth() +
                    " , height: "+ rectangles[i].getHeight() + " ) " );
            System.out.println("Perimeter of Rectangle "+ (i + 1)+ " : "+ rectangles[i].getPerimeter());
            System.out.println("Area of Rectangle "+ (i + 1)+ " : "+ rectangles[i].getArea());
            System.out.println("_____________________________________________");
        }


    }
}
