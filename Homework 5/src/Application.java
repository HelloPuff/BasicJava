
public class Application {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Paul";
		s1.age = 12;
		s1.readBook();
		
		int result = s1.multiplyNumbers(3, 7);
		System.out.println(result);
		
		result = s1.multiplyNumbers(7, 8);
		System.out.println(result);
		
		result = s1.findAbsoluteValue(-17);
		System.out.println(result);
		
		result = s1.findAbsoluteValue(17);
		System.out.println(result);
		
	}

}
