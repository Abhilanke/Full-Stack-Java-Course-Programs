package object_class;

import java.io.Serializable;

//Constructors
//1.default
//2.Parameterized
//3.Copy/object cloning => one object into another 

//object cloning is the process of creating an exact copy of one object into another


//types of interface
//1.marker interface/empty/blank   => e.g Cloneable,Serializable
//2.functional interface/Single Abstract Method = > having only one abstract method

//the purpose of marker interfaces is nothing but it is used to provide an extra 
//information about class and object to the compiler same as annotation


//requirement 1=>the class whose object we wants to clone,with taht class we need to implements Cloneable interface
class Student1 implements Cloneable //extends Object
{
  int rollno;
  String name;
  double marks;
  
  Student1(int rollno, String name, double marks) {
      this.rollno = rollno;
      this.name = name;
      this.marks = marks;
  }

  
  
    @Override
   public String toString() {
          return rollno+" "+name+" "+marks;
      }
    
    ////requirement 2  =>  throwing CloneNotSupportedException with our userdefine clone() method 
    public Object clone() throws CloneNotSupportedException   //int a, Object b
    {
        return super.clone();  //requirement 3=> calling ,super.clone() is the method of super class Object
    }
    
    
    

}


public class Object_Cloning {

  public static void main(String[] args) throws CloneNotSupportedException {
      // TODO Auto-generated method stub

      Student1 s1=new Student1(56,"gita kumari", 78.2);
  
      System.out.println("s1 = "+s1);
                    //s1.display()
      //here, we are creating s2 object without using new keyword and simply by cloning s1 object into s2
      Student1 s2= (Student1)s1.clone();   //here, s1.clone() method is returning Object type of value but we are storing it in Studnet1 type of value and hence here we need to perform classtype casting to convert object value into Student1 type 
         System.out.println("s2= "+s2);
         
         Student1 s3=  (Student1)s2.clone();
		   System.out.println("s3= "+s3);
         
  }

}
