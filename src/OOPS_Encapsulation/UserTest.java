package OOPS_Encapsulation;

public class UserTest {
	public static void main(String[] args) {

		//POST
		AmazonLogin az = new AmazonLogin("naveen@gmail.com", "naveen123");
//		az.setUsername("naveen@gmail.com");
//		az.setPassword("naveen123");
		az.doLogin(az.getUsername(), az.getPassword());
		
		//update the info: PUT
		az.setPassword("naveen234");
		az.doLogin(az.getUsername(), az.getPassword());//GET

		
		AmazonLogin az1 = new AmazonLogin("sheetal@gmail.com", "sheetal123");
//		az1.setUsername("sheetal@gmail.com");
//		az1.setPassword("sheetal123");
		az1.doLogin(az1.getUsername(), az1.getPassword());

		System.out.println("--------------");
		Browser br = new Browser();
		br.launchBrowser();
		
}
}
