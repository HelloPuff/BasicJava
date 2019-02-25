
public class Application {

	public static void main(String[] args) {
		for(int number = 1 ; number <= 1000 ; number = number + 1){
			boolean isNumberPrime = true;
			for(int divisor = 1 ; divisor <= 1000 ; divisor = divisor + 1){
				if(number / divisor == 0){
					isNumberPrime = false;
					break;
					
				}
				
					
				}
			if(isNumberPrime == true){
				System.out.println(number + " is a prime number!!!");
			
			}

			}	
		}

	}
