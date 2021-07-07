package OOPS_Inheritance;

public class BMW extends Car{
	int min_speed = 200;
	//variable hiding
	
	//Method Overridding: Poly+Morphism --> RunTime (Dynamic)
	//when you have a method in the 
	//parent class and the same method we have in child class
	//with:
	//the same name
	//same number of args
	//same signature
	//private and static methods can not beoverridden
	
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}
	
	public void autoParking() {
		System.out.println("BMW -- auto parking");
	}
	
	@Override
	public void engine() {
		System.out.println("BMW -- engine");
	}
	
	//Method Hiding
	public static void speed() {
		System.out.println("BMW - SPEED");
	}
}
