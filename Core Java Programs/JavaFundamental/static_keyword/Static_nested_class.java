package static_keyword; // Package declaration, organizing the class within a package named 'static_keyword'

public class Static_nested_class { // Main class definition
    
    static class NestedClass { // A static nested class inside Static_nested_class
        void display() { // Method inside the nested class
            System.out.println("Hello from Static Nested Class"); // Prints a message when called
        }
    }

    public static void main(String[] args) { // Main method, entry point of the program
        NestedClass nested = new NestedClass(); // Creating an instance of the static nested class
        nested.display(); // Calling the method of the nested class to display a message
    }
}
