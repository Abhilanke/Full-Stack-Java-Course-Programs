package string_class;

//WAP that checks whether given strings are rotational or not
//table    rotational strings
//ablet
//bleta
//letab
//etabl
//table



//table    non-rotational strings
//abtle 
//taebl 
//ablte 
//taebl
public class Rotational_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String real_str="table";
		String chk_str="letab";
		                 // table     +    //table
		String new_str=real_str.concat(real_str);//new string ==tabletable
		//   letab==>match string is rotational
		//tabletable  ==> Check string
		if(new_str.contains(chk_str)) {
			System.out.println("Rotational strings");
			
		}else {
			System.out.println("Non-Rotational strings");
			
		}
		
	}

}

