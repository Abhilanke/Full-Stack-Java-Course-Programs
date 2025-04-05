package interface_in_java;

//concrete class
//abstract class
//interface

/*
//concrete class => consists of only concrete_methods(having declaration and definition both)
class Abc
{
    void msg()
    {
        
    }
    void show()
    {
        
    }
}
*/


/*
//abstract class => consists of both abstract and concrete_methods(having declaration and definition both)
abstract class Pqr
{
    void msg()
    {
        
    }
    abstract void show();
    
    
}*/

//interface is similar to the class...the only difference is that the interface can consists of only abstract method

//interface=> consists of only abstract_methods(having only declaration not definition)
//interface is used to achieve multiple inheritance and abstraction/data hiding in java
//class  to class relationship => extends
//interface  to class relationship => implements

interface Xyz
{
     public abstract void msg();  //by default, all the methods in interface are public abstract
                     void show();
                     void putData();
}

abstract class Abc  implements Xyz
{
    public void msg()  //by default interface methods are declared as a public so at a time of its definition we need to use public keyword
    {
        System.out.println("in msg");
    }
    //abstract void show()
    public void putData()
    {
        System.out.println("in putData...");
    }
    
}
class Lmn extends  Abc   //here,Lmn is non-abstract
{
    public void show()
    {
        System.out.println("in show...");
    }
    
    public void own()
    {
        System.out.println("in own");
    }
}





public class Creating_interface {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //we cannot create an object of abstract class and interface.. but we can create reference varible of abstract class and interface
        
        Xyz x1=new Lmn();
          x1.msg();
          x1.putData();
          x1.show();
          
          Lmn l1 =new Lmn();
             l1.msg();
             l1.show();
             l1.putData();
             l1.own();
             
         
        
    }

}

