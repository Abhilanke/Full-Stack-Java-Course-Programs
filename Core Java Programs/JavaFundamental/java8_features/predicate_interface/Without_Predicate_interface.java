package java8_features.predicate_interface;

//Predicate => condition

//Predicate is functional interface having one abstract method with name as "boolean test(Object obj)"
//Runnable => run()

class EvenOdd
{
  static  boolean test(int n)
   {
       if(n % 2 ==0)
       {
           return true;
       }
       else
       {
           return false;
       }
   }
}
public class Without_Predicate_interface {

  public static void main(String[] args) {
      // TODO Auto-generated method stub

      System.out.println("Is given number is even? = "+EvenOdd.test(45));
      
  }

}