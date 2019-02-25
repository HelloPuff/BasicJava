import java.util.Scanner;

import javax.activation.MailcapCommandMap;

public class Application {

	public static void main(String[] args) {
		Account a1 = new Account();
		
		System.out.println("Please enter username.");
		
		Scanner scanner = new Scanner(System.in);
		
		String username = scanner.nextLine();
		
		System.out.println("Please enter password.");
		
		String password = scanner.nextLine();
		int x = a1.login(username, password);

		if (x > 0) {
			System.out.println("Logging in...");
			Mail m1 = new Mail(x);
			m1.receive();

		} else {
			System.out.println("Invalid username or password...");

		}

	}

}
