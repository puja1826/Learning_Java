package BuilderPattern;

public class EcommApp {
	
	private int number;
	
	public int getNumber() {
		return number;
	}

	public EcommApp doLogin() {
		System.out.println("Default login");
		return this;
	}

	public EcommApp doLogin(String un, String pwd) {
		System.out.println("login with : " + un + "and" + pwd);
		return this;
	}

	public EcommApp search() {
		System.out.println("search randomly");
		return this;
	}

	public EcommApp search(String name) {
		System.out.println("search with : " + name);
		return this;

	}

	public EcommApp search(String name, int price) {
		System.out.println("search with : " + name + " : " + price);
		return this;

	}

	public EcommApp addToCart(String name) {
		System.out.println("add to cart: " + name);
		return this;

	}

	public EcommApp doPayment(String cc, String pwd) {
		System.out.println("do payment via : " + cc + " :" + pwd);
		return this;

	}

	public EcommApp doPayment(String UPI) {
		System.out.println("do payment via : " + UPI);
		return this;
	}

	public EcommApp generateInvoice() {
		System.out.println("generate invoice");
		int number = 1234;
		this.number = number;
		return this;
	}

	public EcommApp logout() {
		System.out.println("logout");
		return this;

	}

}