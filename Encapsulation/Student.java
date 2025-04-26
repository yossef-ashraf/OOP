package Encapsulation;

/**
 * Student class demonstrating encapsulation principles:
 * 1. Private data members
 * 2. Public getter and setter methods
 * 3. Data validation in setters
 */
public class Student {
    // Private data members (attributes)
    private String name;
    private int age;
    private String rollNumber;
    private char grade;
    
    
    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.rollNumber = "Not Assigned";
        this.grade = 'N';
    }
    
    // Parameterized constructor
    public Student(String name, int age, String rollNumber, char grade) {
        this.setName(name);
        this.setAge(age);
        this.setRollNumber(rollNumber);
        this.setGrade(grade);
    }
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Setter for name with validation
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Name cannot be empty");
        }
    }
    
    // Getter for age
    public int getAge() {
        return age;
    }
    
    // Setter for age with validation
    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Error: Age must be between 0 and 120");
        }
    }
    
    // Getter for rollNumber
    public String getRollNumber() {
        return rollNumber;
    }
    
    // Setter for rollNumber
    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
    
    // Getter for grade
    public char getGrade() {
        return grade;
    }
    
    // Setter for grade with validation
    public void setGrade(char grade) {
        if (grade >= 'A' && grade <= 'F') {
            this.grade = grade;
        } else {
            System.out.println("Error: Grade must be between A and F");
        }
    }
    
    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Grade: " + this.grade);
    }
}