package com.transientt.input.output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentOutput {

	public static void main(String[] args) throws IOException {
		Student student = new Student();
		student.setFirstName("Jeet");
		student.setLastName("Maskar");
		student.setCity("Kolhapur");
		student.setSalary(50000);
		
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		
		System.out.println("File written successfully");
		try {
			fileOutputStream = new FileOutputStream("C:\\Users\\Ranjeet Maskar\\Desktop\\Test.txt");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			objectOutputStream.writeObject(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			fileOutputStream.close();
			objectOutputStream.close();
		}
	}
}
