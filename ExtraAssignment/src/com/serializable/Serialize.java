package com.serializable;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialize {

	public StudentSerialize getSetData() {
														//Data Serialization
		StudentSerialize studentSerialize = new StudentSerialize();   
		studentSerialize.setFirstName("Sushant");
		studentSerialize.setLastName("Patil");
		studentSerialize.setCity("Kolhapur");
		studentSerialize.setMobileNumber("9172184044");
		return studentSerialize;
													// Restrict serialization
//		RestrictSerialization restrictSerialization = new RestrictSerialization();
//		restrictSerialization.setFirstName("Sush");
//		restrictSerialization.setLastName("Patil");
//		restrictSerialization.setCity("KOP");
//		restrictSerialization.setMobileNumber("9172184044");
//		return restrictSerialization;
		
	}
	public static void main(String[] args) throws Exception {
		Serialize serialize = new Serialize();
		StudentSerialize s1 = serialize.getSetData();
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Ranjeet Maskar\\Desktop\\Test.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(s1);
		System.out.println("Data written successfull");
	}
}
