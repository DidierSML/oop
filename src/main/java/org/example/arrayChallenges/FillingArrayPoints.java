package org.example.arrayChallenges;

import java.awt.*;
import java.util.Scanner;

public class FillingArrayPoints {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("How many elements? : (Max is 20)");
        int n = s.nextInt();

        while (n > 20 || n <= 0) {
            System.out.println("Invalid number, introduce try again: ");
            n = s.nextInt();
        }

        Point[] points = new Point[n];//Para esta ocasion creamos una lista de 'points'
        fillArrayOfPoints(points);// Asignación de un metodo que almacene los valores ingresados en 'points'
        printArrayOfPoints(points);// Asignación de un metodo que Imprima los valores ingresados en 'points'

    }
    private static void fillArrayOfPoints(Point[] points) { //metodo creado que guardara los datos ingresados
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < points.length; i++) {
            System.out.print("Enter x and y for point " + (i + 1) +": ");
            points[i] = new Point(s.nextInt(), s.nextInt());
        }
    }
    private static void printArrayOfPoints(Point[] points) { //metodo creado que Imprimirá los datos ingresados
        System.out.println("The elements are: ");
        for(int i = 0; i < points.length; i++)
            System.out.println("(" + points[i]. x + ", " + points[i].y + ")");
    }
}
