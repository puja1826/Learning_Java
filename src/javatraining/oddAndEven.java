package javatraining;

public class oddAndEven {
	
	   public static boolean isEven(int value) {
	        // An even number is always evenly divisible by 2.
	        return value % 2 == 0;
	    }

	    public static boolean isOdd(int value) {
	        // This handles negative and positive odd numbers.
	        return value % 2 != 0;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int value = 44;
	        if (isEven(value)) {
	            System.out.println("The Number is Even Number:"+value);
	        }

	        value = 99;
	        if (isOdd(value)) {
	            System.out.println("The Number is odd Number:" +value);
	        }
	    }
	
	}


