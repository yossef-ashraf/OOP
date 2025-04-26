package Abstraction;

/**
 * Abstract class demonstrating abstraction.
 * Contains both abstract and concrete methods.
 */
public abstract class AbstractVehicle {
    // Fields
    protected String make;
    protected String model;
    protected int year;
    
    // Constructor in abstract class
    public AbstractVehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    // Abstract methods (must be implemented by subclasses)
    public abstract void start();
    public abstract void stop();
    public abstract double getFuelEfficiency();
    
    // Concrete method (common implementation)
    public void displayInfo() {
        System.out.println("Vehicle Information:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}