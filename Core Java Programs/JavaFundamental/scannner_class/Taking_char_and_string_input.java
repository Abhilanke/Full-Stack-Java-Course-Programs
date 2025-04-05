package scannner_class;
//next() => method takes an input till next word occurres in an input(means it doens not take an input after the space)
	 //nextLine() => method takes an input till next line occurres in an input(means it take an input after the space till next line)
import java.util.Scanner;

class Student {
	int rno;
	String name;
	char div;
	double marks;

	void accept() {

		System.out.println("Enter detail like : rno ,name, div , marks : >> ");
		Scanner scan = new Scanner(System.in);

		// run
		name = scan.nextLine();
		div = scan.next().charAt(0);
		marks = scan.nextDouble();
		rno = scan.nextInt();
		/*input
		Enter detail like : rno ,name, div , marks : >> 
		Abhishek Lanke
		A
		77.8
		1
		 output
		rno >> 33
		Name >> Abhishek lanke
		div >> h
		marks >> 2.2*/

		// error=>> rno=77 enter then (enter is also charecter/String types ) enter
		// consiter as String

		// not use first int
//		rno=scan.nextInt();
//		name=scan.nextLine();
//		div=scan.next().charAt(0);
//		marks=scan.nextDouble();
		// above code output
//		rno >> 88
//		Name >> prese enter (but not Showing enter)
//		div >> h
//		marks >> 8.8

		// run
//	    rno=Integer.parseInt( scan.nextLine()); //here, we are taking rno input in a string format and then we are converting that into int value using Integer.parseInt() method
//		name=scan.nextLine();
//		div=scan.next().charAt(0);
//		marks=scan.nextDouble();

		//not use first int //solve error using double name=scan.nextLine();
//		rno=scan.nextInt();
//		name=scan.nextLine();
//		name=scan.nextLine();
//		div=scan.next().charAt(0);
//		marks=scan.nextDouble();

	}

	void disp() {
		System.out.println("rno >> " + rno);
		System.out.println("Name >> " + name);
		System.out.println("div >> " + div);
		System.out.println("marks >> " + marks);

	}
}

public class Taking_char_and_string_input {

	public static void main(String[] args) {
		Student a = new Student();
		a.accept();
		a.disp();

	}

}
