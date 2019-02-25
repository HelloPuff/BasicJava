
public class Application {

	public static void main(String[] args) {
		School school = new School();
		Student s1 = new Student();
		Address a1 = new Address();
		
		
		s1.name = "Paul The Super Young Painter";
		s1.age = 12;
		s1.currentGrade = "Paul is in 7th grade!";
		
		s1.address = a1;
		a1.streetName = "NE I Am Crazy Road";
		a1.houseNumber = 83695;
		a1.city = "Hillsboro";
		a1.state = "Oregon";
		a1.country = "United States of America";
		a1.zipcode = 92754;
		
		s1.isStudentAlive = false;
		
		school.enroll(s1);

	}

}
