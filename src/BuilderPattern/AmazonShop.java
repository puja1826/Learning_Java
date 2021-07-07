package BuilderPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;


public class AmazonShop {

	public static void main(String[] args) {

		EcommApp shop = new EcommApp();

		shop.doLogin("naveen@gmail.com", "naveen123").search("Nike Shoes", 10000).addToCart("Nike Shoes")
				.doPayment("1212 1212 1212 1212", "1234").generateInvoice().logout();

		shop.doLogin("naveen@gmail.com", "naveen123").addToCart("Addidas Tshirt")
				.doPayment("1212 1212 1212 1212", "1234").generateInvoice();
		int invoiceNum = shop.getNumber();
		System.out.println(invoiceNum);

		shop.doLogin().search();

		shop.doLogin().search("Macbook Pro").logout();

		shop.doLogin("naveen@gmail.com", "naveen123").logout();

	}


	
	
}