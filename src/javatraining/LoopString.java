package javatraining;

public class LoopString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
int  i =1;
		
		while(i<=10) { 
			System.out.println(i);//1 2 3 ....10
			if (i%7==0) {
				
				System.out.println("Multiple of 7 Found");
				break;
			}
			i++;
		}
	
	}

}
