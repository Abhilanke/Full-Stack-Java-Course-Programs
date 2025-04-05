package class_and_object;

//functions/methods => it is block of code that we can write once and execute/call it over multiple times
//function creation and execution in 3 steps
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


class Abc
{
	//1.method declaration  => 3 parts=>  return type,method name,parameter list
	//void add(int a,double b,float c);


	//2.method definition(outside the main)  => 4 parts=>  return type,method name,parameter list,body of the method
	           //20   12.5        30.7
	void add(int a,double b,float c)      //here, a,b,c are the formal parameters/arguments
	{
		double d=a+b+c;     //21.6
		System.out.println("add = "+d);  //2
		System.out.println("bye");  //3
	}
	//averageOfmarks(math,sci,eng)
	//checkEligibility(age)   
	
	
                        //6
	void areaOfCircle( int r   )   //pi*r*r
	{ 
		 double pi=3.14;
		 System.out.println("area of circle  = "+pi*r*r);
		
	}
}
public class Methods_in_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abc a1=new Abc();
		
		System.out.println("hello"); //1
		a1.add(2,4.5,2.3f);       //method calling   //here,2,4.5,2.3 are the actual parameters/arguments
		System.out.println("thank u");  //
		a1.add(20,12.5, 30.7f);
		a1.areaOfCircle(6);
		
	}

}
