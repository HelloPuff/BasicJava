
public class Application {

	public static void main(String[] args) {
		Math m1 = new Math();
		Math m2 = new Math();
		Math m3 = new Math();
		m1.name = "Bob the Builder";
		m2.name = "Paul the Painter";
		m3.name = "Ed the Engineer";
		m1.add(2);
		m2.add(5238683);
		m3.add(98982);
		
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		d1.name = "Bob the Builder";
		d2.name = "Paul the Painter";
		d3.name = "Ed the Engineer";
		d1.feed();
		d2.feed();
		d3.feed();

	}

}
