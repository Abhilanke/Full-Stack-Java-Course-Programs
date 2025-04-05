package final_keyword;

//3.final class =>the class which is declared as a final connot be inherit/access into the child class
//Q.how you can create your own immutable class?
//=> by declaring that class as final..

//final class Parent  //or
class Parent 
{
  String name="jack";
  
}
class Child extends Parent
{
  void display()
  {
      name="jack1";    //here,child class chnaging property of parent class....bcz, Parent class is not final..but if the Parent class is declared as a final then child cannot access and change the properteis of parent class
      System.out.println("name ="+name);
  }
}

public class Final_Class {

  public static void main(String[] args) {
      // TODO Auto-generated method stub

      Child c1=new Child();
      c1.display();
              
  }

}
