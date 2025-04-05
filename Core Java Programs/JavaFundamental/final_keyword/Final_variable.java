package final_keyword;

//	static menace comman
//	final menace fixed (do not chanage)
// final method can not override
//final =>final keyword is used to declare variable,method,and class  as a final
//1.final variable =>the variable which is declared as a final can be changed  and its
//value remain fixed throughout the program.

class Area {
	final double pi = 3.14; // do not change

	int r = 6;

	void areaOfCircle() {

		// pi=2.3;//error=->bcz pi is final so we cannot change the value of it
		r = 10;// its change
		System.out.println("Ara is" + pi * r * r);
	}
}

public class Final_variable {

	public static void main(String[] args) {

		Area area = new Area();
		area.areaOfCircle();

	}

}
