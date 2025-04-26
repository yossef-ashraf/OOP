package Encapsulation;

    /**
     * This class demonstrates the concept of Encapsulation in Java.
     * Encapsulation is the technique of making the fields in a class private
     * and providing access to the fields via public methods.
     */

public class Encapsulation {
    public static void main(String[] args) {
        // Creating an instance of the Student class
        Student student = new Student();
        
        // Setting values using setter methods
        student.setName("John Doe");
        student.setAge(20);
        student.setRollNumber("CS2023001");
        student.setGrade('A');
        
        // Trying to set an invalid age
        System.out.println("Attempting to set invalid age:");
        student.setAge(-5); // This will be rejected
        
        // Getting values using getter methods
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Grade: " + student.getGrade());
        
        // Creating another student with the parameterized constructor
        Student anotherStudent = new Student("Jane Smith", 22, "CS2023002", 'B');
        
        // Displaying information
        System.out.println("\nAnother Student Information:");
        anotherStudent.displayInfo();
        
        // Demonstrating data validation
        System.out.println("\nDemonstrating grade validation:");
        anotherStudent.setGrade('Z'); // Invalid grade
        System.out.println("Grade after invalid input: " + anotherStudent.getGrade());
    }
}