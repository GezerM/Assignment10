package assignments.assignment10;

public class A10_Q20_Factorial {
	
	public static void main(String[] args) {
		// In mathematics, the factorial of a positive integer n, denoted by n!,  is the product of all positive integers 
		// less than or equal to n. Calculate factorial and output result to the console.
		
		
		System.out.println("Input:  1");
		System.out.println("Output: " + getFactorial(1));
		
		System.out.println("Input:  5");
		System.out.println("Output: " + getFactorial(5));
		
	}
	
	public static int getFactorial(int x) {
		
		int factorial = 1;
		for (int i = 1; i <= x; i++) {
			factorial *= i;
			
		}
		
		return factorial;
	}

}
