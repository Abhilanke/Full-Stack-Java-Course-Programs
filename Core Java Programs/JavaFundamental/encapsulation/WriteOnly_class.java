package encapsulation;

// Write-Only Class: We can only write data but cannot read it.
// To create a Write-Only class, we only provide setters and do not include getters.
class Login2 {
	private String uname; // Private variable

	// Setter method to modify the value of uname
	public void setUname(String uname) {
		this.uname = uname;
	}
}

public class WriteOnly_class {
	public static void main(String[] args) {
		Login2 l1 = new Login2();

		// Can modify uname using setter method
		l1.setUname("harsh");

		// Cannot read uname because there is no getter method
		// System.out.println("Username: " + l1.getUname()); // Error: No getter method
		// available
	}
}