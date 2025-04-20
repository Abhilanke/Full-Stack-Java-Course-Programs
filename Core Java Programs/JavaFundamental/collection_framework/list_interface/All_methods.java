package collection_framework.list_interface;

import java.util.ArrayList;
import java.util.List;

//for each loop is used to traverse/visit collection object one by one and print them accordingly

//1.for loop(is used to iterate an array)
//2.while loop(is used to iterate  array)
//3.do while loop(is used to iterate  array)
//4, for each loop(is used to iterate  collection)/enhanced for loop

//iterating means to access elements of an array or collection one  by one  and performs an operation on that elemenets
public class All_methods {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<Integer>  l1= new ArrayList(); //OR
        //ArrayList  l1= new ArrayList();
                   l1.add(29); 
                   l1.add(67); 
                   l1.add(12);   
                   l1.add(13);    
                   l1.add(12);
                   l1.add(20); 
                   l1.add(45);
         System.out.println(l1);
        
         //for loop
         /*
         for(int i=0  ; i < 6  ;i++ )
         {
             //statements
         }*/
         
         //for each loop
        /*
         for(Integer  n :  l1  )
         {
             if(n % 2==0)
             {
             System.out.println(n);   //29,67,12
             }
         }
         */
         
         
         /*
         //1.adding element on specific position
         l1.add(3, 500);
         System.out.println(l1);
         */
         
         
         
         
         /*
         //2. deleting All the elements from Collection
         l1.clear();
         System.out.println(l1);
         */
         
         
         
         
         /*
         //3.checking whether element is exists or not
           System.out.println(l1.contains(20));   //true
           System.out.println(l1.contains(210));   //false
         */
         
         
         
         
         
         
         //4.checking whether 2 collections are equal or not
         /*
         ArrayList  l2= new ArrayList();
           l2.add(29);     //0
           l2.add(67);      //1
           l2.add(12);      //2
           l2.add(13);      //3
           l2.add(12); 
        
        System.out.println(l1.equals(l2)); //false => bcz, both collections l1 and l2 contains different
        
           */
         
         
         
         
       //5.accessing specific element from ArrayList
           //System.out.println( l1.get(4));
         
         
         
         
         
         
         
         /*
         //6.finding index FIRST occurrence of particular element
         System.out.println(l1.indexOf(12));   //2
         System.out.println(l1.lastIndexOf(12));  //4
         */
         
         
         
         
         
         /*
         //7.checking whether list is empty or not
         //System.out.println(l1.isEmpty());
         */
         
         
         
         
         
         
         /*
         // 8. deleting specific element from Collection
         //l1.remove(5);
         //System.out.println(l1);
           */
         
         
         
         /*
         //9.replacing/setting an element
         l1.set(5,300);
         System.out.println(l1);
         */
         
         
         
         
         //10.accessing sublist of elements
        //System.out.println(l1.subList(2, 5));   //retrieves sublist starting from 2 to 4(5-1)

    }

}
