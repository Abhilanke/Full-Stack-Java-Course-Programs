package class_and_object;


//constructor => Constructor is a special type of method which is used to initialize
//an object
//1.Constructor name should always be SAME ad class name
//2.Constructor  does not have a return type,not even void
//3.Constructor should always be called at a time of object creation
//4.Constructor should never be called by using object and dot operator...instead it called at a time of obejct creation

//method
//1.Method name should always be different from class name
//2.method should should always have a return type
//3.method should always be called AFTER object creation
//4.Method should always called by using object and dot operator

//types of constructor
//1.parameterized constructor
//2.non-parameterized/default/no-arg constructor
//3.copy constructor(in c++)/object cloning(in java)



class Product1
{
	//id,name,color,price
	int pid;
	String name;
	String color;
	double price;

	
	//1.parameterized constructor => which consists of some parameters
	          //2252     bag    white     1500
	Product1(int p,String n,String c,double r)
	{
			 pid=p;
			 name=n;
			 color   =c;
			 price= r;
    }
	
	//2.default/non-parameterized/no-arg constructor => which does not have any parameters
	Product1( )
	{
			 pid=123;
			 name="shoes";
			 color   ="brown";
			 price= 2000.2;
			  
    }

	//printData
	void printData()
	{
		System.out.println("\nProduct name is :"+name);
		System.out.println("Product id is :"+pid);
		System.out.println("Product color is :"+color);
		System.out.println("product price is :"+price);
		
	}
	
}





public class class_and_object_using_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		  Product1 p1=new Product1(2252,"bag", "white", 1500.1); //parameterized constructor calling
		    //p1.getData(2252,"bag", "white", 1500.1);
		    p1.printData();
		    
		   
		    
		    Product1 p2=new Product1();    //default constructor calling
		    p2.printData();   
		    
		    Product1 p3=new Product1();    //default constructor calling
		    p3.printData();   
	}

}
