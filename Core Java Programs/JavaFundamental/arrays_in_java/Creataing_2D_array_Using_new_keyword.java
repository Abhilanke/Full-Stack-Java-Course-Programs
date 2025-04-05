package arrays_in_java;

public class Creataing_2D_array_Using_new_keyword {

	public static void main(String[] args) {
		
		
		int x[][] = new int[4][3];

		x = new int[][] {
			    { 1, 2, 3 }, // array inisialization
				{ 3, 4, 5 },
				{ 2, 3, 5 }, 
				{ 2, 4, 3 } }; // 3x4

		// nested for loop
		// i for loop is started i=0; then go to j loop and j loop false{complte loop},
		// again back to i loop and icre value i = 1; then go to j for loop.
		for (int i = 0; i < 4; i++) {// row //syntex => Array.length

			// j for loop is false then i for loop get started again
			for (int j = 0; j < 3; j++) {// column
				// a[0][0]
				System.out.print(x[i][j] + " ");
			}
			System.out.println();

		}
		
		// dynemic loop
		for (int i = 0; i < x.length; i++) {// row //syntex => Array.length

			// j for loop is false then i for loop get started again
			for (int j = 0; j < x[i].length; j++) {// column //here x[i].length; 
				// a[0][0]
				System.out.print(x[i][j] + " ");
			}
			System.out.println();

		}
	}

}
