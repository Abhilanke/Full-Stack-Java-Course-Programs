package loops;

//for and while are the exit  leveled control statements
//do while loop will get execute at least once...even if the condition specified for the first time is false
//and that is the difference between do while loop with for loop and while loop
public class Do_While_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  //Syntax:
        /*
        initialization  ; 
        do
         {
              body of the loop
              incre/decre;
         }
         while(condition) ;
         */
		
		
//		int i = 87;
//		do // using do only one time execute loop
//		{
//			// body of the loop
//			System.out.println("hello : " + i); // hello 50
//			System.out.println("bye");
//			i = i + 1;
//		} while (i <= 50); // 51 //i++ or i=i+1 //1,2,3....50

		int i=1 ;
		do // using do only one time execute loop
		{
			// body of the loop
			System.out.println("hello : " + i); // hello 50
			System.out.println("bye");
			i = i + 1;
		} while (i <= 50); // 51 //i++ or i=i+1 //1,2,3....50

	}

}
