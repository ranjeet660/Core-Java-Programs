package com.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;


public class OutputSerialize {

	public static void main(String[] args) throws Exception {
		Test test = new Test();
		test.setFirstName("Ranjeet");
		test.setLastName("Maskar");
		test.setCity("Kolhapur");
		test.setMobileNumber("9158152660");
			
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Ranjeet Maskar\\Desktop\\xyz.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(test);

			System.out.println("Data written successful");
		
			fileOutputStream.close();
			objectOutputStream.close();
		
	}
}
