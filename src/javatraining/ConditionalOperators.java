package javatraining;

public class ConditionalOperators {

	public static void main(String[] args) {
		int x = 25;
		int y = 78;
		int z = 87;
		

		if (x > y && x > z) {
			
			System.out.println("The greater Number:"+x);
		}

		else if (y > z) {// true
			System.out.println("The greatest Number:"+y);
		} 
		else {
			System.out.println("The Greatest Number:"+z);

	}

}

}