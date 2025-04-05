package exception_handling;

//Q 
public class Handling_multiple_exeption_using_nested_try_catch {

	public static void main(String[] args) {

		int a[] = { 45, 2, 34, 5, 0, 7, 72, 2 };
		try {   //outer try
			
			System.out.println("hi");
			
			try {         //nested try
				
				System.out.println(a[10]);// arrayIndex exception
			
			
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println("in catch2 : "+e);
			}
			
			System.out.println(a[2] / a[4]);// arith  exception

		}
//	    System.out.println("by");
		
		catch (ArithmeticException e) {
			System.out.println("in catch1 : "+e);
		}
		System.out.println("bye");
		System.out.println("array in first element/position : "+a[0]);
		System.out.println("array in last element/position : "+a[a.length-1]);

	}

}
