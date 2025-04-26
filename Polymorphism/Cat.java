package Polymorphism;

/**
 * Cat class extending Animal for demonstrating runtime polymorphism.
 */
public class Cat extends Animal {
    
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow! Meow!");
    }
}