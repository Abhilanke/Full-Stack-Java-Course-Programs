package string_class;

//WAP that reverse the given string
public class ToCharArray_method {

	public static void main(String[] args) {
		String s = new String("Hello java users");
		System.out.println(s);

		// converting string into character array using toCharArray() method

		char x[] = s.toCharArray();
		for (int i = x.length - 1; i >= 0; i--) {
			System.out.print(x[i]);
		}
	}

}

//delete==>> using replase method
//insert ==>>
//reverse==> useing ToCharArray
