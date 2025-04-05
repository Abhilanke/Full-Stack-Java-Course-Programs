package string_class;

//20 method in String 
public class Method_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String inmutable its not change
		// 1.string concat(String s)
		String s1 = new String("java");
		System.out.println(s1);
		System.out.println(s1.concat("programing"));// concat ==>> join two string
		System.out.println(s1);

		// 2.String equals(String obj)=> check same contain
		// string accept string object only
		String s2 = new String("java programing");
		String s3 = new String("java programing");
		System.out.println(s2.equals(s3));// s2 and s3 have a same contain its return true

		String s4 = new String("java programing");
		String s5 = new String("java ");
		System.out.println(s4.equals(s5));// s4 and s5 have a diff contain . its return false

		String s6 = new String("java");
		String s7 = new String("jAva ");
		System.out.println(s6.equals(s7)); // s6 and s7 are have a same contain but cases are different

		// 3.equalsIgnoreCase() return boolean ==> check only the contents
		String s8 = new String("java programing");
		String s9 = new String("java proGraMing");
		System.out.println(s8.equalsIgnoreCase(s9));

		// 4 charAt() charAt(int index); //find character present on given index
		String s10 = new String("java programing");
		System.out.println(s10);
		System.out.println(s10.charAt(6));
		String s11 = new String("java proGraMing");
		// System.out.println(s11.charAt(20));//showing exception

		// 5. isEmpty()==>
		String s12 = new String("java programing");
		System.out.println(s12);
		System.out.println(s12.isEmpty());// false

		String s13 = new String();
		System.out.println(s13);
		System.out.println(s13.isEmpty());// true

		String s14 = "";
		System.out.println(s14);
		System.out.println(s14.isEmpty());// true

		String s15 = "  ";
		System.out.println(s15);
		System.out.println(s12.isEmpty());// false

		String s16 = "ppp";
		System.out.println(s16);
		System.out.println(s16.isEmpty());// false

		/*
		 * //5.isEmpty()=>Returns true only when the length of string is zero means
		 * string contains nothing not even space String s1= "   ";
		 * System.out.println(s1); System.out.println(s1.isEmpty()); //false
		 * System.out.println(s1.length()); //3
		 */

		// 6.isBlank()=>Returns true if the string is empty or contains only white space
		// codepoints,otherwise false.
		String s17 = "   ";
		System.out.println(s17);
		System.out.println(s17.isBlank()); // true
		System.out.println(s17.length()); // 3

		// 7. string replace(char old, char new)

		/*
		 * //6.String replace(char old, char new) String s1= new
		 * String("java programming");
		 * 
		 * System.out.println(s1); System.out.println(s1.replace('a', 'Z')); //replacing
		 * a with z
		 */

		String s18 = new String("java programing");
		System.out.println(s18);
		System.out.println(s18.replace('a', 'Z'));// replasing A with z(replase String)

		String s19 = new String("java programing java session");
		System.out.println(s19);
		System.out.println(s19.replace("java", "Python"));// replasing A with z(replase String)
		/*
		 * //.String replace(String old, String new)=> replace ALL occurrences of old
		 * string with new string String s1= new
		 * String("java programming java language java session");
		 * 
		 * System.out.println(s1); System.out.println(s1.replace("java", "cpp"));
		 * //replacing a with z
		 */

		// 8. string replaceFirst(char old, char new) ==> replase only first occuence of
		// old string with new string

		String s20 = new String("java programing");
		System.out.println(s20);
		System.out.println(s20.replaceFirst("java", "python"));// replasing A with z(replase String)

		// .String replaceFirst(String old, String new) => replace only First occurrence
		// of old string with new string
		String s21 = new String("java programming java language java session");

		System.out.println(s21);
		System.out.println(s21.replaceFirst("java", "cpp")); // replacing a with z

		// 9 WAP THAT delete space from form given string
		// tamprary delete .. not deleted directly
		// WAP that deletes 'a' from given string
		String s22 = new String("java programming java language java session");
		System.out.println(s22);
		System.out.println(s22.replace(" ", ""));// replacing space by the empty string

		// WAP that deletes 'a' from given string
		String s23 = new String("java programming java language java session");
		System.out.println(s23);
		System.out.println(s23.replace("a", ""));// replacing 'a' by the empty string

		// 10. substring== its is part of string(subpart of whole string )
		String s24 = new String("java programming java language java session");
		System.out.println(s24);
		System.out.println(s24.substring(9));// returns substring starting from 9th index to end of the string
		// starting with r and end direct and print

		String s25 = new String("java programming java language java session");
		System.out.println(s25);
		System.out.println(s25.substring(9, 12));// returns substring starting from 9th index to 11(12-1)

		// 11.trim method (return type is String ) ==> removes blank spaces present at
		// the beginning of the
		String s33 = new String("      Programing language    ");
		System.out.println(s33);
		System.out.println(s33.trim());

		/*
		 * //11.String trim()=> Removes blank spaces present at the beginning of the
		 * string and at the ending of the string but it does not removes middle blank
		 * spaces. String s1= new String("    java programming session   ");
		 * System.out.println(s1); System.out.println(s1.trim());
		 */

		// 12.boolean containt(String s)
		String s34 = new String("      Programing language    ");
		System.out.println(s34);
		System.out.println(s34.contains("ram"));// true
		System.out.println(s34.contains("ramu"));// false

		// 12.boolean contains(String s)=> used to check whether the specific set of
		// character are part of the given string or not.
		String s44 = new String("java programming session");

		// 13. intern()
		// 14 int indexOf(char ch)== indexof() return an index number on given character
		// 14.int indexOf(char ch) => indexOf() returns an index no of given character
		// 012345678910
		String s37 = new String("java programming language session");
		System.out.println(s37);
		System.out.println(s37.indexOf('a')); // 1 returns first occurrence of given character
		System.out.println(s37.indexOf('a', 4)); // 10 //here ,4 is the fromindex from where we wants to search for
													// index of character 'a'
		System.out.println(s37.lastIndexOf('a')); // 22 returns last occurrence of given character

		// 15 public String toLowecase();
		/*
		 * //15.: public String toLowerCase() 
		 * String s1= new String("JAVA PROGRAMS");
		 * System.out.println(s1); System.out.println(s1.toLowerCase());
		 * 
		 */
		/*
		 * //16.: public String toUpperCase() 
		 * String s1= new String("java progs");
		 * System.out.println(s1); System.out.println(s1.toUpperCase());
		 */

		/*
		 * //17.public int length() 
		 *                       // 0
		 * String s1= new String("java progs");
		 * System.out.println(s1); System.out.println(s1.length());
		 */
		
		//18 ToString()
		//19 
		//20.

	}

}
