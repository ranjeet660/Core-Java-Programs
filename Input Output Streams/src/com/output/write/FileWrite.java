package com.output.write;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("C:\\Users\\Ranjeet Maskar\\Desktop\\WriteFile.txt");
			
			fileWriter.write("I am developer. I have HP laptop");
			
		}catch(Exception e) {
			e.getMessage();
		}
		finally {
			fileWriter.close();
			
		}
	}
}
