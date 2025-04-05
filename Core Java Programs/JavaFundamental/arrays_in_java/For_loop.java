package arrays_in_java;
//loops are used to execute set of statements  again and again until given condition is false

//in c c++
//1.for loop
//2.while loop
//3.do while loop

//in java
//1.for loop
//2.while loop
//3.do while loop
//4 for each loop => collection frameworks
public class For_loop {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("Hello");

		// 10 time => 1 to 10
		// for(initialization ; condition; incre/decre)
//		{
		// body of the loop
//		}
		// for loop execution step 1 initialization
		// for loop execution step 2 condition
		// for loop execution step 3 execution of body
		// for loop execution step 4 encre/decre
		// body of the loop
		for (int i = 0; i <= 10; i++) {
			System.out.println("Bye : " + i);

		}

		// odd number serias
		for (int i = 1; i <= 50; i = i + 2) {
			System.out.println(i);

		}
		// even number serias
		for (int i = 0; i <= 50; i = i + 2) {
			System.out.println(i);

		}
		// reverse number serias
		for (int i = 50; i >= 1; i = i--) {
			System.out.println(i);

		}

	}

}
