package class_and_object;


class Student
{
	//instance variable/properties/attributes
    int rollno;      //declare
    String name;
    double marks;
    

}

public class class_and_object_using_instance_var2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		//new => memory allocation operator => used to reserve space for an object in a memory
		//Student() => constructor => used   to initialize an object in a memory
		//int a=90;
      Student jack=new Student();		    //object creation/instantiation
		  jack.rollno=23;   //JVM           //object initialization
		  jack.name="jack";
		 jack.marks=89.2;
		 
		 System.out.println("roll number = "+jack.rollno);  //display
		 System.out.println("name = "+jack.name);
		 System.out.println("marks = "+jack.marks);
		  
	  Student mack=new Student();	
	  mack.rollno=27;   //JVM
	  mack.name="mack xyz";
	 mack.marks=99.2;

	 System.out.println("roll number = "+mack.rollno);
	 System.out.println("name = "+mack.name);
	 System.out.println("marks = "+mack.marks);
	
	}

}
