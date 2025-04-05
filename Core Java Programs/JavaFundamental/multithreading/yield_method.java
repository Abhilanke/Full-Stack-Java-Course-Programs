package multithreading;

//yield(  )    => converts running thread into non running state but in yield() method thread will get sleep until other threads will get executes
//sleep(1000)  => converts running thread into non running state where as in sleep method we can say thread will get sleep over particular period of time
class Z extends Thread
{
  public void  run()
  {
      for(int i=0;i<5;++i)
      {
          System.out.println("Thread started : "+Thread.currentThread().getName());  //Thread-0
          Thread.yield();
      }
      
      System.out.println("Thread ended : "+Thread.currentThread().getName());  //Thread-0
  }
}

public class yield_method {

  public static void main(String[] args) {
      // TODO Auto-generated method stub

       Z t1= new Z();
         
         t1.start();
         
         for(int i=0;i<5;++i)
          {
          System.out.println("Thread started : "+Thread.currentThread().getName());  //Thread-0
              Thread.yield();
          }
          
          System.out.println("Thread ended : "+Thread.currentThread().getName());  //Thread-0

         
         
  }

}
