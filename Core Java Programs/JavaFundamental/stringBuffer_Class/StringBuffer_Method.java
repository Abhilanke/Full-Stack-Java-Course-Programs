package stringBuffer_Class;
//StringBuffer creates mutable(changeable) type of object
//Q.difference between String  and StringBuffer
//=> String is immutable and StringBuffer is mutable

//cmd=> javap package name

//String StringBuffer and StringBuilder
//StringBuffer
//1.STringBuffer  method are synchronized

//StringBuilder

//1.StringBuilder method are non-synchronized

public class StringBuffer_Method {

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("hello dear java user");

		// s.reverse();
		System.out.println(s);
		
		System.out.println(s.capacity());//16

		// reverce String
		// System.out.println(s.reverse());

		// deleting character
		// System.out.println(s.delete(7, 10));

		// replace string
		System.out.println(s.replace(11, 15, "cpp"));

		// 1.reverse()
		// System.out.println(s);
		// System.out.println(s.reverse());

		// 2.delete()
		// System.out.println(s.delete(7, 10));

		//3. deleteCharAt(int);
        System.out.println(s.deleteCharAt(4));
	
		// 4.replace()
		// System.out.println(s.replace(11, 15, "cpp")); //replacing "java" by "cpp"
		// 5. insert
		// s.insert(16, "language");
		// System.out.println(s);

		// s.insert(15, 21);
		// System.out.println(s);

		// 6.ensureCapacity()
		// 7.capacity()
		
	}

}
