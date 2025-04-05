package arrays_in_java;
//in Java ,array is also considered as an object...
public class Creating_1D_array_using_new_keyword {
	
	public static void main(String[] args) {
        // Correct way to declare and initialize an array with values
        int array1[] = {1, 2, 3, 4, 5, 6, 7, 8};

        // Creating an array using the 'new' keyword
        int array2[] = new int[8]; // This will initialize with default values (0s)

        // Assigning values manually
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1; // Assigning values 1 to 8
        }
        // Printing both arrays
        System.out.println("Array1 (direct initialization):");
        for (int num : array1) {
            System.out.print(num + " ");
        }

        System.out.println("\nArray2 (initialized using new keyword):");
        for (int num : array2) {
            System.out.print(num + " ");
        }
    }	
}

