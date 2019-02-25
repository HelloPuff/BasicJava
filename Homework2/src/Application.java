public class Application {
	public static void main(String[] args) {
		Person d1 = new Person();
		d1.company = "DJI";
		d1.name = "Mavic Pro";
		d1.rotors = 4;
		d1.rotorgaurds = 4;
		d1.price = 999.99;
		
		int x;
		for(x = 1;x <= 100;x = x + 1){
			int age = 12;
			if(age >= 16){
				System.out.println("You can drive!!!	" + x);
			}else{
				System.out.println("You can't drive untill you are 16 young ...(Gender Unknown)!!!	" + x);
			}
		
		}

	}

}
