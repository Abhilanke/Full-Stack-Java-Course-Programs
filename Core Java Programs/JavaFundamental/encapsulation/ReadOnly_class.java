package encapsulation;

//Q.How We create our own read only class
//=>>
//ReadOnly => we can only read data but cannot write/modify
//If we want to create our own ReadOnly class then just provide getters in that class.
//do not provide any setter 
class Login1 {
	private String uname = "ram@123";

	public String getUname() {
		return uname;
	}

	// getter

}

public class ReadOnly_class { // setter=> write, getter => read

	public static void main(String[] args) {

		Login1 l1 = new Login1();
		// l1.uname="harsh"; //error=> bz, uname is private
		// l1.setUname("harsh"); //error => setter "setUname()" does not exists

		System.out.println(l1.getUname());

		System.out.println(l1.getUname());

	}

}
