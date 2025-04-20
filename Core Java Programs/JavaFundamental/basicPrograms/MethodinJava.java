package basicPrograms;

//class and object using method

//functions/methods => it is block of code that we can write once and execute/call it over multiple times
//function creation and execution in 3 stpes
//1.method declaration(outside the main)
//2.method definition(outside the main)
//3.method calling(inside the main)

/*
#functions and methods are same in use and same in syntax but still there are some differences between function and methods

#difference between function and method
#1.function cannot be created inside a class...it can be directly created in program
#1.method should always  be created inside a class

#2.function can be called directly ,without using any object
#2. method must be called either by using object or by using class name


*/
class abc {

	// 1.method declaration => 3 parts=> return type,method name,parameter list
	// void add(int a,double b,float c);

	// 2.method definition(outside the main) => 4 parts=> return type,method
	// name,parameter list,body of the method

	void add(int a, double b, float c) {// here a,b,c formal parameter {

		double d = a + b + c;
		System.out.println("add >> " + d);
		System.out.println("By");

	}

	void areaofCircale(int r) {

		double pi = 3.14;
		System.out.println("Area of circle is " + pi * r * r);
	}

	void Avarage(int a, int b, int c) {

		int d = a + b + c / 3;
		System.out.println("English >>" + a);
		System.out.println("Math >>" + b);
		System.out.println("Hindi >>" + c);
		System.out.println("Avarage is >>" + d);

	}

	void Check(int a) {

		if (a > 18) {
		System.out.println("Eligible to Drive because " + a + " Age above 18");
		} else {
		System.out.println("Not Eligible to Drive because " + a + " Age below 18");
		}

	}

}

public class MethodinJava {

	public static void main(String[] args) {

		abc a1 = new abc();

		System.out.println("Welcome");

		a1.add(20, 2.2, 4.3f);// method calling // 20, 2.2 ,4.3f actual parameters/argument

		System.out.println("Thank u");
		System.out.println();

		a1.add(20, 2.8, 2.9f);

		System.out.println();

		a1.areaofCircale(6);

		System.out.println();

		System.out.println("Assignment 2");

		a1.Avarage(30, 45, 79);

		System.out.println();

		a1.Check(19);

		System.out.println();

		a1.Check(17);

	}

}
