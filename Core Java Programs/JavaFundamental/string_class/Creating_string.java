package string_class;


//String(immutable means non-changeable) ,StringBuffer(mutable means changeable),StringBuilder (mutable means changeable)=>comes under java.lang
//Q1.way String is inmutable?
//ans==> bcz it can be created to mutable.
//example
//String s1="welcome";//1 object  => created scp memory
//String s2="welcome";
//String s3="welcome";
//String s4="welcome";
//suggest string is mutable
// s1.concat("abhi"); //then change all object(same contain) in   memory

public class Creating_string {

	public static void main(String[] args) {
		int a = 98;// variable
		double b = 2.2;// variable
		String s = "Abhi";// here, s is an object

		// 2 ways creating String
		// 1.way
		String s1 = "hello";// 1.Creating string using String literal
		//jvm //One object create =>isme banta hai (scp)=>>(STring constant Pool) ==>it is saparat heap memory part of area
		System.out.println("s1 obejct creating using literal =>"+s1);
		// 2.way
		String s2 = new String("Abhi");// 2.Creating string using String new keyword
		System.out.println("s2 obejct creating using new keyword =>"+s2);
		
		//2 ways differance ==>memory managment
		//craating 1 obejct in (string literal)(Its save memory spece)
		//craating multiple obejct in using (new keyword)
		
		//Q.way java uses te concept of string literal?
		//==>> its save memory spece
		
		//using new keyword
		//heap me every time creating object //heap memory creating object program is exist/stop . then distroy/garbage collector(deleting object) object deleting automatically 
		//scp me one time creating object
		//garbage collector ==>garbage collector (delete object grabage colletion) that way java is rebost
		String s6 = new String("Abhi");  //jvm //creating 2 object(1 object create heap  new keyword)or(2 object create scp bcz = it is string)
		String s7 = new String("Abhishek");//jvm //creating 2 object(1 object create heap  new keyword)or(2 object create scp bcz = it is string)
		String s3 = new String("Abhi");
		String s5 = new String("Abhi");
		String s4 = new String("abhiiiii");
		
		//assingment
		
		//heap memory =4 or  scp memory=5  // 9 object
		String s8 = new String("welcome");//2 create in one is heap  and one is scp
		String s9 = "welcome";//1 create in scp
		String s10 = new String("welcome user");//2 create in heap 
		String s11 = new String("user");//2 create in heap 
		String s12 = "Welcome";//1 create in scp
		String s13 = "welcome user";//1 create in scp
		String s14 = new String("hello user");//2create in heap  or create in scp
		
		
		
		
		
	}

}
