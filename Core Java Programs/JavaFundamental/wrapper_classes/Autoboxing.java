package wrapper_classes;
//Wrapper class = 8 ==> java.lang inside => inmutable type classes

//Wrapper class => 8 => comes under java.lang -=>and  immutable classes

//int => Integer
//double => Double
//float => Float
//long   => Long
//boolean => Boolean
//char    => Character
//byte  => Byte
//short => Short


//Q. is java 100% purely object oriented programing language ??
//=> Not bcz ==primitive datatypes from c language ( comination of c and java c is not object orianted programing language)


//Q2.what is the need of Wrapper classes?
//==>> wrapper classes convert primitive values into an object
public class Autoboxing {

	public static void main(String[] args) {
		
		//JVM => takes every data in the form of object but user passes  data in the form of primitive values so wrapper classes
    	//converts that primitive values into an object
    	
    	
    	//conversion of primitive value into an object called as autoboxing.....
    	//conversion of object into  primitive values called as autoUnboxing.....
		
		/*
		int a=67;
		
		System.out.println("Primitive value "+a);
		
		//Integer o=Integer.valueOf(a);//here, value of converts primitive value a into an object O using wrapper class Integer
                                        //and this process is called "boxing"
		
		//automatic Integer o=Integer.valueOf(a);//
		Integer o=a; //Autoboxing ==> bcz here "boxing happens without any 
		
		System.out.println("Object value is = "+a);//67
*/
         char o='f';
		
		System.out.println("Primitive value "+o);
		
		//Character z=Character.valueOf(o);//here, value of converts primitive value a into an object O using wrapper class Integer
                                        //and this process is called "boxing"
		
		//automatic Character z=Character.valueOf(o);//
		Character b=o; //Autoboxing ==> //autoboxing => because, here "boxing" happens without any method
		
		System.out.println("Autoboxing "+b);
		
	}

}
