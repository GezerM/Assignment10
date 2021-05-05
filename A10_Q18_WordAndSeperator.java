package assignments.assignment10;

public class A10_Q18_WordAndSeperator {
	// Given two strings, word and a separator sep, return a big string made of count 
	// occurrences of the word, separated by the separator string.

	public static void main(String[] args) {
		
		System.out.println("Input: Word, X, 3");
		System.out.println("Output: " + returnBig("Word", "X", 3));
		
		System.out.println("Input: This, And, 2");
		System.out.println("Output: " + returnBig("This", "And", 2));
		
		System.out.println("Input: This, And, 1");
		System.out.println("Output: " + returnBig("This", "And", 1));
		

	}
	public static String returnBig(String word, String sep, int times) {
		String big = word;
		
		for(int i = 1; i < times; i++) {
			big += sep+word;
		}
		
		
		return big;
		
	}

}
