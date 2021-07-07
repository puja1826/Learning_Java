package OOPS_AbstractClass;


public class LoginPage extends Page{
	
	public LoginPage() {
		System.out.println("Login page const....");
	}

	@Override
	public void title() {
		System.out.println("LP - Title");
	}

	@Override
	public void header() {
		System.out.println("LP - header");

	}

	public void doLogin(String un, String pwd) {
		System.out.println(un + ":" + pwd);
	}
	
	
	
}