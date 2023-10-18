package org.example.excercises;

class Rectangle {

    private double width;    //Atributo
    private double height;   //Atributo

    public Rectangle() {     //Constructor
        this(1.0, 1.0);
    }

    public Rectangle(double width, double height) {   //Constructor con parámetros
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.height + this.width);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
