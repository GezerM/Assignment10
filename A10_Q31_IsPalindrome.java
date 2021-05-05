package assignments.assignment10;

public class A10_Q31_IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPalindrome("Noon"));
		
		System.out.println(isPalindrome("I am not palindrome"));
		
		System.out.println(isPalindrome("wooden"));
		
		System.out.println(isPalindrome("Nurses Run"));
		
	}
	public static boolean isPalindrome(String str) {
		str = str.replace(" ", "");
		String dummy = "";
		for (int i = str.length(); i > 0; i--) {
			dummy += str.charAt(i-1);
		}
		
		return (str.equalsIgnoreCase(dummy));
	}

}
