package com.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonSerialization {
// Singleton with serialization in which also still get hashcode different
	// but override Object readResolve() method we can achive singltone design 
	// Object readResolve() This method only used with serialization
	public static void main(String[] args){
		
		try {
			Singleton obj1 = Singleton.getSingleton();
			//write data 
			FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Ranjeet Maskar\\Desktop\\WriteFile.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(obj1);
			
			//Read Data
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Ranjeet Maskar\\Desktop\\WriteFile.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Singleton obj2 =  (Singleton) objectInputStream.readObject();
			
			System.out.println(obj1.hashCode());
			System.out.println(obj2.hashCode());
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
