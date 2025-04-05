package exception_handling;
//using "try catch" we can handle Runtime(unchecked) exception

//using "throws" we can handle Compile time(checked)
class ThrowDemo {

	static void checkEligibility(int age, int weight) throws Exception {

		if (age > 12 && weight <= 45) {
			System.out.println("You are eligible to register ");
		} else {

			// here ,throw keywords throw an userdefine exception
			throw new ArithmeticException("You are eligible to register ");

		}
		System.out.println("Registration Sucessfully");
		System.out.println("You can continue by login on to the System....");
	}
}

public class Creating_userdefine_exception_using_throw_keyword {

	public static void main(String[] args) throws Exception {

		ThrowDemo.checkEligibility(13, 33);
		// ThrowDemo.checkEligibility(10, 33);

	}

}
