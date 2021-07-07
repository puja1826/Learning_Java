package OOPS_Encapsulation;

public class Company {

	public String name;
	private int sharePrice;

	// public setter and getter
	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}

	public int getSharePrice() {
		return sharePrice;
	}

	public void getCEOName() {
		System.out.println("Bill gates");
	}

	private void getPolicy() {
		System.out.println("get policy");
	}

	public void getPolicyInfo() {
		getPolicy();
	}

	public static void main(String[] args) {

		Company c1 = new Company();
		c1.name = "IBM";
		c1.sharePrice = 100;
		c1.getPolicy();
		c1.getCEOName();

	}


}
