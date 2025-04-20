package object_class;
//API => set of methods
import java.util.Objects;

//Q. listout different methods from Object class
//=> toString(), hashCode(), getClass(), wait(), notify(), notifyAll(), clone(), equals()

//Object is the parent/supermost class in java
class Student   //extends Object
{
  int rollno;
  String name;
  double marks;
  
  Student(int rollno, String name, double marks) {
      this.rollno = rollno;
      this.name = name;
      this.marks = marks;
  }

  
  
    @Override
   public String toString() {
          return rollno+" "+name+" "+marks;
      }

  @Override
  public int hashCode() {
      return Objects.hash(marks, name, rollno);
  }

  @Override
  public boolean equals(Object obj) {
      if (this == obj)
          return true;
      if (obj == null)
          return false;
      if (getClass() != obj.getClass())
          return false;
      Student other = (Student) obj;
      return Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
              && Objects.equals(name, other.name) && rollno == other.rollno;
  }

  
}

public class Object_class_methods {

  public static void main(String[] args) {
      // TODO Auto-generated method stub

      Student s1=new Student(11,"riya",67.7);
       System.out.println(s1.getClass());        //returns class information about an object     //object_class.Student
  
       System.out.println(s1);   //hashcode(unique id of object) => @cac736f
  
       System.out.println("hashcode of object s1 = "+s1.hashCode());  //766572210
       
       //equals method
       Student s2=new Student(11,"riya",67.7);
       
        //equals() => methods checks contents of an objects=> override equals() and hashCode() methods
          System.out.println("equals method = "+s1.equals(s2));   //true  //if,we want to check equality between 2 objects then we must have to override hashCode() and equals method...
          System.out.println("hashcode of object s2 = "+s2.hashCode());  //766572210
            
           
      
  }

}