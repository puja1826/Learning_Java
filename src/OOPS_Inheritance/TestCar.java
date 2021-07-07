package OOPS_Inheritance;

public class TestCar {
	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();//overridden 
		b.stop();//inherited
		b.refuel();//inherited
		b.autoParking();//Individual
		System.out.println(b.min_speed);
		BMW.speed();
		Car.speed();
		b.engine();
		b.vehicleType();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.vehicleType();
		
		Vehicle v = new Vehicle();
		v.vehicleType();
		
		
		
		//child class object can be referred by parent class ref variable:
		//Top/Up casting
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		
		Vehicle v1 = new BMW();
		AutoMobile am = new BMW();
		am.vehicleType();
		
		//Down CAsting:
		//parent class object can be referred by child class ref variable:
		//BMW b1 = (BMW) new Car();//ClassCastException
		
		//BMW b2 = (BMW) new Vehicle();
		BMW b2 = (BMW) new AutoMobile();

		
	}

}
