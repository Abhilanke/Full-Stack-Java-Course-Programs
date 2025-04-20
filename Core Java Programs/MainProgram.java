package javaEightFeatures;

public class MainProgram {

	public static void main(String[] args) {
		
//		 Myinterface i=new  Myinterface();
//		 {
//			 
//			 
//		 }
//		 i.sayHello();
		
		//Implementing interface using lambda expression/
	    Myinterface mi=()->
	    {
	        System.out.println("Implementing interface using lambda expression");
	    };
	    mi.sayHello(); // calling function
	    
	    //Writing second implementation 
	    Myinterface mi2=()->
	    {
	        System.out.println("Implementing interface using lambda expression second time");
	    };
	    mi2.sayHello(); // calling function
	}

}
