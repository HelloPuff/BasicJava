
public class Person {
	Person s1 = new Person();
	void readBook (String bookName){
		s1.readBook ("Percy Jackson");
	}
	void readBook (String bookName, int minutesRead){		
		s1.readBook ("Percy Jackson", "120");
	}
	
	void readBook (String bookName, int minutesRead, int pagesRead){
		s1.readBook ("Percy Jackson", "120", "375");
	}
	
}
