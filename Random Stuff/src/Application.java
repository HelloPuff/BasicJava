
public class Application {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name = "Traxxas Slash";
		c1.wheelCount = 4;
		c1.price = 214.99;
		
		Car c2 = new Car();
		c2.name = "Traxxas Slash 4x4";
		c2.wheelCount = 4;
		c2.price = 219.99;
		
		Drone d1 = new Drone();
		d1.name = "DJI Mavic Pro";
		d1.rotors = 4;
		d1.price = 999.99;
		d1.rotorgaurds = 4;
		System.out.println("I love the DJI Mavic Pro!!!");
		System.out.println("It is just totally awesome!!!");
	}

}
