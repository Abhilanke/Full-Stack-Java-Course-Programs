package collection_framework.collectons_class;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_class {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        
        //List<Integer>  l1= new ArrayList(); //OR
                ArrayList<Integer>  l1= new ArrayList();
                           l1.add(29);     //0
                           l1.add(67);      //1
                           l1.add(12);      //2
                           l1.add(13);      //3
                           l1.add(12);    //4
                           l1.add(20);     //5
                           l1.add(45);
                 System.out.println(l1);
        
        
        
        //1.public void sort(List list, Comparator c): 
          // Collections.sort(l1);
           //System.out.println("ascending l1 = "+l1);
                 
            
    
        // 2.Reversing collection
                 //Collections.reverse(l1);
                // System.out.println(l1);
                 
                 
           //3.descending sorting
                // Collections.sort(l1);
                // Collections.reverse(l1);
                // System.out.println("descending l1 = "+l1);
                 
                 
                 
                 
        //4.addAll() => adding multiple elements at a time in collection
                // Collections.addAll(l1, 5,12,3,4,5,33,788,900,344);
                 //System.out.println(l1);
                 
                 
                 
                 
            //5. Searching in a Collection     types of search => 1.linear search, 2.binary serach
                              // 0   1   2    3  4   5   6
            //sorted l1  = [12, 12, 13, 20, 29, 45, 67]
            Collections.sort(l1);
            System.out.println("sorted l1  = "+l1); 
            System.out.println("element is present at position = "+Collections.binarySearch(l1, 29));
            System.out.println("element is present at position = "+Collections.binarySearch(l1, 22));
                                   // – (insertion point where the element should have been present if exist)-1). 
                                    // -   4 -1 => -5
            System.out.println("element is present at position = "+Collections.binarySearch(l1, 47)); //-6-1 => -7
            
            
            //6 coping one collection to another
            ArrayList<Integer> l2 =new ArrayList();
            //System.out.println("Size of l2 = "+l2.size());
            l2.add(null);
            l2.add(null);
            l2.add(null);
            l2.add(null);
            l2.add(null);
            l2.add(null);
            l2.add(null);
            System.out.println("Before copy = "+l2);
            Collections.copy(l2,l1);
            System.out.println("After Copy l2 = "+l2);
            
            
            //7 disjoint
            ArrayList<Integer> l3 =new ArrayList();
           
            l3.add(500);
            l3.add(200);
            l3.add(344);
            l3.add(333);
            l3.add(234);
            l3.add(432);
            l3.add(876);
            
            System.out.println(Collections.disjoint(l1, l3)); //return true and false //show true->> manse don't comman element l1 and l3
            
            
          //here,l1 and l2 both are said to be disjoint because both lists does not have any common element
		    System.out.println(Collections.disjoint(l1, l2));  //true => means don't have common elements in l1 and l2
		     
		    
		    //8.finding out common element between 2 lists
		        // l1.retainAll(l2);
		        //System.out.println(l1);
    }

}
