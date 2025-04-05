package class_and_object;


class Product
{
	//id,name,color,price
	int pid;
	String name;
	String color;
	double price;
	
	
	//getData()
	 void getData(int p,String n,String c,double r)
	 {
		 pid=p;
		 name=n;
		 color   =c;
		   price= r;
		  
	 }
	
	
	//printData
	void printData()
	{
		System.out.println(" Product name is :"+name);
		System.out.println("Product id is :"+pid);
		System.out.println("Product color is :"+color);
		System.out.println("product price is :"+price);
		
	}
	
}



public class class_and_object_using_Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		  Product p1=new Product();
		    p1.getData(2252,"bag", "white", 1500.1);
		    p1.printData();
		    
		    Product p2=new Product();
		    p2.getData(1552,"watch", "black", 2400.1);
		    p2.printData();   
	} 

}
