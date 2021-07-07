package javatraining;

public class votingAge {

	public int voting(int age) {

		if (age > 18) {
			System.out.println("Eligible to vote (age > 18)");
		}else
		System.out.println("Not eligible to vote");

		return age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		votingAge obj=new votingAge();
		int m1=obj.voting(17);
		System.out.println("The candidate age is: "+m1);

		
	
		
		
		

	}

}
