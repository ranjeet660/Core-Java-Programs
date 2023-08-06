package com.serializable.employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OutputSerializable {

	public static void main(String[] args) throws IOException {
		Employee employee = new Employee();
		employee.setFirstName("Ranjeet");
		employee.setLastName("Maskar");
		employee.setCity("Kolhapur");
		
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		
		try {
			fileOutputStream = new FileOutputStream("C:\\Users\\Ranjeet Maskar\\Desktop\\WriteFile.txt");
			
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			objectOutputStream.writeObject(employee);
			System.out.println("Successfully..!");
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			fileOutputStream.close();
			objectOutputStream.close();
		}
	}
}
