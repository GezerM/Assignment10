package assignments.assignment10;

public class A10_Q25_MergeStrings {

	public static void main(String[] args) {
		// When gears merge and work together, one tooth from each one goes in order.
		// Write a method mergeStrings that will return the strings merged, one letter at a time, starting with one.
		// Please note one and two can be of different lengths. 
		
		System.out.println(mergeStrings("12345", "abcde"));
		
		System.out.println(mergeStrings("wooden", "spoon"));
		
		System.out.println(mergeStrings("java", "selenium"));

	}
	public static String mergeStrings(String str1, String str2) {
		
		String merge = "";
		
		if (str1.length() > str2.length()) {
			for (int i = 0; i < str2.length(); i++) {
				merge += "" + str1.charAt(i) + str2.charAt(i);
			}
			merge += str1.substring(str2.length());
		
		} else {
			for (int i = 0; i < str1.length(); i++) {
			merge += "" + str1.charAt(i) + str2.charAt(i);
			}
			merge += str2.substring(str1.length());
		}
						
			return merge;
	}
}
