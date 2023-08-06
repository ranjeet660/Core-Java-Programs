package com.output.write;

import java.io.FileWriter;
import java.io.IOException;


public class WriteFile2 {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = null ;
		
		try {
		fileWriter = new FileWriter("C:\\Users\\Ranjeet Maskar\\Desktop\\Write File 1.txt");
		fileWriter.write("Hello, Good night friends, \n I am from kolhapur");
		}catch (Exception e) {
			e.getStackTrace();
		}
		finally {
			fileWriter.close();
		}
	}
}
