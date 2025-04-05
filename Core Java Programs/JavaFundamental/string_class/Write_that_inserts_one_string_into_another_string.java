package string_class;

public class Write_that_inserts_one_string_into_another_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		          //  12345678910
		String s = "Hello java is language";
        String s2 = "programming";  // Corrected spelling

        // Define the position where the new string should be inserted
        int position = s.indexOf("language"); // Inserting before "language"

        if (position != -1) {
            // Insert s2 into s
            String result = s.substring(0, position) + s2 + " " + s.substring(position);
            System.out.println("Modified String: " + result);
        } else {
            System.out.println("Word not found in the string.");
        }
		

	}

}
