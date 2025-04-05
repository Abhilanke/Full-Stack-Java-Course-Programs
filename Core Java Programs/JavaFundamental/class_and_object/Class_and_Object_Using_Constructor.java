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


class Product4 {

	int id;
	String name;
	String color;
	int price;

	// defult Constructor  /non-parameterized/no-argument Contructoer >>Which have NO any Paramitere
	//2.default/non-parameterized/no-arg constructor => which does not have any parameters

	Product4() {
		
		// Showing Error becuse its not inisialized value
//		id = a;// here,a,b,c,d are the local variables
//		name = b;
//		color = c;
//		price = d;

		id = 3;
		name = "Tea";
		color = "Black";
		price = 200;
	}

	// Constructor >> It used to initialized the property of object
	// Constructor Not Use Return Type Void
	////1.parameterized constructor => which consists of some parameters

	public Product4(int a, String b, String c, int d) {
		
		id = a;// here,a,b,c,d are the local variables
		name = b;
		color = c;
		price = d;
	}

//	//method
//	void getData(int a,String b,String c,int d) {
//		id=a;//here,a,b,c are the local variables
//		name=b;
//		color=c;
//		price=d;
//	}
	void printData() {
		
		System.out.println("\nId is >>" + id);
		System.out.println("Name is >>" + name);
		System.out.println("Color is >>" + color);
		System.out.println("Price is >>" + price);

	}

	// Disply is Not use Constructor its not good programing concept
//	public Product4()  {
//		System.out.println("\nId is >>" + id);
//		System.out.println("Name is >>" + name);
//		System.out.println("Color is >>" + color);
//		System.out.println("Price is >>" + price);
//
//	}
}

public class Class_and_Object_Using_Constructor {

	public static void main(String[] args) {

		Product4 product1 = new Product4(1, "Leptop", "Selver", 24000);
		// product1.getData(1, "Leptop", "Selver", 24000);
		product1.printData();

		Product4 product2 = new Product4(2, "TV", "Black", 15000);
		// product2.getData(2, "TV", "Black", 15000);
		product2.printData();

		Product4 product3 = new Product4();//default constructor calling
		// product2.getData(2, "TV", "Black", 15000);
		product3.printData();

		Product4 product4 = new Product4();//default constructor calling
		// product2.getData(2, "TV", "Black", 15000);
		product4.printData();

	}

}
