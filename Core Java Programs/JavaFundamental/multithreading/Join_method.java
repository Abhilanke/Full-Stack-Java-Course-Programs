package multithreading;
//join() method allows one thread to get execute completely and then it joins the execution of that thread with another thread
// Join() method allows other thread to wait until the execution of one thread gets completed
class D extends X implements Runnable  //multiple inheritance  // here, we cannot extend Thread class
{
    public void run()  
    {
        
        
        for(int i=0; i<=5; i++)
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

public class Join_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		C c1 = new C();
		Thread t1 =new Thread(c1);
		t1.setName("t1");
		t1.setPriority(2);
		t1.start();
		t1.join();
		
		C c2 = new C();
		Thread t2 =new Thread(c2);
		t2.setName("t2");
		t2.start();
		t2.join();
		
		C c3 = new C();
		Thread t3 =new Thread(c3);
		t3.setName("t3");
		t3.start();
		t3.join();

	}

}
