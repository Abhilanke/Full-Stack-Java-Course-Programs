package exception_handling;
/*
 ****Errors V/s Exceptions In Java
An Error indicates serious problems that a reasonable application should not try to catch. 
Both Errors and Exceptions are the subclasses of java.lang.Throwable class. 

Errors are the conditions which CANNOT get recovered by any handling techniques. 
It surely cause termination of the program abnormally. 

Errors belong to unchecked type and mostly occur at runtime

An Exception indicates conditions that a reasonable application might want to catch. 
Exceptions are the conditions that occur at runtime and may cause the termination of 
program. But they are recoverable using try, catch and throws keywords. 
It is mostly caused by the program written by the programmer.
 */

//StackOverflowErr

class A {

	void m1() {
		this.m2();
	}

	void m2() {
		this.m1();
	}

}

public class Error_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		a1.m1();// infinity showing error
	}

}
