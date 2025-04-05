package this_keyword;

class User11 {
	int uid;
	String email;
	String pass;

	User11(int x, String y, String z) {

//		Instance uid veriable && local x variable 
		// uid = x;
//		email = y;
//		pass = z;
		// This keyword it represent to currunt object
		// This_keyword_for_calling_instance_variable
		// this is used to represent currently executing object and class
		// **uses this keyword**
		// 1.same instance and same local variable this time use this keyword
		//// 1st use of this => whenever you are using same name for instance and local
		// variable..so to identify the difference between local and insatnce var we
		// need to use this keyword
		// for exmple showing null value
//		User11(int uid, String email, String pass) {
//			uid = uid;
//			email = email;
//			pass = pass;
//			//output is ::: Id is >> 0 Email is >> null Paasword is >> null
//			this.uid = uid;
//			this.email = email;
//			this.pass = pass;
//			//output is :: Id is >> 121,Email is >> abhilanke@gmail.com, Paasword is >> abhi 		
//		}
		this.uid = x; // This keyword used calling purpose
		email = y;
		pass = z;
	}

	void show() {

		System.out.println("\n Id is >> " + uid);
		System.out.println("\n Email is >> " + email);
		System.out.println("\n Paasword is >> " + pass);

	}
}

public class This_Keyword_for_Calling_instance_variable {

	public static void main(String[] args) {

		User11 user = new User11(121, "abhilanke@gmail.com", "abhi");
		user.show();

		User11 user1 = new User11(121, "amol@gmail.com", "kunal");
		user1.show();

		User11 user2 = new User11(121, "amol@gmail.com", "Amol");
		user2.show();

	}

}
