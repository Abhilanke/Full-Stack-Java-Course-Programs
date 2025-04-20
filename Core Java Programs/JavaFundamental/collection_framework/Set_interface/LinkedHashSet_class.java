package collection_framework.Set_interface;

import java.util.HashSet;
import java.util.LinkedHashSet;

	//LinkedHashSet is the child  class of HashSet class


	//LinkedHashSet => Linked list + hashTable + set
	//as LinkedHashSet is a combination of List and Set...It follows one property of List(preserves the insertion order) 
	//and one of Set(does not allows duplicate elements)


	public class LinkedHashSet_class {

	    public static void main(String[] args) {
	        
	        LinkedHashSet<Integer> hs= new LinkedHashSet<Integer>();
	        
	        hs.add(67);
	          hs.add(10);
	          hs.add(6);
	          hs.add(17);
	          hs.add(10);
	          hs.add(34);
	          hs.add(22);
	          
	          

	            LinkedHashSet<Integer> hs1= new LinkedHashSet<Integer>();
	            
	            hs1.add(100);
	              hs1.add(200);
	              hs1.add(300);
	              hs1.add(17);
	              hs1.add(400);
	              hs1.add(500);
	              hs1.add(34);
	              
	                //2.union =>    getting all elements by avoiding duplicate elements
	                //hs = [67, 10, 6, 17, 34, 22]
	             // hs1 = [600, 100, 200, 17, 300, 34, 400]
	              


	              hs.addAll(hs1);  //adding all the elements hs1 to hs by avoiding duplicate elements 
	              System.out.println("after union(), hs= "+hs);             //hs=[17,34]
	              System.out.println("after union(), hs1= "+hs1);
	              
	        
	        
	              /*
	                //2.intersection =>    getting common elements from more than 1 set
	                    //hs = [67, 10, 6, 17, 34, 22]
	                 // hs1 = [600, 100, 200, 17, 300, 34, 400]
	                  

	                  hs.retainAll(hs1);      //retaining common elements of hs1 into hs 
	                  System.out.println("after retainAll(), hs= "+hs);             //hs=[17,34]
	                  System.out.println("after retainAll(), hs1= "+hs1);
	                  */
	        /*      
	        //3.difference =>find those elements which are present in one set but not in another set/retains uncommon elements
	            
	            //hs = [67, 10, 6, 17, 34, 22]
	         // hs1 = [600, 100, 200, 17, 300, 34, 400]
	          

	          hs.removeAll(hs1);      //removing all the elements of hs1 from hs
	                                 
	          System.out.println("after removeAll(), hs= "+hs);          //hs = [67, 10, 6, 22]
	          System.out.println("after removeAll(), hs1= "+hs1);

	        */
	              
	              
	            //4. calculating size
	                //System.out.println("size of hs  = "+hs.size());
	                  
	            
	                /*
	                //5. copying an elements of set into an Array
	                
	                
	                 
	                System.out.println("before copy, x = "+Arrays.toString(x));
	                
	                hs.toArray(x);        //copying an elements of set hs  into an Array x
	                
	                System.out.println("after copy, x = "+Arrays.toString(x));
	*/
	    }

	}