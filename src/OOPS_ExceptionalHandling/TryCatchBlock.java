package OOPS_ExceptionalHandling;

public class TryCatchBlock {
	String name = "Tom";
	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			int i = 9/3;
			TryCatchBlock obj = new TryCatchBlock();
			obj = null;
			System.out.println(obj.name);
			
			System.out.println("hi");
			System.out.println("hi");
			System.out.println("hi");
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming....");
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.out.println("NPE is coming....");
			e.printStackTrace();
		}
		
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");

		
		
	}

}