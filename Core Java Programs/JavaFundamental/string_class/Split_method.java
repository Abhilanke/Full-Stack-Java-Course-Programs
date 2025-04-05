package string_class;
//WAP that count no of words in given string
public class Split_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is an object orianted programing language";//7
		System.out.println("orignal string ="+s);
		s.split(" ");
		System.out.println();
		String words[]=s.split(" ");
		System.out.println("Number of words present inside string >> "+words.length);
		for(int i=0; i<words.length;i++) {
			System.out.println(words[i]);
			
		}
		// o nikalke  print karega
		String word[]=s.split("o");
		System.out.println("Number of words present inside string >> "+word.length);
		for(int i=0; i<word.length;i++) {
			System.out.println(word[i]);
			
		}
	}

}
