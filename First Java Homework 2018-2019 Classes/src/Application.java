public class Application {

	public static void main(String[] args) {
		int totalNumberOfMinutesRead;
		int i;
		
		Person p1 = new Person();

		for(i = 1; i <= 4; i = i + 1) {
			int minutes = p1.readBook();
			totalNumberOfMinutesRead = i * minutes;
			System.out.println(totalNumberOfMinutesRead + " total minutes have been read so far.");
			
		}

	}

}
