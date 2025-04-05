package class_and_object;

class Product{
	
	int id;
	String name;
	String color;
	int price ;
	
	void getData(int a,String b,String c,int d) {
		id=a;//here,a,b,c are the local variables
		name=b;
		color=c;
		price=d;
	}
	void printData() {
		System.out.println("\nId is >>" +id);
		System.out.println("Name is >>" +name);
		System.out.println("Color is >>" +color);
		System.out.println("Price is >>" +price);
		
	}
}

public class Class_and_Object_Using_Method2 {

	public static void main(String[] args) {
		Product product1=new Product();
		product1.getData(1, "Leptop", "Selver", 24000);
		product1.printData();
		
		Product product2=new Product();
		product2.getData(2, "TV", "Black", 15000);
		product2.printData();
		
		

	}

}
