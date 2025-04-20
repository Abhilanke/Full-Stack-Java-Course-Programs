package java8_features.lambda_expression;

//FunctionalInterface means, it consists of an exactly one abstract method

@FunctionalInterface
interface Abc
{
  public abstract void add(int a,double b);
  
}
/*
class AbcImpl implements Abc
{
  public void add(int a,double b)
  {
      System.out.println("add = "+(a+b));
  }
}
*/

public class Without_lambda_expression {

  public static void main(String[] args) {
      // TODO Auto-generated method stub

      Abc a1= new Abc()
              {                 //anonymous(nameless) inner class
                      public void add(int a,double b)
                      {
                          System.out.println("add = "+(a+b));
                      }
          
              };
              
          a1.add(2, 6.7);    
              
  }
}