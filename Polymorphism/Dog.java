package Polymorphism;

/**
 * Dog class extending Animal for demonstrating runtime polymorphism.
 */
public class Dog extends Animal {
    
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}