package com.twenty.one;

import java.io.FileInputStream;
import java.util.Scanner;

public class DuplicateWord {

	public static void main(String[] args) {
		FileInputStream fileInputStream = null;
		Scanner scanner = null;
		int c=0;
		try {
			fileInputStream = new FileInputStream("C:\\Users\\Ranjeet Maskar\\Desktop\\string.txt");
			scanner = new Scanner(fileInputStream);
			while(scanner.hasNext()) {
				System.out.println(scanner.next());
				c++;
			}
			System.out.println("Total numbers of words: "+c);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
