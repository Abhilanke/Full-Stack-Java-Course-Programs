package class_and_object;



class Student1
{
	//instance variable/properties/attributes
    int rollno;      //declare
    String name;
    double marks;
                //     27,"mack",      69.2
	void acceptData(int a,String b,double c)     //here,a,b,c are the local variables
	{
		rollno=a;      //here,rollno,name,marks are the instance variables
		 name=b;     //here,we are assigning the value of local variable b to instance variable name
		marks=c;
	}
	
	void display(  )
	{
		 System.out.println("\nroll number = "+rollno);  //23  //display
		 System.out.println("name = "+name);               //jack
		 System.out.println("marks = "+marks);
		  
	}
	
}            //class ends



public class class_and_object_using_Method 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//new => memory allocation operator => used to reserve space for an object in a memory
		//Student() => constructor => used   to initialize an object in a memory
				//int a=90;
		    
		Student1 jack=new Student1();		    //object creation/instantiation
		jack.acceptData(23,"jack",89.2);		  
		jack.display(   );
				 
	
		Student1 mack=new Student1();	
		  mack.acceptData(27,"mack xyz", 99.2);	  
		  mack.display();
		  
	   Student1 john =new Student1();
	  john.acceptData(29,"johnnny",69.2);
	  
	  
			}

}
