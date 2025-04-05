package exception_handling;
//Exception handling keywords/blocks {}
//try,catch,finally,throw,throws

//try block must be followed by catch or finally
public class Handling_an_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//try block consists of code that might generates an exception
		int a = 7, b = 0;

		System.out.println("hi"); // 7/
		try {
			System.out.println("try starts");
			System.out.println("div =" + a / b); // 3.5
			System.out.println("try end");//this line will not execute bcz, the above line contains an exception and from that line control jumps onto the catch block and it will never get back onto try block to execute remaining code
			// catch block will get execute only when there is an exception in the try block
			//catch blocks will get execute only when there is an exception in the TRY block
		}
		////handle only ArithmeticException exception
		
		//this catch  block is specific to handle only ArithmeticException
		//catch block catches the exception which is thrown  by try block
		catch (ArithmeticException e) {
			System.out.println(e);
			
			System.out.println(e.getMessage());
			
			System.out.println(e.getMessage());
			
			e.printStackTrace();//printStackTrace() prints the line no on which exception occurres in a try block
		} 
		//handle all exception
		catch (Exception e) {
			//showing exeption + exception
			System.out.println(e);
			//only showing massage
			System.out.println(e.getMessage());
		}
		/*
		catch(Exception      e)      //this catch  block is GENERALISED to handle ALL the types of exception
		{
			System.out.println("in catch2 : "+e);
			
		}*/

		System.out.println("bye");
		System.out.println("add = " + (a + b)); // 9

	}

}
