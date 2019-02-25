
public class Aplication {

	public static void main(String[] args) {

		Peerson p1 = new Peerson("Aayush", 12);
		Peerson p2 = new Peerson("Neil", 12);

		boolean canDrive = p1.canDrive();
		if(canDrive){
			/*System.out.println(p1.name + " can drive!!!");*/
		}else{
			System.out.println(p1.name + " cannot drive!!!");
			//This will automatically give you an answer that says that you can drive!!!
		}
	}

}
