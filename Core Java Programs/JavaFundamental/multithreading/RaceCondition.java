package multithreading;
//Race Condition => is the situation where multiple threads trying to access same shared resource at the same time by interfering in the execution of each other 
//Critical section => is the area/region of code on which  to which multiple threads are trying to access

//but if we want to avoid this race condition in our code and allow only one thread to get execute at the same time then here we need to implement concept of synchronization


class BankApp1 {

	int amt = 5000, w_amt;

	void withdraw(int amt) {
		w_amt = amt; // w_amt=7000;
		System.out.println("----withdraw opereation is running----");// 1
		if (this.amt < amt) {
			System.out.println("Sorry !! we can't withdraw an amount ");// 2
			System.out.println("\nPlease deposite : " + (amt - this.amt) + "or greater then " + (amt - this.amt));// 3
			// wait...
		}

		// 7
		if (this.amt > amt) {
			System.out.println("Withdraw Succesfully");
		}
	}

	void deposit(int amt) {

		System.out.println("----deposit operation is running-----");// 4
		if (this.amt < w_amt) {

			this.amt = this.amt + amt;
			System.out.println("\n " + amt + "re.reposited successfully.."); // 5
			System.out.println("/n After deposite : Your current balance is  " + this.amt);// 6

		}

	}
}

public class RaceCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankApp1 b1 = new BankApp1();
		Thread t1 = new Thread() {
			public void run() {
				b1.withdraw(7000);

			}

		};
		t1.start();

		Thread t2 = new Thread() {
			public void run() {
				b1.deposit(3000);

			}

		};
		t2.start();

	}

}
