package class_and_object;

class Student2{
	
	int rollno;//here,rollno,name,marks are the instance variables
	String name;
	double marks;
	
	void add(int a,String b,double c) {
		rollno=a;//here,a,b,c are the local variables
		name=b;////here,we are assigning the value of local variable b to instance variable name
		marks=c;	
	}
	void Display() {
		System.out.println("Roll No is >>"+rollno);
		System.out.println("Roll No is >>"+name);
		System.out.println("Roll No is >>"+marks);
	}
}

public class Class_and_Object_Using_Method {

	public static void main(String[] args) {
		Student2 student=new Student2();
		//new => memory allocation operator => used to reserve space for an object in a memory
				//Student1() => constructor => used   to initialize an object in a memory
		
		student.add(12, "abhi", 12.2);
		student.Display();
		
		student.add(13, "Kunal", 22.2);
		student.Display();
		
		student.add(12, "Amol", 24.2);
		student.Display();
		

	}

}
