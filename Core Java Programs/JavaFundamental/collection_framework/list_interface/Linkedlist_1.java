package collection_framework.list_interface;

import java.util.LinkedList;
//LinkedList is the implementation class of List interface which stores elements in 
//the form of nodes
//LinkedList  follows all the properties of List interface
//Difference between LinkedList and ArrayList
/*
1.LinkedList internally uses a doubly linked list to store the elements 
2.In LinkedList, the manipulation is fast because no shifting is required.
*/
//Whereas
//1.ArrayList internally uses a dynamic array to store the elements 
//2.In arraylist, the manipulation is slower because shifting taken place at a time insertion and deletion of element.
public class Linkedlist_1 {

  public static void main(String[] args) {
      
      LinkedList<String> b1=new LinkedList<String>();
      
      b1.add("shoes");
      b1.add("bag");
      b1.add("bat");
      b1.add("sandles");
      b1.add("mobile");
      b1.add("watch");
      b1.add("pen");
//      b1.add("shoes");
      
      System.out.println(b1);
      
      
      
      
      /*
         //1.Adding head node
         products.addFirst("charger");
         System.out.println(products);
        */
         
         
        
      

         /*
         //2.Adding tail node
         products.addLast("charger");
         System.out.println(products);
      */
      
      
      
      
      /*
         //3.Accesses, but does not remove, the head (first element) of this list
      System.out.println(products.element());
        System.out.println(products);
        */
         
         
      
         /*
         //4.Accesses, but does not remove, the head (first element) of this list
      System.out.println(products.getFirst());
        System.out.println(products);
         */
      
          
          
          /* 
         //5.adding last element (using offer())
         products.offer("LENS");
         System.out.println(products);
         */
      
      
      
      /*       
       //6.Accesses, but does not remove, the head (first element) of this list
       //just like above element() method
         System.out.println(products.peek());
       System.out.println(products);
      *
      *   
      */
         
         
         
         /*
         //7.Accesses, and remove, the head (first element) of this list
        System.out.println(products.poll());
      System.out.println(products);
         */
         
  
      
         //8.removeFirstOccurrence
  /*
   products.removeFirstOccurrence("watch");
   System.out.println(products);
      */
      
      
//      for(String s : b1)
//      {
//          if(s.startsWith("s"))
//          {
//              System.out.println(s);
//          }
//          
//      }

  }

}