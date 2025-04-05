package arrays_in_java;

public class String_Reversing_an_Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a[] =  {'h','e','l','l','o' }; // [size] []=>subscript notation
        
		System.out.println("before String_Reversing_an_Array Is \n");
		for (int i = 0; i <a.length ; i++) {//syntex => Array.length-1 for reverse

			System.out.print(a[i]);
		}
		
		System.out.println("\n after String_Reversing_an_Array Is \n");
		for (int i = a.length-1; i >=0 ; i--) {//syntex => Array.length-1 for reverse

			System.out.print(a[i]);
		}
		
	}

}
