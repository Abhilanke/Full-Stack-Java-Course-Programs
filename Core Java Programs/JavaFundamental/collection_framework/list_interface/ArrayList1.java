package collection_framework.list_interface;

import java.util.ArrayList;
import java.util.List;

//Array ==>  Array is Static
//collection=> Collection is dynamic
//collection=> List set,Map=>Inteface
//collection = group of object(multiple oparation perform)
//frameworks == frameworks nothig but predefine code 
//colletions = class


//Collection => group of OBJECTS that may be of similar type or of different types
//framework  =>  it is an architecture which consists of predefined code in the form of classes,interfaces and methods

//Collection Framework is divided into 2 categories
//1.Collection interface => List,Set,Map
//2.Collections  class

//java.util

//Data structure(organize)=>Collection

//List => sequential/ordered type of collection
//1. list preserves/maintains the insertion order
//2. list allows duplicate elements/object


//Difference between Array and Collection(ArrayList)?
//1.in array, we can store only similar type of data
//1.in ArrayList, we can store both  similar as well as different type of data

//2.Array is static type of Data Structure means in an array we need to specify size of an array
//2.ArrayList is dynamic type of Data Structure means in an arraylist(or in any collection) we need NOT to specify size of an arraylist


public class ArrayList1 {
	
	public static void main(String[] args) {
		
		
		int a[] = { 78,54,12,34,54};  //array
		
		
		
		//Arraylist is storing different types of elements
		List b =new ArrayList();   //collection => dynamic
		
		b.add(12);//method   //Interger is class And int is variable and object
		b.add("Hello");//method
		b.add('u');//method
		b.add(98);//method
		
		b.add(98.2f);//method
		b.add(98.77);//method // Double is class and double is object 
		b.add(true);//method
		
		System.out.println(b);
		//System.out.println(a);
		
	}

}
