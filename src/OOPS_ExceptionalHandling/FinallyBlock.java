package OOPS_ExceptionalHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			int i = 9 / 3;
			// System.exit(1);//JVM shut down
		}

		finally {
			System.out.println("This is my finally block....");
		}

		System.out.println(getMarks("Tom"));
	}

	public static int getMarks(String name) {
		if (name.equals("Tom")) {
			try {
				int i = 9 / 3;
				System.exit(1);
				return 70;
			} catch (ArithmeticException e) {
				System.out.println("AE is coming....");

				try {
					int p = 100 / 0;
					return 89;
				} 
				catch (Exception ex) {
					System.out.println("AE1 is coming....");
					return 99;
				}
				finally {
					System.out.println("im inside the finally block1...");
					return 999;
				}
				
			} 
			finally {
				System.out.println("im inside the finally block2...");
				return 30;
			}
		} else if (name.equals("lisa")) {
			return 90;
		} else if (name.equals("peter")) {
			return 80;
		}

		return -1;
	}

}