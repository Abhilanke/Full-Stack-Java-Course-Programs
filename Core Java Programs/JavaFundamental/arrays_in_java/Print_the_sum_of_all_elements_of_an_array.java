package arrays_in_java;

public class Print_the_sum_of_all_elements_of_an_array {

	public static void main(String[] args) {
		int sum=0;
		int a[] =  { 1,2,3,4 }; // [size] []=>subscript notation
		for (int i = 0; i < a.length;  i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum is >> "+sum);

}

	}


