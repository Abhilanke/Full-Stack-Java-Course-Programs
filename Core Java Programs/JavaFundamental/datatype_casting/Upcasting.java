package datatype_casting;

import java.lang.reflect.Array;
import java.util.Arrays;

//casting means conversion of one datatype into another datatype
//datatype casting => converts one datatype into another datatypes
//1.upcasting/widening(conversion of smaller size datatype into larger size)
//upcasting will be done automatically by the compiler

//2.downcasting/narrowing(conversion of larger size datatype into smaller size)
//downcasting will be done explicitely by using cast operator

//8 primitive
//int,short,long,double,float,char,boolean,byte
//boolean(1-bit)=>byte(1)=>char(2)=> short(2)=> int(4)=>float(4)=>long(8)=>double(8)   =>String

public class Upcasting 
{
public static void main(String[] args) 
{
   
    /*
      //1. int(4)  to double(8)
     int a=8;     //8.0
     System.out.println("int value = "+a);  //8
     
      double z = a;
     System.out.println("double value = "+z);   //8.0
    */
 
   /* 
    //2.char(2)  to int(4)
    char ch='B';
    
    System.out.println("character value = "+ch);  //B
    
     int   x = ch;
     
     System.out.println("int value = "+x);    //66 
     */
     
     /*
	   //3. byte(1) to char(2)   => upcasting
	    byte b=67;                 //-128 to +127
	   
	   System.out.println("byte value = "+b); 
	     char g=      (char)b;   //cast operator
	     System.out.println("char value = "+g);  
	   */
	/*
	//4. string to int(4 byte) conversion  //Integer.parseInt()
	String s1="4";  //here ,we are converting string s1="4" into int 4;
	String s2="7";
	
	System.out.println(s1+s2); //47
	
	int a =Integer.parseInt(s1);
	int b =Integer.parseInt(s2);
	
	System.out.println(a+b); //11
	*/
	
	
	/* 
    //5. int to string
    
    int a=7;
    
    // String s =a; 
     System.out.println(a);
     String b=String.valueOf(a);   //7 , "7"
               
     String s =b; 
     
    System.out.println(s);
    */
    
 //6. boolean to string
    
   /* boolean bl=true;
    
    // String s =a; 
     System.out.println(bl);   //true
     String b=String.valueOf(bl);   //"true"
               
     String s =b; 
     
    System.out.println(s);
    */
    
  /*  
//7. boolean(1 bit) to  int(4 byte)
    
    boolean x=true; //true =1 ,flase=0;
 
    System.out.println(x);
    
    int r = x ? 1 : 0;     //condtional oparator
    System.out.println(r);
	*/
	
//8. int to  boolean
    
    int  d= 0; //true =1 ,flase=0;
 
    System.out.println(d);
    
   boolean e = (d==1) ? true:false; //condtional oparator
    System.out.println(e);
    
//    if (d==1) {
//    	System.out.println(true);
//    }else {
//    	System.out.println(false);
//    }
    
//=========================imp========================================================================================= 
	// 9.byte to string
    
/*    byte b[]= {5,43,32,4,3,43};
    
    System.out.println(b); //outpute showing hashcode 
    
    
    System.out.println(b[1]);//43
    
     // to print whole array in one go...we can use Arrays.toString() method...so we don't have to use for loop
  	 // System.out.println(Arrays.toString(b));   //"[5, 64, 3, 3, 4, 5, 12]"
 	
    System.out.println(Arrays.toString(b));//all arra print [5, 43, 32, 4, 3, 43]
	
 */
    
    //9.byte to string => string class constructor
    
    byte b[]= {118,105,115,104,97,108};
    
    System.out.println("byte ="+Arrays.toString(b));//{118,105,115,104,97,108};
    
    String s=new String(b);
    System.out.println("String ="+s);
    
    
    
    //10 String to byte => getbytes()
    
    String z="vishal";
    System.out.println("String ="+s);//vishal
    
    byte c[]=s.getBytes();
    System.out.println("byte = "+Arrays.toString(c));
    
    
    
}
}