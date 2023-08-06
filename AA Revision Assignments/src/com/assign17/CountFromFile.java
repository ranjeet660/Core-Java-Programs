package com.assign17;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class CountFromFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = null;
		Scanner scanner = null;
		int vowelCount = 0;
		int numCount = 0;
		try {
			fileInputStream = new FileInputStream("C:\\Users\\Ranjeet Maskar\\Desktop\\abc.txt");
			scanner = new Scanner(fileInputStream);
			while(scanner.hasNextLine()) {
				String str = scanner.nextLine();
				System.out.println(str);
				for(int i = 0 ; i < str.length(); i++) {
					char ch = str.charAt(i);
					if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
						vowelCount++;
					}else if(ch >= '0' && ch <= '9') {
						numCount++;
					}
				}
				
			}
			System.out.println("\nTotal vowels is: "+ vowelCount);
			System.out.println("Total number are: "+ numCount);
		}catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			fileInputStream.close();
			scanner.close();
		}
	}
}
