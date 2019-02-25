
public class Student {
	void borrowMoney(int amount) throws Exception{
		if(amount <= 0){
			Exception invalidInput = new Exception("amount is less than 1.");
			throw invalidInput;
			
		}
		
		if(amount >= 100){
			Exception invalidInput = new Exception("amount is greater than 99.");
			throw invalidInput;
			
		}
		
	}

}
