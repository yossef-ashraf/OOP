package Abstraction;

/**
 * Interface demonstrating abstraction through interfaces.
 * Contains only method declarations.
 */
public interface Rechargeable {
    // Constants (implicitly public, static, and final)
    int MAX_BATTERY_LEVEL = 100;
    
    // Abstract methods (implicitly public and abstract)
    void charge();
    int getBatteryLevel();
}