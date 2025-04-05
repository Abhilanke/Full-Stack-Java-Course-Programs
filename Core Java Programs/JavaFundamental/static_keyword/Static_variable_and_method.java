package static_keyword;

//Static data  =>>  called buy class name
//no-static data=> called by object name

//static data=> called by class name
//non-static data=> called by object name

//1.To call static data...we need not to create an object of a class
//this => is used for calling purpose
//static => is used for declaration purpose..it used to declare instance var,method,block,class as a static
///static/common

//static variable => refers to the COMMOM property of an object...that common property is shared by all the objects of a class
//static method   => accepts only static variable...and sta
//and static method called by  called by class name
//non-static instance variable
//static instance variable
//const => fixed/nonchangeable, static=> common/changeable
//we can reinitialize/change static variable
//static method called by class name
class Emp10{
	
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
}

public class Static_variable_and_method {

	public static void main(String[] args) {
		
		Emp10.change();
		
		Emp10 ram=new Emp10();
		ram.accept(1, "ram");
		ram.Display();
		
		Emp10 sham=new Emp10();
		sham.accept(1, "sham");
		sham.Display();
		
		Emp10 gita=new Emp10();
		gita.accept(1, "gita");
		gita.Display();
		
	
	}

}
