package java8_features.lambda_expression;

//Types of interface
//1.Marker interface
//2.Functional interface

//Lambda expression is used to implement functional interface(who has only one abstract method) in java
//Lambda expression is the feature of java8, which is used to reduced the line of code of program
//In which we can write the implementation of abstract method of functional interface in one single line

//Lambda expression is also called as arrow function

//syntax:
//parameter -> expression body


@FunctionalInterface   //annotations
interface Abcd  //functional interface
{
  void add(int a,int b);
  //void add();
}


public class With_lambda_Expression {

  public static void main(String[] args) {
      // TODO Auto-generated method stub

      //if method  consists of only one statement then the lambda expression will be given below
      Abcd d1=(a,b)-> System.out.println("in add = "+(a+b));
              //()-> System.out.println("in add method");
      
      d1.add(4,8);
      
      //if method  consists of multiple statements then the lambda expression will be given below
              Abcd d2=(a,b)->{
                                    System.out.println("in add = "+(a+b));
                                    System.out.println("hi");
                             };
                d2.add(5, 6);     
      
      
      
  }

}