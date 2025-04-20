package abstraction;

//abstraction means hiden

//abstraction => data Hiding
//defination =>hiding data and showing only functinallyty.
//1.purpose=>hiding data from from user
//2.defination=> it is the process of hiding implementation 
//example=> Email ,Any Software,remote
//
//abstract means hidden

//abstraction/data hiding
//1.purpose  =>     hiding data/implementation details from user
//2.definition=>  it is the process of hiding implementation details/logic/coding from the user and showing only functionality to that user is called as 'abstraction'
//3.e.g   email, any software,remote,
//4. how to implement?
   //by defining/creating an abstract classes




//Q.What is difference between concrete classes and abstract classes
//concrete class means which consists of only "concrete methods" 
//abstract class means which consists of both "concrete methods" as well as "abstract methods"
//interface  means which consists of only "abstract methods" 


//abstract class consists of any number  of "concrete methods" as well as "abstract methods"

//concrete class
/*class App
{
  void reg()   //concrete method
  {
      System.out.println();
      
      
  }
  
  void logout()    //concrete method
  {
      System.out.println();
  }
  
  
} */



abstract class Operations
{ 
  
   void msg()     //concrete method => which is having both declaration and definition
   {
       System.out.println("in register method....");
       System.out.println("thank u...");
   }
   
  abstract void login( );   //abstract method => which is having only declaration not definition in one class
   
  abstract String displayName(String first,String last);
  
}
   //child        parent
class Test extends Operations   //non abstract/concrete
{
   void login( )
   {
       System.out.println("in login method...");
   }
   
   String displayName(String first,String last)
   {
       return first+last;  //jay kumar
   }
    void show()
    {
        System.out.println("in show=> own method of Test class");
    }
}


public class Abstraction_program {

  public static void main(String[] args) {
      // TODO Auto-generated method stub

      //we cannot instantiate/(object creation) an abstract class bcz,it consists of an abstract method(whose definition is not provided)
              //but we can create a reference variable of abstract class
              //reference variable means which refers an object into the memory
              //so, in case of abstraction we should always create an object of non-abstract class
              
   //int  a =56;
  
  
    Operations o1=new Test();      //here,o1 is the reference variable of Operations(abstract class) and an object of Test class
        o1.msg();
        o1.login();
        System.out.println("your name is  = "+o1.displayName("jay", " kumar"));
      //  o1.show();    //error=> bcz, by using abstract class reference...we cannot call data of non-abstract class..here,show is the method of non abstract class Test
        
        Test t1=new Test();
         t1.msg();
         t1.displayName("gita", "kumari");
         t1.login();
         t1.show();
  }

}
