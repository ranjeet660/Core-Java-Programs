//Exception handling is abnormal condition that occurs during executing program to stop the entire flow of application

package com.exception.handling;

public class Test {

	public static void main(String[] args) {
		 System.out.println("First line");
		 System.out.println("Second");
		 try {
			 int c = 18/0;
		 }catch (Exception e) {
			System.out.println(e);
		}
		 System.out.println("Third");
	}
}
