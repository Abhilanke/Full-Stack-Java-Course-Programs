package string_class;

//String(immutable means non-changeable) ,StringBuffer(mutable means changeable),StringBuilder (mutable means changeable)=>comes under java.lang
//Q.Explain immutability of string
/*ans => Once String object is created you can’t perform any changes into that already 
existing object if you are trying to perform any changes then with those changes new
objects will be created, but since that new object doesn’t have any reference variable that new object is eligible for garbage collection and you will get your original object as it is.
*/
public class Immutabillity_of_string {

	public static void main(String[] args) {

		// String inmutable its not change
		// String s1=new String("java");
		// System.out.println(s1);
		// System.out.println(s1.concat("programing"));
		//// System.out.println(s2);
		// System.out.println(s1.toUpperCase());
		// System.out.println(s1);

		//Mutability of StringBuffer its changeble
		StringBuffer s3 = new StringBuffer("java");
		System.out.println(s3);

		System.out.println(s3.append("programing"));
		// System.out.println(s2);
		System.out.println(s3);
	}

}
