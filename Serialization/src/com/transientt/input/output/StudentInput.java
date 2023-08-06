package com.transientt.input.output;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentInput {

	public static void main(String[] args) throws IOException{ 
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		
		try {
			fileInputStream = new FileInputStream("C:\\Users\\Ranjeet Maskar\\Desktop\\Test.txt");
			objectInputStream = new ObjectInputStream(fileInputStream);
			
			Object object = objectInputStream.readObject();
			Student student = (Student) object;
			
			System.out.println("First name >>"+ student.getFirstName());
			System.out.println("last name >>"+ student.getLastName());
			System.out.println("city name >>"+ student.getCity());
			System.out.println("Salary >>"+ student.getSalary());
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			fileInputStream.close();
			objectInputStream.close();
		}
	}
}
