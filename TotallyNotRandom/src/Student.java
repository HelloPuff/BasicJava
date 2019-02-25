
public class Student {
	String name;
	int age;
	double grade;

	private void Student(String bookName){
		checkOut(bookName);
		readBook(bookName);
		returnBook(bookName);
	}
	
	private void checkOut(String bookName){
		System.out.println("1. Check out Harry potter!!!");
	}
	
	private void readBook(String bookName){
		System.out.println("2. Read Harry Potter!!!");
	}
	
	private void returnBook(String bookName){
		System.out.println("3. Return Harry Potter!!!");
	}

}
