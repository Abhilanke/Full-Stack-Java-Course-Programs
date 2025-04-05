package exception_handling;
//exception nothing but run time error
//EXceptions are nothing but runtime errors

//EXceptions are recoverable or handled using exception handling keywords/blocks
//Errors are irrecoverable means we cannot recover error by using any technique

/*
Q. why we need to handle an exceptions in the program?
=> because, if exception will get occurred in our program, 
then because of these exceptions our rest of the code
will not get execute even if it is correct and will not get proper output.
So to maintain the proper flow of our program execution, 
we need to handle the exception

*/

public class Generating_an_exception {

  public static void main(String[] args) {
      // TODO Auto-generated method stub

      //exception  => is nothing but run time errors
      //errors => mistakes
      //1.compile time errors/syntax error =>  ; missing,     spelling or syntax mistakes
      //2.runtime  errors/logical errors
      
      
  /*    //1. arithmetic Exception
      int a=7, b=0;
      
      System.out.println("hi"); //7/0
      System.out.println("div ="+a/b);  //3.5
      System.out.println("bye");
      System.out.println("add = "+(a+b));   //9
      */
      
      
      
      
      /*
      //2.ArrayIndexOutOfBoundsException: 
            //  0  1  2 3  4 5
      int x[]= {56,2,34,45,1,23};
      
      System.out.println("hi....");
      System.out.println(x[2]);  //34
      System.out.println(x[4]); //1
      System.out.println(x[12]);
      System.out.println("add = "+(x[1]+x[4]));
      System.out.println("thank u");
      */
      
      
      
      /*
      //3.NullPoniterException
      String s= null;
      System.out.println(s);
      System.out.println(s.length()); //7
      */
      
      
      
      //4. NumberFormatException
      String s= "hello";
      System.out.println(s);
      
      //String value to int conversion  => Integer.parseInt("sjsshhss")
      
      System.out.println(Integer.parseInt(s));
      System.out.println("bye");
      
      
      
      
      
      
  }

}


