package collection_framework.Set_interface;

import java.util.HashSet;
import java.util.Set;
//Set or HashSet Properties
//1.Set is a unordered type of collection means it does not preserves the
//insertion order
//2. duplicates are not allowed

//HashSet
//HashSet is combination of set + hashtable(hashtable is a table which stores
//the elements in key and value pair)

//HashSet is implementation class orn child class of Set interface

public class HashSet_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Set<Integer> hs = new HashSet<Integer>();
		//or
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(67);
		hs.add(10);
		hs.add(2);
		hs.add(10);
		hs.add(19);
		hs.add(76);
		
		System.out.println(hs); 
		
	}

}

