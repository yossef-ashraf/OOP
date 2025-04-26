package Inheritance;

/**
 * Motorcycle class that inherits from Vehicle (subclass).
 * Demonstrates another way to extend the base class with different functionality.
 */
public class Motorcycle extends Vehicle {
    // Additional field specific to Motorcycle
    private boolean hasSidecar;
    
    // Constructor
    public Motorcycle(String make, String model, int year, boolean hasSidecar) {
        super(make, model, year);
        this.hasSidecar = hasSidecar;
    }
    
    // Getter and setter for Motorcycle-specific field
    public boolean hasSidecar() {
        return hasSidecar;
    }
    
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
    
    // Method overriding
    @Override
    public void start() {
        System.out.println("Motorcycle engine starting with kickstart...");
    }
    
    // Motorcycle-specific method
    public void wheelie() {
        System.out.println("Motorcycle doing a wheelie! " + (hasSidecar ? "Careful with that sidecar!" : ""));
    }
    
    // Overriding displayInfo to include Motorcycle-specific information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}