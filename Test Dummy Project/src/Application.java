import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.println("Please enter username.");
		
		Scanner scanner = new Scanner(System.in);
		
		String username = scanner.nextLine();
		
		System.out.println("Please enter password.");
		
		String password = scanner.nextLine();
		
		System.out.println("You have entered your username as '" + username + "'.");
		System.out.println("You have entered your password as '" + password + "'.");

	}

}
