package acessspecifier;

public class PriveteDemo {
	
		private int salary=50000;

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}
	

	public static void main(String[] args) {
		PriveteDemo demo=new PriveteDemo();
		
		System.out.println(demo.getSalary());

	}

}
