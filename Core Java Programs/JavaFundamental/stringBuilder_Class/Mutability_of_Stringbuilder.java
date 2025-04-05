package stringBuilder_Class;
//stringbuulder is muatble  means we can change StringBuilder Object

public class Mutability_of_Stringbuilder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mutability of StringBuffer
		StringBuilder s1 = new StringBuilder("java");
		System.out.println(s1);

		System.out.println(s1.append("programming")); // javaprogramming
		// System.out.println(s1.toUpperCase());
		System.out.println(s1);
		System.out.println(s1);
	}

}