//Write a Java Program for counting the vowels and numbers from file( abc.txt) .

package com.assignment_17;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class CountVowelDigit {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fileInputStream = null;
		Scanner scanner = null;
		int vowelCount = 0;
		int noCount = 0;
		try {
			fileInputStream = new FileInputStream("C:\\Users\\Ranjeet Maskar\\Desktop\\abc.txt");
			scanner = new Scanner(fileInputStream);
			while(scanner.hasNextLine()) {
				
				String s = scanner.nextLine();
				System.out.println(s);
				for(int i = 0;i < s.length(); i++) {
					char ch = s.charAt(i);
					if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
						vowelCount++;
					}else if(ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9') {
						noCount++;
					}
				}
			}
			System.out.println("\nTotal Vowel: "+ vowelCount);
			System.out.println("Total number: "+ noCount);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			fileInputStream.close();
			scanner.close();
		}
	}
}
