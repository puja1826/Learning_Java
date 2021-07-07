package OOPS_Encapsulation;

public class TestComp {

	public static void main(String[] args) {

		Company c1 = new Company();
		c1.name = "IBM";
		c1.getCEOName();
		
		c1.setSharePrice(100);
		int sh1 = c1.getSharePrice();
		System.out.println(sh1);
		
		c1.getPolicyInfo();
		
		
		Page p1 = new Page();
		p1.setTitle("LoginPage");
		p1.setHeader("LoginHeader");
		p1.setTimeOut(15);
		p1.isExpired();
		p1.setTitle("AmazonLoginPage");
		System.out.println(p1.getTitle());
		
		System.out.println(p1.getTitle());
		System.out.println(p1.getTimeOut());
		
		Page p2 = new Page("HomePage", "AmaonHome", 10, true);
		System.out.println(p2.getTitle());
		System.out.println(p2.getHeader());
		
		
	}

}


