package org.example.alghoritms.whileExercises;

import java.util.Scanner;

/*
    Diseñe un algoritmo que permita simular el funcionamiento de un reloj digital y que permita
    ejecutarlo en hora, minutos y segundos.
 */
public class DigitalWatch {

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la hora (0-23): ");
        int hr = input.nextInt();
        System.out.println("Ingrese los minutos (0-59): ");
        int min = input.nextInt();
        System.out.println("Ingrese los segundos (0-59): ");
        int sg = input.nextInt();

        if (hr >= 0 && hr < 24 && min >= 0 && min < 60 && sg >= 0 && sg < 60) {
            while (true) {
                System.out.println(String.format("%02d:%02d:%02d", hr, min, sg));
                Thread.sleep(1000); // Esperar 1 segundo
                sg++;

                if (sg == 60) {
                    sg = 0;
                    min++;

                    if (min == 60) {
                        min = 0;
                        hr++;

                        if (hr == 24) {
                            hr = 0;
                        }
                    }
                }
            }
        } else {
            System.out.println("Hora, minutos o segundos ingresados no válidos. Ingrese valores dentro del rango.");
        }
    }

}


/*
    public static void main(String [] args){

        Scanner input = new Scanner (System.in);

        sout("Ingrese la hora entre 0 - 24);
        int hr = input.nextInt();

        sout("Ingrese el minuto entre 0 - 60);
        int min = input.nextInt();

        sout("Ingrese el segundo entre 0 - 60);
        int sg = input.nextInt();

        while(hr < 24){

                while(min < 60){


                    while(sg < 60){
                        sout(hr + " : " + min + " : " + sg);
                        Thread.sleep(1000);
                        sg++;
                    }
                    min++;
                    sg = 0;
                }

            hr++;
            min = 0;
        }

    }
 */
