package multithreading;

//Thread Schedular =>A thread scheduler in java is the part of the JVM that decides which thread should run and 
//which should wait.
/*1.priority  => -Whenever we create a thread, it always inherits priority from its parent thread. 
Each thread has a priority that lies between 1 to 10.  1=>min 5=> normal  10=> max
The higher priority of thread means a higher chance to get selected for the execution. 
*/
//2.arrival time
//-The thread scheduler also depends on the arrival time of the thread. 
//
//-If two or more thread has same priority then thread scheduler checks the arrival time of threads.

//3.execution time(time slice)
class F implements Runnable //java.lang
{
  //run() method defines and action/code that thread needs to be performed after the execution of code
  public void run()      //this run() is overridden method of parent  class Thread
  {      
      
      for( int i=0; i<= 5; i++)
      {
          System.out.println(Thread.currentThread().getName()+" : "+i); //0001112223334444
          try {
              Thread.sleep(1000);    //2sec => 2000ms
          } 
          catch (InterruptedException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
          }
      }   //0 1 2 3 4 5 0 1 2 3 4 5 0 1 2 3 4 5
      
  }
}


public class Thread_priority {

  public static void main(String[] args) {
      // TODO Auto-generated method stub

      
      F f1= new F();
      Thread t1 =new Thread(f1);
        t1.setName("t1");
        
       // System.out.println("default priority of thread t1  = "+t1.getPriority());  //5
        t1.setPriority(7);
        t1.start();    //RUNNABLE  //default name of thread = thread-0
     //t1.setPriority(13);   //IllegalArgumentException
       
       // t1.setPriority(Thread.MIN_PRIORITY);    //1
        //t1.setPriority(Thread.NORM_PRIORITY);    //5
        //t1.setPriority(Thread.MAX_PRIORITY);     //10
        System.out.println("after changing  priority of thread t1  = "+t1.getPriority());  //5
       
     
            F f2= new F();
            Thread t2 =new Thread(f2);
            t2.setName("t2");
            t2.setPriority(10);    //10
            t2.start();       
            System.out.println("after changing  priority of thread t2  = "+t2.getPriority());  //10
                      
        
  }

}
