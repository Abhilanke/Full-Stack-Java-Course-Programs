package collection_framework.Set_interface;

import java.util.HashSet;
import java.util.TreeSet;


	//SortedSet is an interface and TreeSet is the implementation class of SortedSet
	//SortedSet interface sorts the objects of collection in ascending order by default

	//NavigableSet is the child interface of SortedSet interface....which also sorts data in ascending order by default


	public class SortedSet_interface {
	    
	    public static void main(String[] args) 
	    {
	        
	        TreeSet<Integer> ts= new TreeSet<Integer>();
	        
	        ts.add(67);
	          ts.add(10);
	          ts.add(6);
	          ts.add(17);
	          ts.add(10);
	          ts.add(34);
	          ts.add(22);
	          ts.add(22);
	          
	          
	          
	          System.out.println("ascending ts  = "+ts);
	          
	          
	          
	          
	          
	        //1.descending sorting
	             //System.out.println("descending ts  = "+ts.descendingSet());
	             
	             
	             
	             
	             /*
	             //2.ceiling() => returns elements which is greater than or equal to given element 
	             //ascending ts  = [6, 10, 17, 22, 34, 67]
	            
	            System.out.println(ts.ceiling(20));   //22     bcz=> 20 is not present in ts and hence returning value greater than 20
	            System.out.println(ts.ceiling(22));   //22      bcz=> 22 is present in ts hence, returning 22
	    
	    
	    //3.floor() => returns elements which is less than or equal to given element 
	            System.out.println(ts.floor(17)); 
	            System.out.println(ts.floor(20));      
	             */
	             
	             
	             
	             
	             
	             /*
	             //4.first() => returns first/small element from sorted set
	             //ascending ts  = [6, 10, 17, 22, 34, 67]
	            
	             System.out.println(ts.first());
	             System.out.println(ts.last());
	             */
	    /* //5.headSet() => returns all the elements which are strictly less than given element
	            //ascending ts  = [6, 10, 17, 22, 34, 67]
	            
	             System.out.println(ts.headSet(22));   //[6, 10, 17]
	             */
	             
	             
	             
	             /*
	             //6.tailSet() => returns all the elements which are greater than or equal to than given element
	                //ascending ts  = [6, 10, 17, 22, 34, 67]
	                
	                 System.out.println(ts.tailSet(22));   //[22, 34, 67]
	            */
	          
	          
	          /*
	             //7.higher => returns value which is strictly greater than given value
	             //ascending ts  = [6, 10, 17, 22, 34, 67]
	             System.out.println(ts.higher(22));     //34
	             System.out.println(ts.higher(67));     //null
	             
	             */
	             
	             
	             
	             //8.lower => returns value which is strictly less than given value
	             //ascending ts  = [6, 10, 17, 22, 34, 67]
	             System.out.println(ts.lower(22));     //17
	             System.out.println(ts.lower(6));     //null
	          
	        
	    }

	}

