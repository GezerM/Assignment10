package assignments.assignment10;

public class A10_Q23_Sandwich {

	public static void main(String[] args) {
		// A sandwich is two pieces of bread with something in between. Print the string that is between the first an
		// last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.
		
		System.out.println("input: breadjambread");
		sandwich("breadjambread");
		
		System.out.println("input: xxbreadjambreadyy");
		sandwich("xxbreadjambreadyy");
		
		System.out.println("input: xxbreadapple");
		sandwich("xxbreadapple");		
		
		System.out.println("input: breadbutterbread");
		sandwich("breadbutterbread");
		
		System.out.println("input: breadbutterbreadjambread");
		sandwich("breadbutterbreadjambread");
		
		System.out.println("input: butterjam");
		sandwich("butterjam");

	}
	public static void sandwich(String str) {
		
		str = str.toLowerCase();
		int firstBread = str.indexOf("bread");
		int nextBread = firstBread;
		int lastBread = 0;;

		while (nextBread != -1) {
			lastBread = nextBread;
			nextBread = str.indexOf("bread", nextBread + 1);
		}
		
		if (firstBread < 0) {
			System.out.println("There is no such thing like a sandwich at all!");
		} else if (lastBread <= firstBread) {
			System.out.println("nothing!");
		} else {
			System.out.println(str.substring(firstBread + 5, lastBread));
		}
		
		
	}

}
