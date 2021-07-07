package OOPS_AbstractClass;

public class TestPage {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();
		lp.title();
		lp.header();
		lp.timeOut();
		lp.doLogin("admin", "admin");
		
		//Top/Up Casting:
		Page p = new LoginPage();
		p.timeOut();
		p.title();
		p.header();
		
		//down casting: not allowed
		
		
		
	}

}