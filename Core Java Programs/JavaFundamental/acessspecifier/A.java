package acessspecifier;

class A {
	void m1() {
		System.out.println("Hello");
	}
	

}
class B extends A{
	void m1() {
		System.out.println("Good");
	}
	public static void main(String[] args) {
		A a=new B();
		a.m1();
	}
}
