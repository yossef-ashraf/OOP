package Abstraction;

/**
 * Concrete implementation of AbstractVehicle.
 */
public class Car extends AbstractVehicle {
    
    public Car(String make, String model, int year) {
        super(make, model, year);
    }
    
    @Override
    public void start() {
        System.out.println("Car starting: Insert key and turn ignition");
    }
    
    @Override
    public void stop() {
        System.out.println("Car stopping: Apply brakes and turn off ignition");
    }
    
    @Override
    public double getFuelEfficiency() {
        return 25.5; // mpg for this car
    }
}