package Polymorphism;

/**
 * Triangle class that extends Shape.
 * Provides specific implementations for the shape methods.
 */
public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
    // Method overriding - providing specific implementation
    @Override
    public double calculateArea() {
        // Using Heron's formula
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
    
    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
    
    @Override
    public void display() {
        System.out.println("Triangle with sides: " + sideA + ", " + sideB + ", " + sideC);
    }
}