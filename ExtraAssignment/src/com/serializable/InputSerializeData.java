package com.serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class InputSerializeData {
	
	public static void main(String[] args) throws ClassNotFoundException, IOException  {
		
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		
		
			fileInputStream = new FileInputStream("C:\\Users\\Ranjeet Maskar\\Desktop\\xyz.txt");
			objectInputStream = new ObjectInputStream(fileInputStream);
			Student student = (Student) objectInputStream.readObject();
			
			System.out.println("First name is: "+ student.getFirstName());
			System.out.println("Last name is: "+student.getLastName());
			System.out.println("City name is: "+ student.getCity());
			System.out.println("Mobile number is : "+ student.getMobileNumber());
		
			fileInputStream.close();
			objectInputStream.close();
		
	}
}
