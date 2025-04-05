
package encapsulation; // Package declaration to organize the class within 'encapsulation' package

class Leptop { // Class definition for Leptop
    int a = 93872; // Instance variable with default access modifier

    void disply() { // Method to display the value of 'a'
        System.out.println(a); // Prints the value of 'a' to the console
    }
}

public class Encapsulation1 { // Main class definition

    public static void main(String[] args) { // Main method, entry point of the program
        Leptop a1 = new Leptop(); // Creating an object of Leptop class
        a1.disply(); // Calling the display method to print the value of 'a'
    }
}
