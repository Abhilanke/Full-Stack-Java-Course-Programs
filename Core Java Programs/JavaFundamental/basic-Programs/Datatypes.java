package basicPrograms;

//statically(compile) typed programming language =>c,cpp,java

//c datatypes => int,short, long,char, float,double 
//non primitive in c => array,structure,pointer,union

//cpp datatypes => int,short, long,char, float,double ,bool,string

//java  =>           int,short, long,char, float,double ,boolean,String,byte

//primitive/inbuilt datatype(8 datatypes)  => 

//numeric datatype
//byte,short,int ,long,  => whole numbers 
//float,double         => floating point numbers

//non-numeric datatype
//char,boolean,

//student => 56,"jay",67.7,"pune"

//non-primitive/userdefined datatype =>String, class,object,array,interface

public class Datatypes {

	public static void main(String[] args) 
	{
		//size
	   byte a=123;	     //1 byte => 8bits 01011111       //-128 to +127       -128..., -2,-1 0 +1,+2.........+127
	   System.out.println(a);
		
	   short  b=32765;    //2 bytes
	   System.out.println(b);    //-32768 to 32767
	   
	   //32bit => 2bytes, 64bit=> 4bytes
	   int c=123;        //4bytes
	   System.out.println(c);     //-2147483648 to 2147483647  
	   
	   long phone=71474568887777l;   //8bytes
	   System.out.println(phone);
	   
	   float x=34.688388328328328f;  //4 bytes  //The float is not as accurate as it has less precision beacuse it is smaller than double in precision
                                     //The precision of float is a only six or seven decimal digits. 

	   double y=34.688388328328323; //8 bytes   //The precision of double is a 15 decimal digits.	
	   
	  System.out.println("float value of x = "+x);
	   System.out.println("double value of y = "+y);
	   
	   boolean bl=true;    //true=1,false=0  //1 bit => either 0 or 1
	   System.out.println(bl);
	   
	   char ch='y';           //2 bytes
	   System.out.println(ch);
	   
	   String s= "welcome";   //size=14, length=7
	   System.out.println(s); 
	   
	   //compiler,interpreter=> JVM
	}

}
