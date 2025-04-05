package multithreading;

class R implements Runnable  //multiple inheritance  // here, we cannot extend Thread class
{
    public void run()  
    {
        
        
    	  for(int i=65; i<=70; i++)
        { 
              System.out.println(Thread.currentThread().getName() +" : "+i);
          
                      try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
        }   //for ends 
    }
    
}
class S implements Runnable  //multiple inheritance  // here, we cannot extend Thread class
{
	   //run() method defines and action/code that thread needs to be performed after the execution of code
    public void run()    //this run() is overridden method of parent  class Thread
    {
        
        
        for(int i=65; i<=70; i++)
        { 
              System.out.println(Thread.currentThread().getName() +" : "+(char)i);
          
                      try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
        }   //for ends 
    }
    
}

public class Multithreading_program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		R r1=new R();
		Thread t1=new  Thread(r1);
		t1.start();//t1 thread is going to print number because it calls run() method of R class
        
		
		S s1=new S();
		Thread t2=new  Thread(s1);
		t2.start();//t2 thread is going to print alphabets because it calls run() method of S class
	}

}
