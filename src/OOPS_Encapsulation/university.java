package OOPS_Encapsulation;



public class university {

	private String name;
	String country;
	int establishedDate;

	public university(String name, String country, int establishedDate) {

		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
	}
	
	
	public university(String name, String country) {
		this.name = name;
		this.country = country;

	}
	
public university(String name) {
	this.name=name;
}

public String getName() {
return this.name;
	
}
	public university( String country, int establishedDate) {
		
		this.establishedDate=establishedDate;
		this.country=country;
		
		
	}


}
	  

