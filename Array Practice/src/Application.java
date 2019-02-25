
public class Application {

	public static void main(String[] args) {
		int[] number = new int[10000000];
		for(int x  = 0 ; x < number.length ; x = x + 1){
			number[x] = x;
			System.out.println(number[x]);
			for(int y = 0 ; y < number.length ; y = y + 1){
				number[x] = x;
				System.out.println(number[x]);
			}
			
			
		}

	}

}
