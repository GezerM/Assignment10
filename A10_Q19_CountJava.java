package assignments.assignment10;

public class A10_Q19_CountJava {

	public static void main(String[] args) {
		// Return the number of times that the string "java" appears anywhere in the given string word.
		
		System.out.println("Input:  kavaxkava");
		System.out.println("Output: " + countJava("kavaxkava"));
		
		System.out.println("Input:  javaxjavaapplepearjavaegg");
		System.out.println("Output: " + countJava("javaxjavaapplepearjavaegg"));

	}
	
	public static int countJava(String str) {
		
		str = str.toLowerCase();
		int count = 0;
		int nextJ = str.indexOf("java");
		
		while (nextJ != -1) {
			count++;
			nextJ = str.indexOf("java", nextJ + 1);
		}
		
		return count;
	}

}
