package multithreading;


//Q.Why wait(), notify() and notifyAll() methods are defined in Object class not in Thread class?
//=>It is because they are related to lock and object has a lock.

//Q. what is difference between notify() and nofityAll()?
////notify() => method is used to awake the single thread which is in the waiting state
//notifyAll() => method is used to awake ALL the threads which are in the waiting state

//Q. what is difference between wait() and sleep(1000)?
//1.in sleep() method we can pass time as a parameter and  then thread will get sleep for that amount of time only
//1.in wait() method we canNOT pass time as a parameter and hence  thread will get sleep for specific amount of time...it will get sleep until other thread will awake/notify  it

//2.sleep() method does not work on the lock of an object
//2.wait() method works on the lock of an object


//types of synchronization
//1.process synchronization/O.S
//2.thread synchronization(having 2 types)
  //1.mutual exclusion   => synchronized=> non-access modifier used with method
  //2.inter thread communication/cooperation    => wait(),notify(),notifyAll()


//yield(  )    => converts running thread into non running state but in yield() method thread will get sleep until other threads will get executes
//sleep(1000)  => converts running thread into non running state whereas in sleep method we can say thread will get sleep over particular period of time
//wait()       => converts running thread into non running state until other threads awake/notify that thread which is in the waiting

class BankApp {
	
	int amt =5000 ,w_amt;
	
	synchronized void withdraw(int amt) throws InterruptedException {
		
		
		w_amt=amt;   //w_amt=7000;
		
		
		System.out.println("----withdraw opereation is running----");//1
		
		//5000  < 7000
		if(this.amt< amt) {
			System.out.println("\nSorry !! we can't withdraw an amount bcz insufficiant balance ");//2
			System.out.println("\nPlease deposite : "+(amt-this.amt)+ " or greater then "+(amt-this.amt));//3
		    wait();  //wait() => method is used to transfer currently executing thread into waiting/non-runnable state
		}
		
		//7
		//8000> 7000
		if( this.amt>amt) {
			System.out.println("Withdraw Succesfully");
		}
	}
	
	//3000
   synchronized	void deposit(int amt) {
		
		System.out.println("----deposit operation is running-----");//4
		
		if(this.amt< w_amt) {
			this.amt =this.amt+amt;
			System.out.println("\n "+amt+"re.reposited successfully.."); //5
			System.out.println("/n After deposite : Your current balance is  "+this.amt);//6
			notify(); //notify() => method is used to awake the single thread which is in the waiting state
            //notifyAll() => method is used to awake ALL the threads which are in the waiting state
		}
		
		
	}
}

public class Synchronization {

	public static void main(String[] args) {
		 
		BankApp b1 =new BankApp();
		
		
		Thread t1=new Thread(){
			public void run() {
				try {
					b1.withdraw(7000); //change 2000 and run
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		};
		t1.start();
		
		
		
		Thread t2=new Thread(){
			public void run() {
				b1.deposit(3000);
				
			}
			
		};
		t2.start();
		
  
	}

}
