package com.input.output;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = null;
		//Scanner scanner = null;
		try {
			 fileInputStream = new FileInputStream("C:\\Users\\Ranjeet Maskar\\Desktop\\Demo.txt ");
			
			Scanner scanner = new Scanner(fileInputStream);
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		}catch(Exception e) {
			e.getStackTrace();
		}finally {
			fileInputStream.close();
			//scanner.close();
		}
		
	}
}
