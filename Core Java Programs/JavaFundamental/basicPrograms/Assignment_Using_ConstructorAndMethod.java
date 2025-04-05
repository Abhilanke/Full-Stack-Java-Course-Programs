package basicPrograms;

class Prod {

	// here,a,b,c,d are the Globle variables
	int id;
	String ctmname; //Instance variable/Object Variable
	String prodname;
	String color;
	int price;

	// Constructor >> It used to initialized the property of object
	//Instance Method
	public Prod(int a, String b, String c,String d, int e) {

		// here,a,b,c,d are the local variables
		id = a;
		ctmname = b;
		prodname=c;
		color = d;
		price = e;
	}

	// Method >> To Create Printing product Data
	void printData() {
		this.massage();//massage method Create Same class using
		System.out.println("\nId is >>" + id);
		System.out.println("Name is >>" + ctmname);
		System.out.println("Name is >>" + prodname);
		System.out.println("Color is >>" + color);
		System.out.println("Price is >>" + price);

	}
	void massage() {
		System.out.println("Welcome");
	}
}
//Main CLass
public class Assignment_Using_ConstructorAndMethod {

	public static void main(String[] args) {

		// constructor calling
		Prod product1 = new Prod(1, "Abhi","Leptop", "Selver", 24000);
		// calling Object
		product1.printData();
		// constructor calling
		Prod product2 = new Prod(2, "Kunal","TV", "Black", 15000);
		// calling Object
		product2.printData();

	}

}
