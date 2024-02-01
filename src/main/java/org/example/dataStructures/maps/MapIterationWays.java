package org.example.dataStructures.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Maneras de Iterar en Maps
 */
public class MapIterationWays {

    public static void main(String[] args) {

        //Creación del Mapa
        Map<String, String> players = new HashMap<>();

        //Inserción de Jugadores al mapa
        players.put("Leo Messi", "Barcelona");
        players.put("Luis Suarez", "Barcelona");
        players.put("Arturo Vidal", "Barcelona");
        players.put("Luka Modrick", "Real Madrid");
        players.put("Toni Kross", "Real Madrid");
        players.put("Sergio Ramos", "Real Madrid");
        players.put("Luis Diaz", "Liverpool");
        players.put("Mohamed Salah", "Liverpool");
        players.put("Erling Halland", null);
        players.put("Killian Mbappe", "Paris SG");

        //Iterando con gracias al entry.Set proporcionado por la I. SET que deriva de I. Iterator (Maps y Set están muy relacionados)

        System.out.println("------------Iterando Tanto <Key, Value> usando Map.Entry y entry.Set forma Usual---------------------");

        //Iterando e imprimiendo tanto <Key> como <Value> de cada elemento del Map
        for (Map.Entry<String, String> entry : players.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " - Value:" + entry.getValue());
        }

        System.out.println("\s");
        //Iterando e imprimiendo tanto <Key> como <Value> de cada elemento del Map
        System.out.println("------------Iterando <Key, Value> usando Map.Entry y entry.Set forma 2---------------------");
        Set<Map.Entry<String, String>> entries = players.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("Key: " + entry.getKey() + " - Value:" + entry.getValue());
        }

        System.out.println("\s");
        System.out.println("------------Iterando Solo <Key> usando Foreach y el m.keySet---------------------");

        //Iterando e Imprimiendo Todos los <Key> del map
        for (String entry : players.keySet()) {
            System.out.println("Key: " + entry);
        }

        System.out.println("\s");
        System.out.println("------------Iterando Solo <Value> usando Foreach y el m.values---------------------");

        //Iterando e Imprimiendo Todos los <Values> de cada elemento
        for (String teams : players.values()) {
            System.out.println("Value: " + teams);
        }

        System.out.println("\s");
        System.out.println("------------Iterando <Key, Value> usando (ITERATOR)---------------------");

        //Iterando Usando (Iterator) obtenido de la I.SET que a su vez lo usa a partir de la I. ITERATOR
        for (Iterator<Map.Entry<String, String>> iter = players.entrySet().iterator(); iter.hasNext(); ) {
            Map.Entry<String, String> entry = iter.next();
            String player = entry.getKey();
            String team = entry.getValue();

            System.out.println("Jugador: " + player + " - Equipo: " + team);
        }

        //Iterando usando ForEach a través de la Programación Funcional, usando la I.Funcional (BiCostumer)
        System.out.println("\s");
        System.out.println("------------Iterando <Key, Value> usando forEach / Interfaz Funcional ---------------------");

        //La Programación Funcional simplifica muchas cosas, es auto interpretativa como se ve aquí
        players.forEach ( (player, team) -> System.out.println("Jugador: " + player + " Equipo: " + team));

    }

}

/*
        ------------Iterando Tanto <Key, Value> usando Map.Entry y entry.Set forma Usual---------------------
    Key: Luis Diaz - Value:Liverpool
    Key: Killian Mbappe - Value:Paris SG
    Key: Luis Suarez - Value:Barcelona
    Key: Leo Messi - Value:Barcelona
    Key: Sergio Ramos - Value:Real Madrid
    Key: Erling Halland - Value:null
    Key: Toni Kross - Value:Real Madrid
    Key: Arturo Vidal - Value:Barcelona
    Key: Luka Modrick - Value:Real Madrid
    Key: Mohamed Salah - Value:Liverpool

    ------------Iterando <Key, Value> usando Map.Entry y entry.Set forma 2---------------------
    Key: Luis Diaz - Value:Liverpool
    Key: Killian Mbappe - Value:Paris SG
    Key: Luis Suarez - Value:Barcelona
    Key: Leo Messi - Value:Barcelona
    Key: Sergio Ramos - Value:Real Madrid
    Key: Erling Halland - Value:null
    Key: Toni Kross - Value:Real Madrid
    Key: Arturo Vidal - Value:Barcelona
    Key: Luka Modrick - Value:Real Madrid
    Key: Mohamed Salah - Value:Liverpool

    ------------Iterando Solo <Key> usando Foreach y el m.keySet---------------------
    Key: Luis Diaz
    Key: Killian Mbappe
    Key: Luis Suarez
    Key: Leo Messi
    Key: Sergio Ramos
    Key: Erling Halland
    Key: Toni Kross
    Key: Arturo Vidal
    Key: Luka Modrick
    Key: Mohamed Salah

    ------------Iterando Solo <Value> usando Foreach y el m.values---------------------
    Value: Liverpool
    Value: Paris SG
    Value: Barcelona
    Value: Barcelona
    Value: Real Madrid
    Value: null
    Value: Real Madrid
    Value: Barcelona
    Value: Real Madrid
    Value: Liverpool

    ------------Iterando <Key, Value> usando (ITERATOR)---------------------
    Jugador: Luis Diaz - Equipo: Liverpool
    Jugador: Killian Mbappe - Equipo: Paris SG
    Jugador: Luis Suarez - Equipo: Barcelona
    Jugador: Leo Messi - Equipo: Barcelona
    Jugador: Sergio Ramos - Equipo: Real Madrid
    Jugador: Erling Halland - Equipo: null
    Jugador: Toni Kross - Equipo: Real Madrid
    Jugador: Arturo Vidal - Equipo: Barcelona
    Jugador: Luka Modrick - Equipo: Real Madrid
    Jugador: Mohamed Salah - Equipo: Liverpool

*/