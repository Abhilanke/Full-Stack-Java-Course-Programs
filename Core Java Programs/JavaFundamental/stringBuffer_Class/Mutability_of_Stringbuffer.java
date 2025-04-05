package stringBuffer_Class;
//stringbuffer is muatble  means we can change StringBuffer Object
		
public class Mutability_of_Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mutability of StringBuffer
		StringBuffer s1 = new StringBuffer("java");
		System.out.println(s1);

		System.out.println(s1.append("programming")); // javaprogramming
		// System.out.println(s1.toUpperCase());
		System.out.println(s1);
		System.out.println(s1);
	}

}
