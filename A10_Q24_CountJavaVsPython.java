package assignments.assignment10;

public class A10_Q24_CountJavaVsPython {

	public static void main(String[] args) {
		// Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to 
		// the number of appearances of "python" anywhere in the string (case sensitive).
		
		System.out.println("Input: We study java not python");
		System.out.println(compJavaPython("We study java not python"));
		
		System.out.println("Input: What's the difference between java, javascript and python?");
		System.out.println(compJavaPython("What's the difference between java, javascript and python?"));
		
	}
	
	public static boolean compJavaPython(String str) {
	
		int countJ = 0;
		int nextJ = str.indexOf("java");
		int countP = 0;
		int nextP = str.indexOf("python");
		
			while (nextJ != -1) {
				countJ++;
				nextJ = str.indexOf("java", nextJ + 1);
			}
			
			while (nextP != -1) {
				countP++;
				nextP = str.indexOf("python", nextP + 1);
			}
		
		return (countJ == countP);
	}

}
