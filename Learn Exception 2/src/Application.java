
public class Application {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		
		//Adding try/catch so that you do not get an error that you cannot divide by 0.
		try {
			int z = x/y;
			
		}catch (Exception e) {
			System.out.println("Dividing by 0 does not work. It confuses me.");
			
		}
		//Adding the main goal "Happy!!!" now that the dividing by 0 error is out of the way.
		System.out.println("Happy!!!");

	}

}
