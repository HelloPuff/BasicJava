
public class Car {
	void start(){
		
	}
	
	void getNumberOfWheels(){
		System.out.println("There are 4 wheels because this is a normal car!!!");
		
	}
	
	String changeOil(String oilName){
		if(oilName == "Neil's Oil"){
			System.out.println("Success!!!");
			
		}else{
			System.out.println("Fail!!!");
			
		}
		
		return oilName;
	}

}
