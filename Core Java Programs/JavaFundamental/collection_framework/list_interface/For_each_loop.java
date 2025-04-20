package collection_framework.list_interface;

import java.util.ArrayList;
import java.util.List;

//for each loop is used to traverse/visit collection object one by one and print them accordingly

//1.for loop(is used to iterate an array)
//2.while loop(is used to iterate  array)
//3.do while loop(is used to iterate  array)
//4, for each loop(is used to iterate  collection)/enhanced for loop

//iterating means to access elements of an array or collection one  by one  and performs an operation on that elemenets
public class For_each_loop {

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
         for(Integer  n :  l1  )
         {
             if(n % 2==0)
             {
             System.out.println(n);   //29,67,12
             }
         }
         
           
    }

}