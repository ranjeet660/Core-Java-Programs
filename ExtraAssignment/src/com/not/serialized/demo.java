package com.not.serialized;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class demo {

	public static void main(String[] args) throws Exception {
		
		Test2 test2 = new Test2(10, 30);
		System.out.println("i "+ test2.i);
		System.out.println("j "+ test2.b);
		
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Ranjeet Maskar\\Desktop\\xyz.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(test2);
		
		fileOutputStream.close();
		objectOutputStream.close();
		System.out.println("Serialization done");
		
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Ranjeet Maskar\\Desktop\\xyz.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Test2 test22 = (Test2) objectInputStream.readObject();
		
		fileInputStream.close();
		objectInputStream.close();
		System.out.println("De serialization done");
		System.out.println("i "+ test2.i);
		System.out.println("j "+ test2.b);
	}
}
