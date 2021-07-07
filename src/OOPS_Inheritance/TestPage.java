package OOPS_Inheritance;

public class TestPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasePage obj = new BasePage();

		obj.Loginwithvalidusername();
		obj.validRegistrationdetails();

		LoginPage l1 = new LoginPage();

		l1.Logininvalidpassword();
		l1.Loginwithinvalidusername();

		// Top Casting

		// Parent P =new child();

		BasePage b1 = new LoginPage();
		b1.Loginwithvalidusername();// Overriden Methods
		b1.validRegistrationdetails();// Overriden Methods
		b1.Dashboard();// Independent Method

		// Down Casting
		// Child c=new Parent();

		//LoginPage l2 = (LoginPage)new BasePage();
		//l2.Dashboard();

	}

}
