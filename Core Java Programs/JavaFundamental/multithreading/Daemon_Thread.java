package multithreading;

//types of threads
//1.userdefined thread
//2.systemdefined thread/daemon thread(low priority thread) => e.g garbage collector => finalize(),gc()

//Daemon thread
/*
Daemon thread is a low priority thread that runs in background to perform tasks such
as garbage collection

-Daemon thread in java is a service provider thread that provides services to the user thread.

*/
class H  implements Runnable //java.lang
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


public class Daemon_Thread {

  public static void main(String[] args) {
      // TODO Auto-generated method stub

      
      H h1=new H();
      Thread t1 =new Thread(h1);
      
      //System.out.println(t1.isDaemon()); //false=> because, t1 is not a daemon thread....its userdefiend thread  //daemon => true
      t1.setDaemon(true); //here, we are making t1 thread as daemon thread so it does not perform task specified by user i.e it does not print number 0 to 5 specified in above code of run() method
      t1.start();      
      System.out.println(t1.isDaemon());
  }
  

}