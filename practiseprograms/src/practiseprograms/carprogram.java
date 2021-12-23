package practiseprograms;

public class carprogram {

	String licensePlate;
	double speed;
	double maxSpeed;
}

class CarTest {
	public static void main(String args[]) {
		carprogram c = new carprogram();
		c.licensePlate = "Tirupathi A45 636";
		c.speed = 70.0;
		c.maxSpeed = 123.45;
		System.out
				.println(c.licensePlate + " is moving at " + c.speed + "                         kilometers per hour.");
	}
}
