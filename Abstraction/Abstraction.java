package Abstraction;

/**
 * This class demonstrates the concept of Abstraction in Java.
 * Abstraction is the process of hiding implementation details and showing only functionality to the user.
 * It can be achieved using abstract classes and interfaces.
 */
public class Abstraction {
    
    public static void main(String[] args) {
        // Cannot instantiate abstract class
        // AbstractVehicle vehicle = new AbstractVehicle(); // This would cause error
        
        System.out.println("Demonstrating Abstract Classes:");
        
        // Using concrete implementations of abstract class
        AbstractVehicle car = new Car("Toyota", "Camry", 2022);
        AbstractVehicle motorcycle = new Motorcycle("Honda", "CBR", 2021);
        
        car.start();
        car.stop();
        car.displayInfo();
        System.out.println("Fuel Efficiency: " + car.getFuelEfficiency() + " mpg");
        
        System.out.println();
        
        motorcycle.start();
        motorcycle.stop();
        motorcycle.displayInfo();
        System.out.println("Fuel Efficiency: " + motorcycle.getFuelEfficiency() + " mpg");
        
        System.out.println("\n--------------------------\n");
        
        System.out.println("Demonstrating Interfaces:");
        
        // Using classes that implement interfaces
        ElectricCar tesla = new ElectricCar("Tesla", "Model S", 2023);
        tesla.start();
        tesla.stop();
        tesla.charge();
        System.out.println("Battery Level: " + tesla.getBatteryLevel() + "%");
        
        System.out.println();
        
        Smartphone phone = new Smartphone("Apple", "iPhone 14");
        phone.charge();
        phone.playMedia("Music");
        phone.stopMedia();
        System.out.println("Battery Level: " + phone.getBatteryLevel() + "%");
        
        System.out.println("\n--------------------------\n");
        
        System.out.println("Demonstrating Multiple Interface Implementation:");
        
        SmartTV smartTV = new SmartTV("Samsung", "Neo QLED");
        smartTV.charge();
        smartTV.playMedia("Movie");
        smartTV.connect();
        smartTV.disconnect();
        smartTV.stopMedia();
    }
}