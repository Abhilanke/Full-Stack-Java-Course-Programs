package final_keyword;
//2.final method =>the method which is declared as a final connot be override
//Q.how you can create your own immutable method?
//=> by declaring that method as final..

class Animal{
	
	//final class Parent  //or parant method is final to get error
	void dog() {
		System.out.println("This is Parant....!");
	}
	
}
class child1 extends Animal{
	 void dog() {
		 System.out.println("This is child ......!");
	 }
}
public class Final_Method {

	public static void main(String[] args) {
		child1 aa=new child1();
		aa.dog();

	}

}
