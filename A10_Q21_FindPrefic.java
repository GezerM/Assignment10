package assignments.assignment10;

public class A10_Q21_FindPrefic {

	public static void main(String[] args) {
		// Given a string, consider the prefix string made of the first n chars of the string. 
		// Does that prefix string appear somewhere else in the string?
		// Assume that the string is not empty and that n is in the range from 1 till str.length().
		
		System.out.println("Input: abXYabc, 1");
		System.out.println("Output: " + doesRepeat("abXYabc", 1));
		
		System.out.println("Input: abXYabc, 2");
		System.out.println("Output: " + doesRepeat("abXYabc", 2));
		
		System.out.println("Input: abXYabc, 3");
		System.out.println("Output: " + doesRepeat("abXYabc", 3));
		

	}
	public static boolean doesRepeat(String str, int n) {
		
		String prefix = str.substring(0, n);
		int count = 0;
		int nextP = str.indexOf(prefix, n);
				
		while (nextP != -1) {
			count++;
			nextP = str.indexOf(prefix, nextP + n);
		}
		System.out.println(prefix + " appears " + (count + 1) + " times!"); // I can also give the count but it is not required!
		return (count > 0); 
	}
	

}
