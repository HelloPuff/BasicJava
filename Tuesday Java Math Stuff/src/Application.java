
public class Application {

	public static void main(String[] args) {
		Math m1 = new Math();
		double result = m1.add(9, 17);
		System.out.println(result);
		System.out.println(m1.add(17, 9));
		System.out.println(m1.subtract(9, 17));
		System.out.println(m1.subtract(17, 9));
		System.out.println(m1.multiply(9, 17));
		System.out.println(m1.multiply(17, 9));
		System.out.println(m1.divide(17, 9));
		System.out.println(m1.divide(9, 17));
		System.out.println(m1.getAbsoluteValue(26));
		System.out.println(m1.getAbsoluteValue(-26));
		int [] numbers = new int [5];
		numbers [0] = 9;
		numbers [1] = 10;
		numbers [2] = 11;
		numbers [3] = 12;
		numbers [4] = 13;
		for(int x = 0; x < 5; x = x + 1){
			System.out.println(numbers[x]);
			
		}
		
		String [] names = new String [5];
		names [0] = "Aayush";
		names [2] = "Neil";
		for(int x = 0; x < 5; x = x + 1){
			System.out.println(names [x]);
		}
		
		boolean [] isItMacAndCheese = new boolean [5];
		isItMacAndCheese [0] = true;
		isItMacAndCheese [4] = true;
		for(int x = 0; x < 5; x = x + 1){
			System.out.println(isItMacAndCheese [x]);
			
		}
		
		char [] grades = new char [5];
		grades [0] = 'A';
		grades [1] = 'B';

	}

}
