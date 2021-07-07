package javatraining;

public class Company {
	
	String companyName;
	int sharePrice;
	String HQ;
	
	

	public Company(String companyName, int sharePrice, String hQ) {
		this.companyName = companyName;
		this.sharePrice = sharePrice;
		this.HQ = hQ;
	}
	
public Company(String companyName) {
	this.companyName=companyName;
	
}

public Company(String companyName, int sharePrice){
	this.companyName=companyName;
	this.sharePrice=sharePrice;
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company c1=new Company("IBM");
		System.out.println("The name of the Company is "+c1.companyName);
		Company c2=new Company("ABC", 4000);
		System.out.println(c2.companyName+ " " +c2.sharePrice);
		
		
		
	}

}
