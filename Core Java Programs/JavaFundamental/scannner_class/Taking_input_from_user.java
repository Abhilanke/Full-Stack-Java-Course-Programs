package scannner_class;

import java.util.Scanner;

//c => scanf()  => function => stdio.h  header file
//cpp => cin>>  => object   => OutputStream class 
//java => Scanner => class  => java.util package(package means collection of classes)
//stream/container => is a container which stores data in the form of sequence of characters
public class Taking_input_from_user {
	// stream/container => stream is a container which store data in the form of
	// sequeance of character
	// three types stream
//	1.output stream= System.out
//	2. input stream=System.in
//	3.error straem=System.err
	public static void main(String[] args) {
		int a;
		float b;
		double c;
		System.out.println("Enter 3 number : >> ");
		Scanner scan = new Scanner(System.in);// scanner is paramiterzed
		// System.in is an input stream which hold data
		// to access that data from System.in stream
		// System.in is an input stream which holds/stored data entered by the user on
		// the console
		// to access that data from System.in stream we need to use sc.nextType() method

		a = scan.nextInt();
		b = scan.nextFloat();
		c = scan.nextDouble();
//		scan.nextLong()
//		scan.nextBoolean();
		// sc.nextLong()
		// sc.nextBoolean()
		// sc.nextByte()
		// sc.nextShort()

		// string => nextLine() or next()
		// char => next()
//		

		System.out.println("Addition is > " + (a + b + c));

	}

}
