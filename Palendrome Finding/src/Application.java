
public class Application {
	public static void main(String[] args) {
		for(int x = 10 ; x <= 100000 ; x = x + 1){
		NumberFunctions n = new NumberFunctions();
		long reverseOfX = n.reverse(x);
		if(x == reverseOfX){
			System.out.println("Palendrome.");
			
		}else{
			System.out.println("Not palendrome.");
			
			}
		
		
		}
	}

}
