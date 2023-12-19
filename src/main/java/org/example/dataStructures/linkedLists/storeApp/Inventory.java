package org.example.dataStructures.linkedLists.storeApp;

import java.util.LinkedList;
import java.util.List;

//Clase Inventario
public class Inventory {

    //Lista donde se guardarán los Productos
    private List<Product> productList;

    public Inventory(){
        productList = new LinkedList<>();
    }

    //Este tipo de productos serán almacenados en una Lista de tipo LinkedList
    public Product newProduct(int ID, String name, int existence, double price){

        Product newProduct = new Product(ID, name, existence,price);

        boolean success = productList.add(newProduct);

        if (success){
            System.out.println("El producto " + name + " es añadió correctamente al Inventario");
        }else {
            System.out.println("Ocurrió un Problema al agregar el Producto " + name + "al inventario");
        }

        return newProduct;
    }

    //Metodo llamados desde la app (M.2)
    public void addProduct(int ID){

        int productIndex = productList.indexOf(new Product(ID));//Obtener el Índice de la lista que coincida con el pasado como ID

        Product product = productList.get(productIndex);//Luego de la comparación obtenemos el elemento asignado a ese ID

        int existenceTemp = product.getExistence();
        int newExistence = existenceTemp += 1;
        product.setExistence(newExistence);
        System.out.println("\nSe ha agregado un producto (" + product.getName() + ") exitosamente");

    }

    //Método llamado desde la app (M.3)
    public void deleteProduct(int ID){

        int productIndex = productList.indexOf(new Product(ID));

        Product productToDelete = productList.remove(productIndex); //Eliminando el producto encontrado

        if(productToDelete != null){
            System.out.println("El producto con Id: " + ID + " ha sido eliminado satisfactoriamente");
        }else{
            System.out.println("No pudo eliminarse el Producto de Id: " + ID);
        }


    }

    //Método llamado desde la app (M.4)
    public void updateProductPrice (int ID, double newPrice){

        int productIndex = productList.indexOf(new Product(ID)); //Búsqueda y comparación del ID

        Product productFind = productList.get(productIndex); //Obtenemos el producto asignado al ID
        productFind.setPrice((newPrice));// Le modificamos el precio

        System.out.println("Producto con id: " + ID + " actualizado exitosamente");


    }

    //Metodo llamado desde la app (M.5)
    public void printProducts(){
        System.out.println("Relación de productos en el almacén: ");
        productList.forEach(System.out::println); //Método referenciado para imprimir la lista
        System.out.println("\n\n"); //Dos espacios vacios

    }

}
