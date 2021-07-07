package OOPS_ExceptionalHandling;

public class DBConnection {

	public static void main(String[] args) {
		
		System.out.println("connecting with the DB");
		
		System.out.println("Connected with DB");
		
		System.out.println("hit the SQL query");
		
		
		try {
			System.out.println("fetch the emp table");
			int i = 9/3;
			System.out.println("display emp data....");
		}
		catch(Exception e) {
			System.out.println("SQL exception is coming....");
		}
		
		finally {
			System.out.println("close the DB connection......");
			try {
			int i = 9/0;
			}
			catch(Exception e ) {
				
			}
			
		}
		
		
		
		
	}

}