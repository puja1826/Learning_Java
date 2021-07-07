package OOPS_Inheritance;


	public class Car extends Vehicle{
		
		int min_speed = 100;
		
		protected void start() {
			System.out.println("Car -- start");
		}
		
		public void stop() {
			System.out.println("Car -- stop");
		}
		
		public void refuel() {
			System.out.println("Car -- refuel");
		}
		
		public static void speed() {
			System.out.println("CAR - SPEED");
		}
		

}
