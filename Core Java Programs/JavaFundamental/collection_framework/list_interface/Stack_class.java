
package collection_framework.list_interface;
import java.util.Stack;

//Stack is a subclass of vector, the difference between Vector and Stack is we 
//can performed insertion and deletion operation at any index means on the middle
//of the vector also
//but In stack, insertion(push) and deletion(pop) operations are performed
//on top of stack only
//Stack follows the principle of Last In First Out(LIFO)
//there are 2 basic operations performs on the stack like push() and pop()

//LIFO

public class Stack_class {

  public static void main(String[] args) {
      
      Stack<Integer> s1=new Stack<Integer>();
         s1.add(64); //6
         s1.add(3);  //5
         s1.add(78);  //4
         s1.add(12); //3
         s1.add(3);  //2
         s1.add(10); //1  //here, 10 is top of stack
         
         System.out.println(s1);
        // System.out.println(s1.capacity());
         
         //1.
        //System.out.println(s1.empty());  //false
/*
             //1.push() => adding element in stack
            s1.push(10.0);
            System.out.println(s1);
             */
             
             
/*               
             //2.pop() =>removing element from stack
             System.out.println(s1.pop());
             System.out.println(s1);
*/
         
//         searching an elements in a stack
         System.out.println(s1.search(3));
         
       //4.peek ==> access but does not remove element present on Top Of Stack
         //System.out.println(s1.peek());   //10
         //System.out.println(s1);

  }

}