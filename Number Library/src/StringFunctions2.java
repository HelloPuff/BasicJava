
public class StringFunctions2 {
	String reverse(String wordToBeReversed){
		char[] word = wordToBeReversed.toCharArray();
		
		for(int forwardPointer = 0 , reversePointer = word.length-1 ; reversePointer > forwardPointer ; ++ forwardPointer, -- reversePointer){
			char temp = word[forwardPointer];
			word[forwardPointer] = word[reversePointer];
			word[reversePointer] = temp;
			
			}
		
		return new String(word);
	}
	

}
