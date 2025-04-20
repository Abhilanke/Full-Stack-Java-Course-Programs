package encapsulation;

//Encapsulation =>> ist use to provide Security

//1.purpose => To Provide Security to the data

//2.defination=> Binding Of data in class Is Called Encapsulation

//3.Example=> capsule,CD

//4.How To Implement?
//1.Declared all the instance var as a private
//2.define Setter and getter all the veriable

//5. Programs



//java is Secure... => 1.bcz,we don't have pointers in java
///                    2. we have the concept of encapsulation

//1.purpose =>  is used to provide security to data 
//2.definition => it the process of binding/wrapping data members(instance var)
//and member function(instance method) together in one single unit(class) is called as encapsulation...
//3.e.g   CD, Capsule,Chocolate
//4.how to implement?
//1. by declaring  all the instance var as a private
//2. by defining setter/method and getters for all the variables
//5.program





/*Setters and getters are the conventional/traditional methods of a java in 
* which setters are used to set/initialize/change
the value of instance variable whereas getters are used to get the value of instance var

and through setters and getters we can set or get the values separately rather 
than setting and getting it by using one single method or constructor(like accept)

*/
//why we need to create setter and getters?
//=> through the setter and getters we can initialize single property of an object at a time
//so that the property will be more secure

class login {

	private String name;
	private String pass;

	public String getName() {// getter method
		return name;
	}

	public void setName(String name) {// setter Method
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}

public class EncapsulationDemo {

	public static void main(String[] args) {
		login a1 = new login();
		// a1.uname;//Declaration =>its not use

		a1.setName("Abhi");
		System.out.println("Username >> " + a1.getName());

		a1.setPass("Java");
		System.out.println("Password >> " + a1.getPass());

	}

}
