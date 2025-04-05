package loops;

//while loop is same as for loop in working.... just different in syntax
//for and while are entry leveled control statment
public class While_loop {

	public static void main(String[] args) {
		
		//Syntax:
        /*initialization; 
        while(condition)  )
         {
              body of the loop
              incre/decre;
         }
         */


      int i=1 ;              
     while(i <= 50) //51 //i++ or i=i+1 //1,2,3....50
     {     
        //body of the loop
        System.out.println("hello : "+i);    //hello 50
        System.out.println("bye");
        i=i+1;
     }
	}
	}
