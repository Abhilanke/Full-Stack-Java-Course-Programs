package collection_framework.list_interface;

import java.util.ArrayList;
import java.util.Vector;


//ArrayList(non syn/multithreaded) => as arraylist is non synchronized multiple threads 
//gets execute at the same time hence Arraylist faster as compared to Vector

//Vector(Synchronized/at a time one thread gets execute on Vector object) and 
//HashTable is synchronized

//Vector is the implementation class of List interface 
//Vector is same as ArrayList, means like ArrayList it also uses dynamic array to store
//its elements

//the only difference between both is :=>  ArrayList is non-synchronized whereas 
//Vector is Synchronized

//another difference between Vector and ArrayList is about capacity
//Default capacity of ArrayList before java8 is 10,,after java8 the capacity will be 0..
//means according to the no of elements in a ArrayList the capacity of ArrayList is decided
//Default capacity of Vector is 10

//ANd in LinkedList,it don't have capacity because the nodes/elements in LinkedList
//does not store in memory..each node is only having pointer to the next node

//In c++
//Q,Difference bet array and vector?   //arrayList and vetcor

//=> array is static                     //arrayList is nonsyn    
//=> vector is dynamic                   //vector is syn


//Q.What is diff between vector and arrayList?
//Similarity => both vector and arrayList internally uses dynamic array to stored the element
//Difference => ArrayList is non-synchronized and  vev1or is synchronized 




public class Vector_class_method {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        
        
        //List<Character>  l1= new Vector(); //OR
        Vector<Character>  l1= new Vector();
                   l1.add('h');     //0
                   l1.add('e');      //1
                   l1.add('l');      //2
                   l1.add('l');      //3
                   l1.add('o');    //4
                 
         System.out.println(l1);
         
         System.out.println("default capacity of vector = "+l1.capacity()); //10
               l1.add('f');
               l1.add('r');
               l1.add('n');
               l1.add('d');
               l1.add('z');
               System.out.println("after adding exact 10 characters = "+l1.capacity()); //10
               
               l1.add('J');
               System.out.println("after adding 11th character = "+l1.capacity()); //20
               
               
               
               /*
               //2.setting own capacity to vector
               l1.ensureCapacity(500);
               System.out.println(l1.capacity());
               */
               
               
               /*
               //3.accessing elements from vector
              System.out.println(l1.elementAt(3));
      */
      /* 
               //4.inserting element in vector
               l1.insertElementAt('W', 1);
               System.out.println(l1);
               */
               
               
               /*
               //5.remove element from vector
               l1.removeElementAt(2);
               System.out.println(l1);
               */
        
    }

}