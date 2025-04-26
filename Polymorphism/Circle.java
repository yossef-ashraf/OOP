package Polymorphism;

/**
 * Circle class that extends Shape.
 * Provides specific implementations for the shape methods.
 */
public class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // Method overriding - providing specific implementation
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    
    @Override
    public void display() {
        System.out.println("Circle with radius: " + radius);
    }
}