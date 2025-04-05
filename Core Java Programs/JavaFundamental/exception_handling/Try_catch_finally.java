package exception_handling;

//Q.Can we write only try in the program?
//no, it must be followed by either catch or finally or both

//Q. Can we write try without catch?
//yes..we can write try without catch but that try should be followed by finally

//Q can we write ony finally block
//yes we can write
public class Try_catch_finally {

public static void main(String[] args) {
    // TODO Auto-generated method stub

    
     int a=7, b=0;
        
        System.out.println("hi"); //7/0
        
        try 
        {
            System.out.println("try starts....");
            System.out.println("div ="+a/b);  //3.5
            System.out.println("try ends....");
              
        }catch (Exception e) {
			System.out.println(e);
		}
      finally     //for one try block we can write multiple catch block but we can write only one finally block
        {
                System.out.println("Finally block will alwayes get executes whether an exception occurred or not");
                System.out.println("So we can put an important code of our application inside finally block");
                
          }
        
        System.out.println("bye");
        System.out.println("add = "+(a+b));   //9
        
        
}

}
