package org.example.dataStructures.linkedLists.storeApp;

import java.util.Scanner;

//Clase Ejecutable
public class InventoryApp {

    private Scanner input;
    private Inventory inventory;

    public static void main(String[] args) {

        InventoryApp app = new InventoryApp();
        app.init();

    }

    //Método (Init)
    public void init(){

        input = new Scanner(System.in);
        inventory = new Inventory();

        int option;

        //Menú clásico
        do {
            System.out.println("\n\n\t Menú \t");
            System.out.println("---Manejo de Inventarios---");
            System.out.println("1. -- Nuevo producto: ");
            System.out.println("2. -- Agregar producto al Inventario: ");
            System.out.println("3. -- Eliminar Producto: ");
            System.out.println("4. -- Actualizar precio de producto: ");
            System.out.println("5. -- Mostrar lista de productos: ");
            System.out.println("6. -- Salir");

            System.out.println("\nSeleccione la opción deseada: ");
            option = input.nextInt();

            //Capturamos la opción seleccionada por el usuario
            switch (option) {
                case 1:
                    newProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    updateProductPrice();
                    break;
                case 5:
                    printProducts();
                    break;
            }

        }while (option != 6);

    }

    //M. Option 1
    private void newProduct() {
        //Capturamos los datos de entrada del producto nuevo
        System.out.println("ID del producto: ");
        int ID = input.nextInt();

        System.out.println("Nombre del producto: ");
        String name = input.next();

        System.out.println("Existencia del producto: ");
        int existence = input.nextInt();

        System.out.println("Precio del producto: ");
        double price = input.nextDouble();

        inventory.newProduct(ID,name,existence,price);
    }

    //M. Option 2
    private void addProduct() {

        //Capturamos los datos de entrada del producto nuevo
        System.out.println("ID del producto: ");
        int ID = input.nextInt();

        inventory.addProduct(ID); //Invocamos el método addProduct
    }

    //M. Option 3
    private void deleteProduct() {

        //Capturamos los datos de entrada del producto nuevo
        System.out.println("Ingrese el ID del producto a eliminar: ");
        int ID = input.nextInt();

        inventory.deleteProduct(ID);
    }

    //M. Option 4
    private void updateProductPrice() {

        //Capturamos los datos de entrada del producto nuevo
        System.out.println("ID del producto: ");
        int ID = input.nextInt();

        System.out.println("Ingrese el nuevo precio: ");
        double newPrice = input.nextDouble();

        inventory.updateProductPrice(ID, newPrice); //Invocamos el método addProduct
    }

    //M. Option 5
    private void printProducts() {
        inventory.printProducts();
    }
}
