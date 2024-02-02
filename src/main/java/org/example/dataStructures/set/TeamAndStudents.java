package org.example.dataStructures.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * El equipo de (futbol-sala) del 3er grado esta formado por:
 *  (Pedro, Diego, Hugo, Carlos, Roberto, Rolando y Edgar).
 *
 * El equipo de (Olimpiadas-Matemáticas) del 3er grado está formado por:
 *  (Andrea, Diego, Cristina, Jose, Rolando y Edgar).
 *
 * ¿Preguntas?:
 * 1.¿Quiénes están en ambos equipos?
 * 1.¿Quiénes están en al menos uno de los dos equipos?
 * 1.¿Quiénes están en el equipo de (futbol-sala) pero no en el otro?
 * 1.¿Quiénes están en el equipo de las (Olimpiadas-Matemáticas) pero no en el otro?
 * 1.¿Quiénes solo están en uno de los dos equipos?
 */
public class TeamAndStudents {

    public static void main(String[] args) {

        Set<String> equipoFutbol =
                new HashSet<>(Arrays.asList("Pedro","Diego","Hugo", "Carlos", "Roberto", "Rolando", "Edgar"));
        System.out.println("equipoFutbol = " + equipoFutbol);

        Set <String> olimpiadasMatematicas =
                new HashSet<>(Arrays.asList("Andrea","Diego", "Cristina", "José", "Rolando", "Edgar"));
        System.out.println("olimpiadasMatematicas = " + olimpiadasMatematicas + "\n");


        //1. Estudiantes que están en Ambos Equipos:
        Set <String> estudiantesDeAmbosEquipos = new HashSet<>(equipoFutbol);
        estudiantesDeAmbosEquipos.retainAll(olimpiadasMatematicas);

        System.out.println("estudiantesDeAmbosEquipos = " + estudiantesDeAmbosEquipos);


        //2. Estudiantes que están en al menos un Equipo:
        Set <String> estudiantesEnAlMenosUnEquipo = new HashSet<>(equipoFutbol);
        estudiantesEnAlMenosUnEquipo.addAll(olimpiadasMatematicas);

        System.out.println("estudiantesEnAlMenosUnEquipo = " + estudiantesEnAlMenosUnEquipo);


        //3. Estudiantes en el equipo de (futbol-sala) pero que no en el equipo de (olimpíadas-matemáticas):
        Set <String> estudiantesEquipoFutbolSala = new HashSet<>(equipoFutbol);
        estudiantesEquipoFutbolSala.removeAll(olimpiadasMatematicas);

        System.out.println("estudiantesEquipoFutbolSalaPeroNoEnOlimpiadas = " + estudiantesEquipoFutbolSala);

        //4. Estudiantes en el equipo de (futbol-sala) pero que no en el equipo de (olimpíadas-matemáticas):
        Set <String> estudiantesEquipoOlimpiadasMat = new HashSet<>(olimpiadasMatematicas);
        estudiantesEquipoOlimpiadasMat.removeAll(equipoFutbol);

        System.out.println("estudiantesEquipoOlimpiadasMatPeroNoEquipoFut = " + estudiantesEquipoOlimpiadasMat);

        //4. Estudiantes en un Solo Equipo:
        Set <String> estudiantesEnUnSoloEquipo = new HashSet<>(estudiantesEquipoFutbolSala);
        estudiantesEnUnSoloEquipo.addAll(estudiantesEquipoOlimpiadasMat);

        System.out.println("estudiantesEnUnSoloEquipo = " + estudiantesEnUnSoloEquipo);

    }

}
