
public class Mail {
	int id;

	Mail(int id) {
		this.id = id;

	}

	void send(String recipient, String subject, String textBody) {

	}

	void receive() {
		System.out.println("Receiving emails for user " + this.id + "...");

	}

}
