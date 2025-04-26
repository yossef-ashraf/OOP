package Abstraction;

/**
 * Class implementing multiple interfaces.
 */
public class Smartphone implements Rechargeable, MediaPlayer {
    private String brand;
    private String model;
    private int batteryLevel;
    
    public Smartphone(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.batteryLevel = 50; // Initial battery level
    }
    
    @Override
    public void charge() {
        System.out.println(brand + " " + model + " is charging...");
        batteryLevel = MAX_BATTERY_LEVEL;
        System.out.println("Charging complete!");
    }
    
    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }
    
    @Override
    public void playMedia(String mediaType) {
        System.out.println(brand + " " + model + " is playing " + mediaType);
        batteryLevel -= 10; // Decrease battery when playing media
    }
    
    @Override
    public void stopMedia() {
        System.out.println(brand + " " + model + " stopped playing media");
    }
}