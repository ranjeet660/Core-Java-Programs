//Write a program to check given string is anagram or not.

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	void getAnagram(String str, String str1) {
//		String str = "Race";
//		String str1 = "care";
		
		String s1 = str.toLowerCase();
		String s2 = str1.toLowerCase();
		
		if(s1.length() == s2.length()) {
			//Convert String to Char Array
			char[] charArr = s1.toCharArray();
			char[] charArr1 = s2.toCharArray();
			
			//sort the string
			Arrays.sort(charArr);
			Arrays.sort(charArr1);
			
			boolean result = Arrays.equals(charArr, charArr1);
			if( result) {
				System.out.println("String is Anagram");
			}else {
				System.out.println("String is not angram");
			}
			
		}else {
			System.out.println("Given string is not Anagram");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first String: ");
		String str = scanner.next();
		System.out.println("Enter second String: ");
		String str1 = scanner.next();
		Anagram anagram = new Anagram();
		anagram.getAnagram(str, str1);
	}
}
