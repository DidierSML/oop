package org.example.dataStructures.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * El equipo de (futbol-sala) del 3er grado esta formado por:
 *  (Pedro, Diego, Hugo, Carlos, Roberto, Rolando y Edgar).
 *
 * El equipo de (Olimpiadas-Matemáticas) del 3er grado está formado por:
 *  (Andrea, Diego, Cristina, Jose, Rolando y Edgar).
 *
 * ¿Preguntas?:
 * 1.¿Quiénes están en ambos equipos?
 * 2.¿Quiénes están en al menos uno de los dos equipos?
 * 3.¿Quiénes están en el equipo de (futbol-sala) pero no en el otro?
 * 4.¿Quiénes están en el equipo de las (Olimpiadas-Matemáticas) pero no en el otro?
 * 5.¿Quiénes solo están en uno de los dos equipos?
 */
public class TeamAndStudents {

    public static void main(String[] args) {

        //Listado Equipo de Fútbol
        Set<String> equipoFutbol =
                new HashSet<>(Arrays.asList("Pedro","Diego","Hugo", "Carlos", "Roberto", "Rolando", "Edgar"));
        System.out.println("equipoFutbol = " + equipoFutbol);

        //Listado Equipo de Matemáticas
        Set <String> olimpiadasMatematicas =
                new HashSet<>(Arrays.asList("Andrea","Diego", "Cristina", "José", "Rolando", "Edgar"));
        System.out.println("olimpiadasMatematicas = " + olimpiadasMatematicas + "\n");


        //1. Estudiantes que están en Ambos Equipos:
        Set <String> estudiantesDeAmbosEquipos = new HashSet<>(equipoFutbol);
        //(retainAll -> genera un Conjunto con Objetos en común)
        estudiantesDeAmbosEquipos.retainAll(olimpiadasMatematicas);

        System.out.println("estudiantesDeAmbosEquipos = " + estudiantesDeAmbosEquipos);


        //2. Estudiantes que están en al menos un Equipo:
        Set <String> estudiantesEnAlMenosUnEquipo = new HashSet<>(equipoFutbol);
        //(addAll -> genera un Conjunto con todos los elementos de ambos conjuntos sin generar duplicados)
        estudiantesEnAlMenosUnEquipo.addAll(olimpiadasMatematicas);

        System.out.println("estudiantesEnAlMenosUnEquipo = " + estudiantesEnAlMenosUnEquipo);


        //3. Estudiantes en el equipo de (futbol-sala) pero que no en el equipo de (olimpíadas-matemáticas):
        Set <String> estudiantesEquipoFutbolSala = new HashSet<>(equipoFutbol);
        //(removeAll -> genera un Conjunto donde elimina los Objetos del conj1 que se encuentren en el conj2)
        estudiantesEquipoFutbolSala.removeAll(olimpiadasMatematicas);

        System.out.println("estudiantesEquipoFutbolSalaPeroNoEnOlimpiadas = " + estudiantesEquipoFutbolSala);

        //4. Estudiantes en el equipo de (futbol-sala) pero que no en el equipo de (olimpíadas-matemáticas):
        Set <String> estudiantesEquipoOlimpiadasMat = new HashSet<>(olimpiadasMatematicas);
        //(removeAll -> genera un Conjunto donde elimina los Objetos del conj1 que se encuentren en el conj2)
        estudiantesEquipoOlimpiadasMat.removeAll(equipoFutbol);

        System.out.println("estudiantesEquipoOlimpiadasMatPeroNoEquipoFut = " + estudiantesEquipoOlimpiadasMat);

        //4. Estudiantes en un Solo Equipo:
        Set <String> estudiantesEnUnSoloEquipo = new HashSet<>(estudiantesEquipoFutbolSala);
        estudiantesEnUnSoloEquipo.addAll(estudiantesEquipoOlimpiadasMat);

        System.out.println("estudiantesEnUnSoloEquipo = " + estudiantesEnUnSoloEquipo);

    }

}

/*

    equipoFutbol = [Roberto, Edgar, Diego, Hugo, Pedro, Carlos, Rolando]
    olimpiadasMatematicas = [Edgar, Diego, José, Cristina, Andrea, Rolando]

    estudiantesDeAmbosEquipos = [Edgar, Diego, Rolando]
    estudiantesEnAlMenosUnEquipo = [Roberto, Edgar, Diego, Hugo, José, Pedro, Carlos, Cristina, Rolando, Andrea]
    estudiantesEquipoFutbolSalaPeroNoEnOlimpiadas = [Roberto, Hugo, Pedro, Carlos]
    estudiantesEquipoOlimpiadasMatPeroNoEquipoFut = [José, Cristina, Andrea]
    estudiantesEnUnSoloEquipo = [Roberto, Hugo, José, Pedro, Carlos, Cristina, Andrea]

*/