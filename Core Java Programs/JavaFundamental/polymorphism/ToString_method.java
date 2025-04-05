package polymorphism;

//String => class, Object => class, Class= L

class Stud // extends Object
{
	int rollno;
	String name;
	double marks;

	Stud(int rollno, String name, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public String toString() {
		return rollno + " " + name + " " + marks;
	}

}

public class ToString_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stud s1 = new Stud(11, "jay", 82.2);
		System.out.println(s1); // whenever we are going to print an object of the class then we need to defined
								// toString method in that class
		// @626b2d4a => hashCode? => hashcode is nothing but it is an unique integer no
		// assign by the JVM to each and every object of the class

		// toString=> Object

		System.out.println(s1.hashCode());
	}

}