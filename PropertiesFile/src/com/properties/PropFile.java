package com.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = null;
		Properties properties = null;
		
		try {
			fileInputStream = new FileInputStream("C:\\Users\\Ranjeet Maskar\\Desktop\\PropertiesDemo.properties");
			properties = new Properties();
			properties.load(fileInputStream);
			String usrname = properties.getProperty("username");
			String passw = properties.getProperty("password");
			System.out.println(usrname);
			System.out.println(passw);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			fileInputStream.close();
		}
		
	}
}
