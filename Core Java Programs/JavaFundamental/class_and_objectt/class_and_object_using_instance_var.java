package class_and_object;

//non-primitive/userdefined => class, object

//Purpose:
//Why we need to create class and object?
//class=> to declared/define data/instance var which  going to be processed in our appl we need to define a class
//object => object is used to access data(instance variable/properties,methods) from outside that class

//Definition:
//class(must be created outside the main method) => class is userdefined datatype and it is collection of object

//object/instance(we can create an object inside main) => object is any realworld entity  OR
                //object is one of the part/instance of class



//Examples:
//class                                   //object                    //properties/attributes
//1.Student                             //ram,sham                   //rno,name,age,marks              
//2.Vehical                             //bus,bike,car               //color,price,model,type
//3.Movie                              //crew,xyz                    //type, duration,
//4.Family                             //mother,father....
//5. EleDevice   



class User        //outside main
{
	 String name;   //instance variables/properties/attributes declaration
	 int age;
	  double marks;
  
  //methods/function
	  void get()
	  {
		  name="jay";          //initializing properties of an object or instance var initialization
	     marks=78.8;
	     age=34;
	  }
	  
	  
	  void printData()
	  {
		  System.out.println(name);
	      System.out.println(age);
	      System.out.println(marks);
	      System.out.println();
	  }
  
  //constrcutors
}    //class close


public class class_and_object_using_instance_var
{
	public static void main(String[] args) 
    {
      User yash=new User();     //object creation
       get()
      printData()
     
			
		User ram=new User();             //object creation
	get()
	printData()
		
			
			User  gita=new User();
			get()
			 printData()
					
			
			 	  
	}
}


//static =>called by class name
//non-static => called by object name