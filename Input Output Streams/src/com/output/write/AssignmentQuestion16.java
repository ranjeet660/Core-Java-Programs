package com.output.write;

import java.io.FileWriter;
import java.io.IOException;

public class AssignmentQuestion16 {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("D:\\Java Developer Notes Velocity\\Assignment Question\\Assignment-17.txt");
			fileWriter.write("Assignments 17\r\n" + 
					"1. Write a Java Program for counting the vowels and numbers from file( abc.txt) .");
		}catch(Exception e) {
			e.getMessage();
		}
		finally {
			fileWriter.close();
		}
	}
}
