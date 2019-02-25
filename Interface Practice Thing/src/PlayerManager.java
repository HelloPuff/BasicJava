
public class PlayerManager {
	static Playable getPlayer(int option){
		Playable player = null;
		if(option == 1){
			player = new Person();
		}else if(option == 2){
			player = new Dog();
		}
		
		return player;
	}

}
