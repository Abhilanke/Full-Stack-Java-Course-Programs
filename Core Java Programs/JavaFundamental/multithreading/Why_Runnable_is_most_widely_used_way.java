//Why_Runnable_is_most_widely_used_way to create thread?
/*
 because we can use Runnable interface to create thread in normal class as well as in case of 
 inheritance also where child class have already extended its Parent class so in thta case
 we cannot extend Thread class in that child class....if we are trying to do so then that
 will elad the problem of multiple inhertiatnce so avoid this we can implemnet Runnbale interface
 like in below example
 */
package multithreading;

class X
{
    void demo()
    {
        System.out.println("hi!!! we are in parent class...");
    }
    
}
class Y extends X implements Runnable  //multiple inheritance  // here, we cannot extend Thread class
{
    public void run()  
    {
        int a[]= {56,21,5,4,78,3,79,44};
        
        for(int i=0; i<a.length; i++)
        {
          if(a[i] %2==0)
          {
              System.out.println(a[i]);
          }
                      try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
        }   //for ends 
    }
    
}

//unchecked/runtime exceptions should handle using=> try catch
//checked/compiletime exceptions  should handle using=> throws

public class Why_Runnable_is_most_widely_used_way {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

      Y y1= new Y();
      
      Thread t1=  new Thread(y1);   //here,y1 is not a thread object bcz, Y is not a thread class,,,so here we have to convert y1 into thread object by passing that y1 object as a parameter to the parameterized constructor of Thread class 
        
      t1.start();
    }

}