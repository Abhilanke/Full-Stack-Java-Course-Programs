package arrays_in_java;

public class Reversing_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] =  { 1, 2, 3, 4, 5, 6 }; // [size] []=>subscript notation
         
		for (int i = a.length-1; i >=0 ; i--) {//syntex => Array.length-1 for reverse

			System.out.println(a[i] + ",");
		}
		
	}

}
