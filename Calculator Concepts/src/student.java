
public class student {
	String name;

	void eatFruit(int x) {
		if (x == 1) {
			System.out.println("I'm going to eat the apple!");

		} else {
			if (x == 2) {
				System.out.println("I'm going to eat the banana!");

			} else {
				System.out.println("I can't decide which fruit to eat!");

			}

		}

	}

	void eatFruit(enumTest.Fruit f) {
		System.out.println("I'm eating " + f + "!!!");

	}

}
