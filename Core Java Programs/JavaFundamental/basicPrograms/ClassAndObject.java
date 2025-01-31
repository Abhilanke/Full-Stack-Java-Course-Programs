package basicPrograms;
//class and object using instance variable?
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




class user{
	String name;       //instance variable
	int age;
	int marks;
}
public class ClassAndObject {

	public static void main(String[] args) {
		
		user yash=new user();
		yash.name="yash";
		yash.age=20;
		yash.marks=89;
		
		System.out.println("Name : "+yash.name);
		 
		System.out.println("Age : "+yash.age);
		
		System.out.println("Marks : "+yash.marks);
		
		System.out.println();
		
		user om=new user();
		om.name="om";  //instance variables/properties/attributes declaration
		//initializing properties of an object or instance var initialization
		om.age=24;
		om.marks=70;
		
		System.out.println("Name : "+om.name);
		 
		System.out.println("Age : "+om.age);
		
		System.out.println("Marks : "+om.marks);	

	}

}
