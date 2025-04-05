package multithreading;

//Thread lifecycle states/phases
//1.new
 //2.runnable == ready to run
       //3.running == runing its not lifecycle phases

//Thread lifecycle states/phases
//According to sun, there are only 4 states in thread life cycle in java
//new, runnable, non-runnable and termin
//1. new
//2. Runnable
   //3. Running
//4. Non-runnable
//5. terminate


class E  implements Runnable //java.lang
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

public class Thread_Lifecyle_phases {

  public static void main(String[] args) throws InterruptedException {
      // TODO Auto-generated method stub


       E e1= new E();
        Thread t1 =new Thread(e1);  //1.NEW
        System.out.println("after creating thread object, thraed state  ="+t1.getState());
        
        t1.setName("t1");
        t1.start();    //2.RUNNABLE  //default name of thread = thread-0
        System.out.println("after calling start method on thread object, thraed state  ="+t1.getState());
       
        t1.join();    ///3.TERMINATED
        System.out.println("after thread execution gets complete, thraed state  ="+t1.getState());
           
        
  }

}
