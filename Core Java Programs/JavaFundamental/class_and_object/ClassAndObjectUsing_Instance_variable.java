package class_and_object;

class A {
	int rollno; // Instance variable
	String name;
}

public class ClassAndObjectUsing_Instance_variable {

	public static void main(String[] args) {

		A a = new A();// Create object

		a.rollno = 10;// object Inisialization
		a.name = "Abhishek";

		System.out.println("roll number >>" + a.rollno);
		System.out.println("Name is >>" + a.name);

	}

}
