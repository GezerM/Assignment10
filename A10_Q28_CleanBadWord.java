package assignments.assignment10;

public class A10_Q28_CleanBadWord {

	public static void main(String[] args) {
		// This method gets two strings (text and badWord) and returns a string. 
		// Basically what it does is take out all the occurrences of badWord in text.
		
	System.out.println(clean ("one two three","two"));
	System.out.println(cleanX ("one two three","two ")); // second version of method doing the same thing
	
	System.out.println(clean ("foo bar","foo"));
	System.out.println(clean ("foo bar","foo "));
	
	System.out.println(clean ("he said bla bla bla","bla"));
	System.out.println(clean ("he said bla bla bla","bla"));

	}
	public static String clean(String text, String badWord) {
		
		String trimmed = "";
		int nextBadWord = text.indexOf(badWord);
		int start = 0;
		
		while (nextBadWord != -1) {
			trimmed += text.substring(start, nextBadWord);
			start = nextBadWord + badWord.length();
			nextBadWord = text.indexOf(badWord, start);		
		}
		trimmed += text.substring(start).trim();
		
		return trimmed;
	}
	public static String cleanX(String text, String badWord) { // second version of method doing the same thing
		text = text.replaceAll(badWord, "");
		text = text.replaceAll("  ", " ").trim();
		return text;
	}

}
