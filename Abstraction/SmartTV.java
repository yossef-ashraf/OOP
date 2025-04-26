package Abstraction;

/**
 * Class implementing multiple interfaces to demonstrate interface abstraction.
 */
public class SmartTV implements Rechargeable, MediaPlayer, Connectable {
    private String brand;
    private String model;
    private int batteryLevel;
    private boolean connected;
    
    public SmartTV(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.batteryLevel = 80; // Initial battery level
        this.connected = false;
    }
    
    @Override
    public void charge() {
        System.out.println(brand + " " + model + " TV is charging remote...");
        batteryLevel = MAX_BATTERY_LEVEL;
        System.out.println("Remote charging complete!");
    }
    
    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }
    
    @Override
    public void playMedia(String mediaType) {
        System.out.println(brand + " " + model + " TV is playing " + mediaType);
    }
    
    @Override
    public void stopMedia() {
        System.out.println(brand + " " + model + " TV stopped playing media");
    }
    
    @Override
    public void connect() {
        System.out.println(brand + " " + model + " TV connecting to network...");
        connected = true;
        System.out.println("Connected successfully!");
    }
    
    @Override
    public void disconnect() {
        if (connected) {
            System.out.println(brand + " " + model + " TV disconnecting from network...");
            connected = false;
            System.out.println("Disconnected successfully!");
        } else {
            System.out.println(brand + " " + model + " TV is not connected to any network");
        }
    }
}