package assignments.assignment10;

import java.util.Scanner;

public class A10_Q17_AfphabeticOrder {

	public static void main(String[] args) {
		// Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please provide your starting char for the range: ");
		String start = sc.next();
		char startChar = start.charAt(0);
		
		System.out.println("Please provide your starting char for the range: ");
		String finish = sc.next();
		char finalChar = finish.charAt(0);
		sc.close();
		
		 
		for (char i = startChar; i <= finalChar; i++) {
			System.out.print(i);
		}
		
	}

}
