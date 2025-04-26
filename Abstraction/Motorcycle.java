package Abstraction;

/**
 * Another concrete implementation of AbstractVehicle.
 */
public class Motorcycle extends AbstractVehicle {
    
    public Motorcycle(String make, String model, int year) {
        super(make, model, year);
    }
    
    @Override
    public void start() {
        System.out.println("Motorcycle starting: Press ignition button");
    }
    
    @Override
    public void stop() {
        System.out.println("Motorcycle stopping: Apply brakes and turn off engine");
    }
    
    @Override
    public double getFuelEfficiency() {
        return 50.0; // mpg for this motorcycle
    }
}