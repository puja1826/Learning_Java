package OOPS_Encapsulation;

public class AmazonLogin {
	// design a login feature - PO/BA

	private String username;
	private String password;

	public AmazonLogin(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void doLogin(String un, String pwd) {
		System.out.println("enter username: " + un);
		System.out.println("enter password: " + pwd);
		System.out.println("click on Login button");
		System.out.println("you are logged in...");
	}


}
