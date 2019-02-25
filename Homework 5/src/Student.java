
public class Student {
	String name;
	int age;
	
	void readBook(){
		System.out.println("Get book " + name + "!!!");
		System.out.println("Read book " + name + "!!!");
		System.out.println("Return book " + name + "!!!");
	}
	
	int multiplyNumbers(int x, int y){
		int result = x * y;
		return result;
		
	}
	
	int findAbsoluteValue(int x){
		int result;
		if(x < 0){
			result = x * -1;
			
		}else{
			result = x;
			
		}
		return result;
		
	}

}
