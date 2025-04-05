package abstraction; // Package declaration to organize the class within 'abstraction' package

abstract class Fruit { // Abstract class definition

    int price; // Instance variable

    Fruit() { // Default constructor
        this(89); // Calls the parameterized constructor
        int price = 20; // Local variable inside constructor
        System.out.println("This is default constructor " + price); // Prints the local price value
    }

    Fruit(int price) { // Parameterized constructor
        System.out.println("This is parameterized constructor " + price); // Prints the passed price value
    }

    void buy() { // Concrete method in the abstract class
        System.out.println("In buy Method"); // Prints a message
    }

    abstract void peel(); // Abstract method to be implemented by subclasses
}

class Apple extends Fruit { // Non-abstract subclass

    void peel() { // Implementation of the abstract method
        System.out.println("In Peel Method"); // Prints a message
    }
}

public class Abstract_class_having_variable_method_and_constructor { // Main class definition

    public static void main(String[] args) { // Main method, entry point of the program
        Apple a1 = new Apple(); // Creating an object of Apple class
        a1.peel(); // Calling the implemented abstract method
        a1.buy(); // Calling the inherited concrete method
    }
}
