package arrays_in_java;
//2D_Array>> d for dimention

//2d Arrays ==> array is a collection multiple 1D arrays 
//2d arrays ==>array is nothing but array of arrays

public class Creating_2D_array {

	public static void main(String[] args) {
		// 1. [] rows //2. [] colum
		int a[][] = { { 1, 2, 3, 4, }, { 3, 4, 5, 3 }, { 2, 3, 5, 4 } }; // 3x4
		System.out.println("lenght od 2d arrays, a= " + a.length); // 3
		System.out.println(a[1][2]);
		System.out.println(a[2][0]);
		// System.out.println(a[2][10]);//exception

		// nested for loop
		// i for loop is started i=0; then go to j loop and j loop false{complte loop},
		// again back to i loop and icre value i = 1; then go to j for loop.
		for (int i = 0; i < 3; i++) {// row //syntex => Array.length

			// j for loop is false then i for loop get started again
			for (int j = 0; j < 4; j++) {// column
				// a[0][0]
				System.out.print(a[i][j] + " ");
			}
			System.out.println();

		}
	}

}
