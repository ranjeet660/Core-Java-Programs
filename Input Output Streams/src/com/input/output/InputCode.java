package com.input.output;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class InputCode {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream("C:\\Users\\Ranjeet Maskar\\Desktop\\prime.txt");
			
			Scanner scanner = new Scanner(fileInputStream);
			
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			
		}catch (Exception e) {
			e.getMessage();
		}
		finally {
			fileInputStream.close();
		}
	}
}
