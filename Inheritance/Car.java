package Inheritance;

/**
 * Car class that inherits from Vehicle (subclass).
 * Demonstrates extending a base class and adding new functionality.
 */
public class Car extends Vehicle {
    // Additional fields specific to Car
    private int numberOfDoors;
    private boolean hasAirConditioning;
    
    // Constructor that calls the superclass constructor
    public Car(String make, String model, int year, int numberOfDoors, boolean hasAirConditioning) {
        // Call parent constructor using super
        super(make, model, year);
        
        // Initialize Car-specific fields
        this.numberOfDoors = numberOfDoors;
        this.hasAirConditioning = hasAirConditioning;
    }
    
    // Getters and setters for Car-specific fields
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    
    public boolean hasAirConditioning() {
        return hasAirConditioning;
    }
    
    public void setHasAirConditioning(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
    }
    
    // Method overriding - changing the behavior of the parent class method
    @Override
    public void start() {
        System.out.println("Car engine starting with key...");
    }
    
    // Car-specific method
    public void honk() {
        System.out.println("Car honking: Beep beep!");
    }
    
    // Overriding displayInfo to include Car-specific information
    @Override
    public void displayInfo() {
        // Call the parent method first
        super.displayInfo();
        
        // Add Car-specific information
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Has air conditioning: " + (hasAirConditioning ? "Yes" : "No"));
    }
}