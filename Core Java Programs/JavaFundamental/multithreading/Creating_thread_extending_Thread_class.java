package multithreading;

//multithreading => at the same multiple thread execution
//thread is a sub program/sub process which runs in the background of main process
//multithreading means multiple threads will get execute at the same time

//with the help of multithreading we can achieve multi-processing
//and with the help of  multi-processing we can achieve multitasking

//multithreading  => multi-processing=> multitasking

//there are 2 ways to create a thread
//1.by extending Thread class   //java.lang

//2.by implementing Runnable interface(most widely used way to create a thread this way can create a thread in case of normal program and also in case of inheritance program)

//types of interface
//1.Marker 
//2.Single abstract method/functional

/* java.lang
 * class thread{
 * public void run(){
 * }
 */

class A extends Thread // java.lang
{

	int a[] = { 2, 3, 4, 3, 2, 4, 3 };

	public void run() {  //run() method defines and action/code that thread needs to be performed after the execution of code
		//this run() is overridden method of parent  class Thread
		for (int i = 0; i <= a.length; i++) {

			System.out.println(a[i] * 2);

			try {

				Thread.sleep(2000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class Creating_thread_extending_Thread_class {

	public static void main(String[] args) {

		A a1 = new A();//here,a1 is thread object because A is thread class becuase we havce extended Thread class in A class
		a1.start();//here,we don't have to call run() method,we just have to call start() method...and this start will automatically call run()

		
		  //A a2= new A();  //here,a1 is thread object because A is thread class becuase we havce extended Thread class in A class
        //a2.start();  //Thread schedular => CPU
	}

}
