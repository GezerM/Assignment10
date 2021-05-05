package assignments.assignment10;

public class A10_Q16_HasJava {

	public static void main(String[] args) {
		// Given a string word, print true if "java" appears starting at index 0 or 1 in the string, 
		//such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string should be 4 and more characters.
		
		System.out.println("input: javaxxx");
		System.out.println("output: " + hasJavad("javaxxx" ));
		
		System.out.println("input: xjavaxx" );
		System.out.println("output: " + hasJavad("xjavaxx" ));
		
		System.out.println("input: xxjavaxx");
		System.out.println("output: " + hasJavad("xxjavaxx"));
		
		System.out.println("input:  cjavac++");
		System.out.println("output: " + hasJavad("cjavac++" ));
		
		System.out.println("input:  c#javaruby");
		System.out.println("output: " + hasJavad("c#javaruby" ));
		
		System.out.println("input:  jav");
		System.out.println("output: " + hasJavad("jav" ));

	}
	
public static boolean hasJavad(String str) {
		
		boolean flag = false;
		
		if (str.length() < 4) {
			flag = false;
			
		} else if (str.substring(0, 4).equalsIgnoreCase("java")) {
			flag = true;
			
		} else if (str.length() < 5) {
			flag = false;
			
		} else if (str.substring(1, 5).equalsIgnoreCase("java")) {
			flag = true;
		} 
					
		return flag;
		
}

}
