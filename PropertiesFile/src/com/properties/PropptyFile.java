package com.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropptyFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fileInputStream = null;
		Properties properties = null;
		try {
			fileInputStream = new FileInputStream("C:\\Users\\Ranjeet Maskar\\Desktop\\PropertiesDemo.properties");
			properties = new Properties();
			properties.load(fileInputStream);
			String uName = properties.getProperty("username");
			System.out.println(uName);
			String pass = properties.getProperty("password");
			System.out.println(pass);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			fileInputStream.close();
			
		}
	}
}
