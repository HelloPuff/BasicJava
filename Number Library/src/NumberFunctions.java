
public class NumberFunctions {
	public long reverse (long inNumber){
	long outNumber = 0;
	while(inNumber > 0){
		long remainder = inNumber % 10;
		outNumber = outNumber * 10 + remainder;
		inNumber = inNumber / 10;
		
	}
	
	return outNumber;
	}
	
}
