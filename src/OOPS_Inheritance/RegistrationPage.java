package OOPS_Inheritance;

public class RegistrationPage extends BasePage {
   
	@Override
	public void validRegistrationdetails() {

		System.out.println("Valid-----RegistrationDetails ");
	}

	public void invalidRegistrationdetails() {

		System.out.println("InValid-----RegistrationDetails ");
	}

}