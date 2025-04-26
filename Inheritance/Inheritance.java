package Inheritance;

/**
 * This class demonstrates the concept of Inheritance in Java.
 * Inheritance is a mechanism where a new class (subclass) is derived from an existing class (superclass),
 * inheriting its fields and methods while potentially adding new functionality.
 */
public class Inheritance {
    
    public static void main(String[] args) {
        // Creating an instance of the base class
        Vehicle vehicle = new Vehicle("Generic Vehicle", "Unknown", 2020);
        System.out.println("Basic Vehicle Information:");
        vehicle.displayInfo();
        vehicle.start();
        vehicle.stop();
        
        System.out.println("\n--------------------------\n");
        
        // Creating an instance of the Car subclass
        Car car = new Car("Toyota", "Camry", 2022, 4, true);
        System.out.println("Car Information:");
        car.displayInfo(); // Inherited method
        car.start(); // Overridden method
        car.stop(); // Inherited method
        car.honk(); // Car-specific method
        
        System.out.println("\n--------------------------\n");
        
        // Creating an instance of the Motorcycle subclass
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, false);
        System.out.println("Motorcycle Information:");
        motorcycle.displayInfo(); // Inherited and overridden method
        motorcycle.start(); // Overridden method
        motorcycle.wheelie(); // Motorcycle-specific method
        
        System.out.println("\n--------------------------\n");
        
        // Demonstrating polymorphism with inheritance
        System.out.println("Demonstrating Polymorphism:");
        Vehicle[] vehicles = {vehicle, car, motorcycle};
        
        for (Vehicle v : vehicles) {
            System.out.println("\nVehicle type: " + v.getClass().getSimpleName());
            v.start(); // Each class's implementation will be called
            
            // Using instanceof to check object type
            if (v instanceof Car) {
                ((Car) v).honk(); // Downcasting
            } else if (v instanceof Motorcycle) {
                ((Motorcycle) v).wheelie(); // Downcasting
            }
        }
    }
}