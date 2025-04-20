package collection_framework.Arrays_class;
import java.util.Arrays;
public class Anagram_check {
	
	    public static void main(String[] args) {
	        
	        String s1 = "silent";
	        String s2 = "listen";
	        s1 = s1.toLowerCase();
	        s2 = s2.toLowerCase();
	        // Check if lengths match
	        if (s1.length() == s2.length()) {
	            // Convert to char arrays
	            char[] ch1 = s1.toCharArray();
	            char[] ch2 = s2.toCharArray();

	            // Sort both arrays
	            Arrays.sort(ch1);
	            Arrays.sort(ch2);

	            // Compare sorted arrays
	            if (Arrays.equals(ch1, ch2)) {
	                System.out.println("Anagram strings.");
	            } else {
	                System.out.println("Not anagram strings.");
	            }
	        } else {
	            System.out.println("Not anagram strings.");
	        }
	    }
	}

