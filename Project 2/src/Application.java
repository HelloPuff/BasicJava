
public class Application {

	public static void main(String[] args) {
		PatternCalculator p1 = new PatternCalculator();
		for (int x = 1; x <= 10; x = x + 1){
			int result = p1.simplePattern(x);
			System.out.println(x + " " + result);
		
		}
		
		System.out.println("x y");
		int lengthOfLine = 5;
		for(int x = 1 ; x <= lengthOfLine ; x = x + 1){
			int y = 4 * x + 3;
			System.out.println(x + " " + y);
		
		}

		System.out.println("x y");
		int n = 5;
		for (int x = 1; x <= n; x = x + 1) {
			LinearEquation l1 = new LinearEquation(4, 3);
			int result = l1.getYCoordinate(x);
			System.out.println(x + " " + result);

		}
	}

}
