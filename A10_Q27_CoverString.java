package assignments.assignment10;

public class A10_Q27_CoverString {

	public static void main(String[] args) {
		/*
coverString method will take 2 string parameters from the caller.

Your job is to write an important code that will :

- to search and find each appearance of coverME within main
- then surround it with [coverMe] (square brackets)
- if you cannot find the coverME within main after tirelessly looping then just return whole main itself covered [main].
- keep in mind that coverME value can be of any length.
		 */
		
	System.out.println(coverString("java methods", "me"));
	System.out.println(coverItAgain("java methods", "me")); // This version works with replace()
	
	
	System.out.println(coverString("Certified Wooden Spoon", "o"));
	System.out.println(coverItAgain("Certified Wooden Spoon", "o"));
	
	System.out.println(coverString("apples", "pears"));
	System.out.println(coverItAgain("apples", "pears"));

	}
	public static String coverItAgain(String strLong, String strShort) { // second version of method doing the same thing
		
		if (!strLong.contains(strShort)) {
			strLong = "[" + strLong + "]";
		} else {
		
				strLong = strLong.replace(strShort, "[" + strShort + "]");
			
		
		}
		return strLong;
	}
	public static String coverString(String strSr, String strJr) {
		
		String  covered = "";
		int nextJr = strSr.indexOf(strJr);
		int lenghtJr = strJr.length();
		int start = 0;
		
		if (nextJr == -1) {
			covered = "[" + strSr + "]";
		} else {
		
			while (nextJr != -1) {
				covered += strSr.substring(start, nextJr) + "[" + strJr + "]";
				start = nextJr + lenghtJr;
				nextJr = strSr.indexOf(strJr, start);
			}
			covered += strSr.substring(start);
		}
		
		return covered;
		
	}

	
	

}
