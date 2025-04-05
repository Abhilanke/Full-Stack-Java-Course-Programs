package static_keyword;

//instance initializer block
//static block
//types  of Blocks
//1.instance initializer block
//2.static block
//blocks should be called automatically but they are called before the constructors and method
//among  instance initializer and static block..the static block will get execute first and it is execute only once in the program
//after static block instance initializer block will get execute(means at a time of object creation  instance initializer block will get called) by the each and every object
//we can define multiple static blocks in one class
//class members includes variables,methods,constructors,and blocks
class Emp11{
	
	int eid;
	String name;
    static	String uname="infosys";
	
	void accept(int eid,String name)
	{
		this.eid=eid;
		this.name=name;
		this.uname=uname;
		
	}
	void Display() {
		
		System.out.println(""+eid);
		System.out.println(""+name);
		System.out.println(""+uname);
	}
	static void change() {
		
		uname="TCS";
		System.out.println("Change...");
		
	}
	
	//instance initializer block => is used to initialize instance var(non static)
	  { 
		eid=111;
		name="yash";
		System.out.println("in instance initializer block......");
	 }
	  
	  
	 
	 //static block => is used to initialize static instance var
	 static  
	 {
		 uname="tcs";
		 System.out.println("in static block1.....");
	 }
}


public class Static_Block {

	public static void main(String[] args) {
//		//Emp11 ram=new Emp11(1,"ram");
//		ram.Display();
//		
//		//Emp11 sham=new Emp11(1, "sham");
//		sham.Display();
//		
//		//Emp11 gita=new Emp11(1, "gita");
//		gita.Display();

	}

}
