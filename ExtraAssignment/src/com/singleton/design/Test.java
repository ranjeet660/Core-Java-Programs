package com.singleton.design;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {
		 SingletonTest s = SingletonTest.check();
		 try {
			FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Ranjeet Maskar\\Desktop\\Demo.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(s);
			
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Ranjeet Maskar\\Desktop\\Demo.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			SingletonTest s1 = (SingletonTest) objectInputStream.readObject();
			
			System.out.println(s.hashCode());
			System.out.println(s1.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
