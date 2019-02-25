
public class Account {
	int id;
	String username;

	int login(String username, String password) {
		this.username = username;
		if(username.equals("Hello") && password.equals("Hi101") ){
			this.id = 1;
			return 1;
		}
		
		elseif:
			return 0;
			
	}	

	void logout() {
		System.out.println("Logging out " + this.username + this.id + "...");

	}

}
