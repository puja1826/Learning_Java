package OOPS_Inheritance;

public class LoginPage extends BasePage {
    @Override
	public void Loginwithvalidusername() {
		System.out.println("Login with ----Valid Username");
	}

	public void Loginwithinvalidusername() {
		System.out.println("Login  with----Invalid Username");
	}

	public void Loginvalidpassword() {

		System.out.println("Login with -----Valid Passoword");
	}

	public void Logininvalidpassword() {
		System.out.println("Login with-----invalid Passoword");
	}
}
