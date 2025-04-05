package Inheritance;

//inheritance
//1.purpose => code reusability
//2.definition=> it is the ability of child to access/inherit the Properties(variable,method,constructor)
//           of parent class and add its own features
//3.e.g  parent child relationship

//4.how to implement ?
 //by creating parent child classes
//5. program
//6.Types of inheritance
//i.single level  =>  the inheritance in which we are having one parent class and one child class 
//ii. multilevel
//iii. hierarchical
//iv.multiple (this multiple inheritance cannot be achievable through classes directly hence we need to implement concept of interface in programming)



class Person         //parent/base/super/old
{
   //instance variables
  String name;
  int age;
  String address;
  
  //methods
  //constructor
  
  
}
class Student extends Person     //child/derived/sub/new
{
  
  double marks;
  
  void accept(String name,int age,String address,double marks)
  {
        this.name= name;   //here,this.name,this.age,this.address are inherited from parent class Person
        this.age= age;
        this.address= address;
        this.marks= marks;
      
  }
  
  void disp()
  {
        System.out.println(this.name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(marks);
  }
}


public class Single_level_inheritance {

  public static void main(String[] args) {
      // TODO Auto-generated method stub

      
      Student  s1=new Student();
         s1.accept("jay",12,"pune",34.4);
         s1.disp();
  }

}