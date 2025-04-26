package Polymorphism;

/**
 * Calculator class demonstrating method overloading (compile-time polymorphism).
 */
public class Calculator {
    
    // Method overloading - same method name with different parameters
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
    
    // Method to concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }
}