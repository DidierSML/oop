package org.example.dataStructures.linkedLists.storeApp;

import java.util.Objects;

//Clase Producto
public class Product {

    private int id;
    private String name;
    private int existence;
    private double price;

    //Constructor para solo ID
    public Product(int id) {
        this.id = id;
    }

    //Constructor con todos los atributos
    public Product(int id, String name, int existence, double price) {
        this.id = id;
        this.name = name;
        this.existence = existence;
        this.price = price;
    }

    //Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExistence() {
        return existence;
    }

    public void setExistence(int existence) {
        this.existence = existence;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Método -equals- para comparar el contenido de dos objetos
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Product product = (Product) o;
            return id == product.id; //Comparación también a través del ID
    }

    //Método -HashCode-
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //Método toString para obtener una salida personalizada de la instancia y no un código hash de difícil comprensión
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", existence=" + existence +
                ", price=" + price +
                '}';
    }
}
