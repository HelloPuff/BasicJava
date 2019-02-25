
public class Application {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Aayush";
		p1.homeNickname = "Neilu";
		p1.age = 12;
		p1.grade = 7;
		p1.amazingScore = 8;
		p1.score = 8;
		p1.passesClasses = true;
		
		Person p2 = new Person();
		p2.name = "Neil";
		p2.homeNickname = "Neilu";
		p2.age = 12;
		p2.grade = 7;
		p2.amazingScore = 8;
		p2.score = 8;
		p2.passesClasses = true;
		
		Person p3 = new Person();
		p3.name = "Surya";
		p3.homeNickname = "Neilu";
		p3.grade = 7;
		p3.amazingScore = 8;
		p3.score = 8;
		p3.passesClasses = true;
		
		Rhino r1 = new Rhino();
		r1.name = "Bob";
		r1.age = 12;
		r1.weightInTons = 2;
		r1.hasHorn = true;
		r1.hasNoHorn = false;
		
		Rhino r2 = new Rhino();
		r2.name = "Bobby";
		r2.age = 12;
		r2.weightInTons = 2;
		r2.hasHorn = false;
		r2.hasNoHorn = true;
		
		Drone d1 = new Drone();
		d1.name = "DJI Mavic Pro";
		d1.rotors = 4;
		d1.price = 999.99;
		d1.workingCondition = true;
		
		Drone d2 = new Drone();
		d2.name = "DJI Phantom 4 Pro";
		d2.rotors = 4;
		d2.price = 3999.99;
		
		r1.readBook();
		r2.readBook();
		
		Student s1 = new Student();
		Student s2 = new Student();
		s1.name = "Nerdy boy!!!";
		s1.readBook();
		s2.name = "Geeky boy!!!";
		s2.readBook();
		
		Teacher t1 = new Teacher();
		Teacher t2 = new Teacher();
		Teacher t3 = new Teacher();
		t1.name = "Bob the Builder";
		t2.name = "Paul the Painter";
		t3.name = "Ed the Engineer";
		t1.eatBreakfast();
		t2.eatBreakfast();
		t3.eatBreakfast();

	}

}
