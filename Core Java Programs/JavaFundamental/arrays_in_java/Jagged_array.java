package arrays_in_java;
// its also 2d array

//Jagged_array ==>. each row  consist of different number of columns 
//Jagged_array is a  special type of array which consists of different number of columns in each row

public class Jagged_array {

	public static void main(String[] args) {
	
		// r c
		int a[][] = new int[4][]; // 4 rows, 3 cols //array declaration

		a = new int[][] { // 0 1 2 //array initialization
				{ 3, 4, 1 }, // 0
				{ 11 }, // 1
				{ 8, 4 }, // 2
				{ 12, 8, 4, 1 } // 3
		};

		System.out.println("accessing ALL elements : ");
		// nested for loop
		for (int i = 0; i < 4; i++) // row
		{
			for (int j = 0; j < a[i].length; j++) // column //here,a[i].length means the length of current row bcz,we
													// have used to in outer for loop which indicates current row number
													// hence this j loop should get run according to the length of
													// current row
			{
				// a[1][3]
				System.out.print(a[i][j] + ","); // 3,4,1,6
													// 11,2,7,8

			}
			System.out.println();
		}

	}

}