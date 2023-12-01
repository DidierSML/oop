package org.example.dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 *Una tienda de ropa ha dejado de vender una serie de productos de cierta marca
 *que tiene bien identificada en una Lista, sin embargo, en su base de datos siguen
 *apareciendo estos productos en las busquedas porque no han sido eliminados.
 *No queremos tener que borrar una por una, asi que necesitamos:
 *
 * Crear un programa que con base en una Lista de marcas, revise si esas prendas se
 * encuentran en la BD y si es el caso, que se eliminen definitivamente.
 *
 */
public class EliminarProductos {

    private static List <Productos> productos;

    //Método que devuelve una lista de productos
    public static Productos [] obtenerProductos (){

        Productos [] productos = {

                new Productos("H&M", "Gris", "Pay", "32L"),
                new Productos("H&M", "Verde", "Pay", "32L"),
                new Productos("Zara", "Gris", "Coco", "32L"),
                new Productos("Lacoste", "Verde", "Crown", "32L"),
                new Productos("Farm", "Azul", "Holos", "32L"),
                new Productos("Ho!", "Gris", "Pay", "32L"),
                new Productos("H&M", "Gris", "Pay", "32L"),
                new Productos("H&M", "Gris", "Pay", "32L"),
                new Productos("Lacoste", "Gris", "Pay", "32L")
        };

        return productos;
    }

    //Método para eliminar productos mediante un método Iterador
    private static void eliminarMarcasIterator(List <Productos> productos, List <String> marcas){

        //Se crea una ListIterator para poder iterar los productos con los metodos que esta brinda
        for (ListIterator <Productos> iterator = productos.listIterator(); iterator.hasNext();){//Si no uso hasNext, el bucle será infinito
            if(marcas.contains(iterator.next().getMarca())){ //Verifica si las marcas de listaMarcas están en la lista productos y las separa
                iterator.remove(); //Si la marca coincide en la lista productos la eliminará de la lista original
            }
        }
    }

    //Método para eliminar productos mediante programación funcional
    private static void eliminarMarcasStream (List <Productos> productosStream, List <String> marcasStream){
        productosStream.removeIf((productos -> marcasStream.contains(productos.getMarca())));
        productosStream.forEach(System.out::println); //Imprimir lista después de eliminar
    }



    public static void main(String[] args) {

        //Estos serán los productos que eliminaré de la BD Inicial
        String [] listaDeMarcas = {"H&M", "Lacoste"};

        /*
            Aquí creamos un nuevo arreglo dinámico a partir de la -listaDeProductos- que nos brinda el método
            -obtenerProductos- para no realizar modificaciones sobre la lista original
         */
        List <Productos> listaDefinitiva = new ArrayList<>(Arrays.asList(obtenerProductos()));
        listaDefinitiva.forEach(System.out::println);
        eliminarMarcasIterator(listaDefinitiva, Arrays.asList(listaDeMarcas));

        System.out.println("\n\nProductos sin las marcas No Deseadas usando Iterator: ");
        listaDefinitiva.forEach(System.out::println);

        System.out.println("\n\nProductos sin las marcas No Deseadas usando Stream: ");
        eliminarMarcasStream(listaDefinitiva, Arrays.asList(listaDeMarcas));
    }
}

class Productos{

    private String marca;
    private String color;
    private String modelo;
    private String talla;

    public Productos(String marca, String color, String modelo, String talla) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", talla='" + talla + '\'' +
                '}';
    }
}
