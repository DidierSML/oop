package org.example.dataStructures.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Métodos más comunes de los Maps.
 *
 * Mapa que almacena el nombre de un jugador como Clave y su equipo actual
 * como Valor
 */
public class MapCommonMethods {

    public static void main(String[] args) {

        //Creación del Mapa
        Map <String,String> players = new HashMap<>();

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

        /*
            A través del Constructor podemos agregar esta lista a otro mapa
                Map <String, String> players2 = new HashMap<>(players);
        */

        /*
            A través del Método -> putAll( ) podemos traspasar tambien todo un map a otro
                Map <String, String> players3 = new HashMap<>();
                    players3.putAll(players)
        */

        //Añadir un <Value> a una <Key> existente, siempre y cuando dicho <Value> sea -null-, de lo contario no funcionará
        players.putIfAbsent("Erling Halland", "Manchester City");
        System.out.println("El equipo actual de Erling Halland es: " + players.get("Erling Halland"));

        //Obtener el <Value> de una <Key>
        String equipoJugador = players.get("Luis Diaz");
        System.out.println("El equipo de Luis Diaz es: " + equipoJugador);

        //Devuelve el <Value> de una <Key> existente; si no existe esta <Key> asigna el defaultValue asignado a dicha <Key>,
        //pero NO agrega esta <Key, Value> al map
        String equipoCristianoR = players.getOrDefault("Cristiano Ronaldo", "Esta Clave no se encuentra en el map");
        System.out.println("El equipo actual de CR7 es: " + equipoCristianoR);

        String equipoToniKross = players.getOrDefault("Toni Kross", "Este Jugador no se encuentra en el mapa");
        System.out.println("El equipo acutal de Toni Kross es:" + equipoToniKross);

        //Impresion del Map usando un for con un Map.Entry que viene siendo el foreach de los maps
        for (Map.Entry <String,String> entry: players.entrySet()){
            System.out.println("Clave: " + entry.getKey() + " - Valor: " + entry.getValue() );
        }

        //Consultar si una <Clave> está incluida en el Map, si está imprimimos su <Value>
        if(players.containsKey("Cristiano Ronaldo")){
            System.out.println("El equipo de Cristiano Ronaldo es: " + players.get("Cristiano Ronaldo"));
        }else{
            System.out.println("La Key (Cristiano Ronaldo) no existe en el Map");
        }

        //Consultar si existe un <Value> en el Map, si existe devolverá: TRUE
        System.out.println("Existe el <Value> Liverpool en el map? : " + players.containsValue("Liverpool"));

        //Obtener todas las <Key> de nuestro mapa.
        System.out.println("Que Jugadores <Key> están registrados en nuestro mapa son: ");
        System.out.println(players.keySet());

        //Obtener todos los <Value> de nuestro mapa./Si hay <Values> repetidos se repiten en el print
        System.out.println("Los Equipos <Value> de nuestro mapa son: ");
        System.out.println(players.values());

        //Reemplazar un <Value> de una <Key> existente
        players.replace("Sergio Ramos","Sevilla");
        System.out.println("El Equipo Actual de Sergio Ramos es: " + players.get("Sergio Ramos"));

        //Remover/Eliminar un elemento del mapa
        players.remove("Killian Mbappe");
        System.out.println(players.get("Killian Mbappe"));//Al eliminarlo devuelve null

        //Conozcamos el Tamaño del Mapa
        System.out.println("El tamaño del mapa es: " + players.size());//Hasta el momento 9 Elementos

        //Consultar si está vacio el Mapa
        System.out.println("Esta el mapa vacio? :" + players.isEmpty());

        //Eliminar Todos los Elementos <Key, Value> del Mapa
        players.clear();
        System.out.println("Cantidad de Elementos en el Map: " + players.size());//Post eliminación quedan 0 elementos
        for (Map.Entry <String,String> entry: players.entrySet()){
            System.out.println("Clave: " + entry.getKey() + " - Valor: " + entry.getValue() );
        }
    }
}
/*
    El equipo actual de Erling Halland es: Manchester City
    El equipo de Luis Diaz es: Liverpool
    El equipo actual de CR7 es: Esta Clave no se encuentra en el map
    El equipo acutal de Toni Kross es:Real Madrid
    Clave: Luis Diaz - Valor: Liverpool
    Clave: Killian Mbappe - Valor: Paris SG
    Clave: Luis Suarez - Valor: Barcelona
    Clave: Leo Messi - Valor: Barcelona
    Clave: Sergio Ramos - Valor: Real Madrid
    Clave: Erling Halland - Valor: Manchester City
    Clave: Toni Kross - Valor: Real Madrid
    Clave: Arturo Vidal - Valor: Barcelona
    Clave: Luka Modrick - Valor: Real Madrid
    Clave: Mohamed Salah - Valor: Liverpool
    La Key (Cristiano Ronaldo) no existe en el Map
    Existe el <Value> Liverpool en el map? : true
    Que Jugadores <Key> están registrados en nuestro mapa son:
    [Luis Diaz, Killian Mbappe, Luis Suarez, Leo Messi, Sergio Ramos, Erling Halland, Toni Kross, Arturo Vidal, Luka Modrick, Mohamed Salah]
    Los Equipos <Value> de nuestro mapa son:
    [Liverpool, Paris SG, Barcelona, Barcelona, Real Madrid, Manchester City, Real Madrid, Barcelona, Real Madrid, Liverpool]
    El Equipo Actual de Sergio Ramos es: Sevilla
    null
    El tamaño del mapa es: 9
    Esta el mapa vacio?: false
    Cantidad de Elementos en el Map: 0

*/