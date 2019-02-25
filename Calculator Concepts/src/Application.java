
public class Application {

	public static void main(String[] args) {
		student s1 = new student();
		s1.name = "Paul The Tiny Painter";
		s1.eatFruit(1);
		s1.eatFruit(Fruit.Apple);
		s1.eatFruit(Fruit.Banana);
		s1.eatFruit(Fruit.Other);
		s1.eatFruit(enumTest.Fruit.Apple);
		
	}

}
