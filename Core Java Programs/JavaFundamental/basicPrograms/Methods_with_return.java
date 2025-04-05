package basicPrograms;

//datatype/returntype =>byte,short,int,long
//float,double
//char,boolean,String
//int a=99;

//returntype=>void/nothing
class Xyz {
	int add(int a, int b, int c) // here, a,b,c are the formal parameters/arguments
	{
		int d = a + b + c; // 21.6
		int z = 99;
		// System.out.println("add = "+d); //2
		System.out.println("bye"); // 3 //33.9
		return d; // return must be the last statement of any method
					// this return statement returns value of d at a point where we called this
					// method

	}

	// 6
	double areaOfCircle(int r) // pi*r*r
	{
		double pi = 3.14;
		// System.out.println("area of circle = "+pi*r*r);

		return pi * r * r;
	}
}

public class Methods_with_return {
	public static void main(String[] args) {
		Xyz x1 = new Xyz();

		System.out.println(x1.add(33, 21, 2));
		System.out.println(x1.areaOfCircle(6));
	}
}
