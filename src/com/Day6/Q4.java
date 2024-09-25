package com.Day6;

// Abstract class
abstract class Shape {
    String color;

    // Constructor
    Shape(String color) {
        this.color = color;
    }

    // Abstract method (no body)
    public abstract double area();

    // Concrete method
    public String getColor() {
        return color;
    }

    // Concrete method
    public void display() {
        System.out.println("This is a shape of color: " + color);
    }
}

// Subclass of Shape (Circle)
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Implementing the abstract method
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Subclass of Shape (Rectangle)
class Rectangle extends Shape {
    double length;
    double width;

    // Constructor
    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    // Implementing the abstract method
    @Override
    public double area() {
        return length * width;
    }
}

// Main class to demonstrate
public class Q4 {
    public static void main(String[] args) {
        // Creating objects of Circle and Rectangle
        Shape circle = new Circle("Red", 5);
        Shape rectangle = new Rectangle("Blue", 4, 6);

        // Calling methods
        circle.display();
        System.out.println("Area of Circle: " + circle.area());

        rectangle.display();
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}

