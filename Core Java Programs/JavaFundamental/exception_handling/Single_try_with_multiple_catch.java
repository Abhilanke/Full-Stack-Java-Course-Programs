package exception_handling;
//Q can we handle multiple exception in one try block
//==> no.... only one exception we can handle..... we can handle multiple exception !! we can use nested try block we can handle multiple exception 

public class Single_try_with_multiple_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {45,2,34,5,0,7,72,2};
	    try {
			System.out.println("hi");
			System.out.println(a[10]);//arrayIndex exception //first execute and only this exception showing
		
			System.out.println(a[2]/a[4]);
			System.out.println("bye");
	    	
	    	
	    	
		} catch (ArithmeticException e) {
			System.out.println( e);
		}
	    catch (ArrayIndexOutOfBoundsException e) { //run is's only
			// TODO: handle exception
	    	System.out.println( e);
		}

	}

}
