package OOPS_ExceptionalHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		String data = null;
		
		if(data == null) {
			try {
				//throw new Exception("DATANOTFOUNDEXCEPTION");
				throw null;
			}
			catch(NullPointerException e) {
				System.out.println("DATANOTFOUNDEXCEPTION is coming...Bye!!");
				e.printStackTrace();
			}
		}
		
	}

}