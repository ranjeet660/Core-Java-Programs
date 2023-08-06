//Write a Java Program for counting the vowels and numbers from file( abc.txt) .

package com.assignment17;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class CountVowelNumber {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = null;
		Scanner scanner = null ;
		int count=0;
		int cnt = 0;
		try {
			fileInputStream = new FileInputStream("C:\\Users\\Ranjeet Maskar\\Desktop\\abc.txt");
			scanner = new Scanner(fileInputStream);
			while(scanner.hasNextLine()) {
				String data = scanner.nextLine();
				System.out.println(data);
				for(int i = 0; i < data.length(); i++) {
					char ch = data.charAt(i);
					if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E'|| ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
						count++;
					}else if (ch == '0' || ch == '1' || ch == '2' || ch == '3'|| ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9') {
						cnt++;
					}
				}
				
			}
			System.out.println("\nVowels "+ count);
			System.out.println("Numbers "+ cnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			fileInputStream.close();
			scanner.close();
		}
	}
}
