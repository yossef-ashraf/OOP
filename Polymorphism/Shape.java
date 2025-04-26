package Polymorphism;

/**
 * Base class for all shapes.
 * Demonstrates polymorphism through method overriding.
 */
public class Shape {
    // Common methods that will be overridden by subclasses
    
    public double calculateArea() {
        return 0.0; // Default implementation
    }
    
    public double calculatePerimeter() {
        return 0.0; // Default implementation
    }
    
    public void display() {
        System.out.println("This is a generic shape");
    }
}