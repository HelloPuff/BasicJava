
public class Math {
	double add(double x, double y){
		double sum = x + y;
		return sum;
	}
	
	double subtract(double x, double y){
		double difference = x - y;
		return difference;
	}
	
	double multiply(double x, double y){
		double product = x * y;
		return product;
	}
	
	double divide(double x, double y){
		double quotient = x/y;
		return quotient;
	}
	
	double getAbsoluteValue(double x){
		double absoluteValue;
		if(x < 0){
			absoluteValue = x * -1;
		}else{
			absoluteValue = x;
		}
		return absoluteValue;
	}

}
