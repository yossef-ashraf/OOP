package Inheritance;

/**
 * Base class (superclass) representing a generic vehicle.
 * This class will be inherited by more specific vehicle types.
 */
public class Vehicle {
    // Protected fields can be accessed by subclasses
    protected String make;
    protected String model;
    protected int year;
    
    // Constructor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    // Getters and setters
    public String getMake() {
        return make;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    // Methods that can be inherited or overridden
    public void start() {
        System.out.println("Vehicle starting...");
    }
    
    public void stop() {
        System.out.println("Vehicle stopping...");
    }
    
    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}