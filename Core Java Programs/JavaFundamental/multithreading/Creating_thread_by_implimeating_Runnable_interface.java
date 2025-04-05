package multithreading;


class B implements Runnable{

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

public class Creating_thread_by_implimeating_Runnable_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1 = new B();//here,a1 is thread object because A is thread class becuase we havce extended Thread class in A class
		
		//one more step 
		//converting b1 object into thread class object
		Thread t1=new Thread(b1);
		
		t1.start();

	}

}
