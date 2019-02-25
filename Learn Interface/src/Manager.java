
public class Manager {
	static Playable getPlayer(int option){
		switch(option){
			case 1:
				return new Student();
			case 2:
				return new Dog();
				
		}return null;
		
	}

}
