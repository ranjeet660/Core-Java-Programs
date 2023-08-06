package com.serializable.employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class InputSerializable {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		
		try {
			fileInputStream = new FileInputStream("C:\\Users\\Ranjeet Maskar\\Desktop\\WriteFile.txt");
			
			objectInputStream = new ObjectInputStream(fileInputStream);
			
			Object obj = objectInputStream.readObject();
			
			Employee employee = (Employee) obj;
			
			System.out.println("First name>> "+ employee.getFirstName());
			System.out.println("Last name>> "+employee.getLastName());
			System.out.println("city>> "+employee.getCity());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			fileInputStream.close();
			objectInputStream.close();
		}
	}
}
