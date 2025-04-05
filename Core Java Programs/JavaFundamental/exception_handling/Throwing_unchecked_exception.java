package exception_handling;

public class Throwing_unchecked_exception {
	 
		 //function to check if person is eligible to vote or not
		 public static void check(int age){
		 if(age<18){
		 //throw Arithmetic exception if not eligible to vote
		 throw new ArithmeticException("Person is not eligible to vote");
		 }
		 else{
		 System.out.println("Person is eligible to vote!!");
		 }
		 }
		 public static void main(String args[] ){
		 //calling the function
		 check(17);
		 System.out.println("final code");
		 }
		 }

