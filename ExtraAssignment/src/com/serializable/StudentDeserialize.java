package com.serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class StudentDeserialize {

	public static void main(String[] args) throws Exception {
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Ranjeet Maskar\\Desktop\\Test.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		StudentSerialize std = (StudentSerialize) objectInputStream.readObject();
		System.out.println("Student Data "+ std);
	}
}
