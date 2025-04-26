package Polymorphism;

/**
 * This class demonstrates the concept of Polymorphism in Java.
 * Polymorphism allows objects to be treated as instances of their parent class rather than their actual class.
 * It enables a single interface to represent different underlying forms (implementations).
 */
public class Polymorphism {
    
    public static void main(String[] args) {
        // Creating instances of different shapes
        System.out.println("Demonstrating Polymorphism with Shapes:");
        
        // Array of Shape references, but pointing to different shape objects
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Triangle(3.0, 4.0, 5.0);
        
        // Polymorphic behavior - same method call, different implementations
        for (Shape shape : shapes) {
            System.out.println("\nShape Type: " + shape.getClass().getSimpleName());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            shape.display();
        }
        
        System.out.println("\n--------------------------\n");
        
        // Method overloading example
        Calculator calc = new Calculator();
        System.out.println("Demonstrating Method Overloading:");
        System.out.println("Sum of two integers: " + calc.add(5, 10));
        System.out.println("Sum of three integers: " + calc.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + calc.add(5.5, 10.5));
        System.out.println("Concatenation of strings: " + calc.add("Hello, ", "World!"));
        
        System.out.println("\n--------------------------\n");
        
        // Runtime polymorphism with dynamic method dispatch
        System.out.println("Demonstrating Dynamic Method Dispatch:");
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        animal.makeSound(); // Animal sound
        dog.makeSound();    // Dog sound (overridden)
        cat.makeSound();    // Cat sound (overridden)
    }
}