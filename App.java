// Class declaration with access modifier
public class App {
    // Class constants (static final variables)
    public static final int MAX_VALUE = 100;
    private static final String APP_NAME = "Java Syntax Demo";
    
    // Instance variables with different access modifiers
    private int id;
    protected String name;
    public boolean isActive;
    
    // Static variable (shared across all instances)
    static int instanceCount = 0;
    
    // Default constructor
    public App() {
        this.id = ++instanceCount;
        this.name = "Default";
        this.isActive = true;
        System.out.println("Default constructor called");
    }
    
    // Parameterized constructor
    public App(String name, boolean isActive) {
        this(); // Calling another constructor
        this.name = name;
        this.isActive = isActive;
    }
    
    // Getter and setter methods
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public boolean isActive() {
        return isActive;
    }
    
    public void setActive(boolean active) {
        isActive = active;
    }
    
    // Static method
    public static void displayAppInfo() {
        System.out.println("App Name: " + APP_NAME);
        System.out.println("Total instances: " + instanceCount);
    }
    
    // Method with parameters and return value
    public int calculateSum(int a, int b) {
        return a + b;
    }
    
    // Method with variable arguments (varargs)
    public double calculateAverage(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return numbers.length > 0 ? (double) sum / numbers.length : 0;
    }
    
    // Method demonstrating exception handling
    public void demonstrateExceptionHandling(int divisor) {
        try {
            int result = 100 / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Exception handling demonstration complete");
        }
    }
    
    // Method demonstrating different loop types
    public void demonstrateLoops() {
        // For loop
        System.out.println("For loop:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Index: " + i);
        }
        
        // While loop
        System.out.println("While loop:");
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + count);
            count++;
        }
        
        // Do-while loop
        System.out.println("Do-while loop:");
        int j = 0;
        do {
            System.out.println("J: " + j);
            j++;
        } while (j < 3);
        
        // Enhanced for loop (for-each)
        System.out.println("Enhanced for loop:");
        int[] numbers = {1, 2, 3};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
    
    // Method demonstrating conditional statements
    public void demonstrateConditionals(int value) {
        // If-else statement
        if (value > 0) {
            System.out.println("Value is positive");
        } else if (value < 0) {
            System.out.println("Value is negative");
        } else {
            System.out.println("Value is zero");
        }
        
        // Switch statement
        switch (value % 3) {
            case 0:
                System.out.println("Divisible by 3");
                break;
            case 1:
                System.out.println("Remainder 1 when divided by 3");
                break;
            case 2:
                System.out.println("Remainder 2 when divided by 3");
                break;
            default:
                System.out.println("This won't happen with modulo 3");
        }
        
        // Ternary operator
        String result = (value % 2 == 0) ? "Even" : "Odd";
        System.out.println("The value is " + result);
    }
    
    // Inner class demonstration
    public class InnerClass {
        private String description;
        
        public InnerClass(String description) {
            this.description = description;
        }
        
        public void display() {
            System.out.println("Inner class of App with ID: " + id);
            System.out.println("Description: " + description);
        }
    }
    
    // Static nested class
    public static class StaticNestedClass {
        private String data;
        
        public StaticNestedClass(String data) {
            this.data = data;
        }
        
        public void display() {
            System.out.println("Static nested class of App");
            System.out.println("Data: " + data);
            System.out.println("App name: " + APP_NAME);
        }
    }
    
    // Main method - entry point of the program
    public static void main(String[] args) {
        // Original array example
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 0; i < array.length; i++) {
           System.out.println(array[i]);
        }
        
        // Creating objects
        App app1 = new App();
        App app2 = new App("Custom App", true);
        
        // Calling instance methods
        System.out.println("App1 ID: " + app1.getId());
        System.out.println("App2 Name: " + app2.getName());
        
        // Calling static method
        App.displayAppInfo();
        
        // Using other methods
        System.out.println("Sum: " + app1.calculateSum(5, 10));
        System.out.println("Average: " + app1.calculateAverage(1, 2, 3, 4, 5));
        
        // Exception handling demo
        app1.demonstrateExceptionHandling(2);
        app1.demonstrateExceptionHandling(0);
        
        // Loop and conditional demos
        app1.demonstrateLoops();
        app1.demonstrateConditionals(10);
        
        // Using inner class
        App.InnerClass innerObj = app1.new InnerClass("Test inner class");
        innerObj.display();
        
        // Using static nested class
        App.StaticNestedClass nestedObj = new App.StaticNestedClass("Test nested class");
        nestedObj.display();
        
        // Demonstrating arrays
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println("Names array length: " + names.length);
        
        // Demonstrating multi-dimensional arrays
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Matrix[1][1]: " + matrix[1][1]);
        
        // Demonstrating wrapper classes and autoboxing
        Integer wrappedInt = 100;  // autoboxing
        int primitiveInt = wrappedInt;  // auto-unboxing
        System.out.println("Wrapped: " + wrappedInt + ", Primitive: " + primitiveInt);
    }
}