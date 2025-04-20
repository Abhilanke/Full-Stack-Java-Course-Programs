package collection_framework.list_interface;

import java.util.ArrayList;
import java.util.List;

//Generics=> is used to achieve datatype safety in the programming and 
        //it is also used to apply restrictions on different type of data to get insert 
        //into collection
//and allows user to add same type of elements only          
//generic is used as a parametric type enclosed in <> brackets. 
        //and in this brackets we need to pass classname as a parameter always
           //means in below list we are passing <Integer> as a generic so,
        //we can not add different type of elements into "l1"
//except integer
//Generic can be used as parameter with class and interface names only

     //ArrayList  is storing SIMILAR types of elements

public class Generics {

    public static void main(String[] args) {
  
       // int a[10];  //array  => static
            
          List<Integer>  l1= new ArrayList(); //OR
          //ArrayList  l1= new ArrayList();
                     l1.add(29); 
                     l1.add(67); 
//                     b.add("hello"); error=>bcz this cn store on Integer type of data
                     l1.add(12);   
                     l1.add(13);    
                     l1.add(12);
                     l1.add(20); 
                     l1.add(45);
          
          
          System.out.println(l1);
        
  }

}