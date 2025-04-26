package Abstraction;

/**
 * Class implementing both AbstractVehicle and Rechargeable interface.
 */
public class ElectricCar extends AbstractVehicle implements Rechargeable {
    private int batteryLevel;
    
    public ElectricCar(String make, String model, int year) {
        super(make, model, year);
        this.batteryLevel = 75; // Initial battery level
    }
    
    @Override
    public void start() {
        System.out.println("Electric car starting: Press power button");
    }
    
    @Override
    public void stop() {
        System.out.println("Electric car stopping: Press power button again");
    }
    
    @Override
    public double getFuelEfficiency() {
        return 100.0; // Equivalent mpg for electric car
    }
    
    @Override
    public void charge() {
        System.out.println("Electric car charging...");
        batteryLevel = MAX_BATTERY_LEVEL;
        System.out.println("Charging complete!");
    }
    
    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }
}