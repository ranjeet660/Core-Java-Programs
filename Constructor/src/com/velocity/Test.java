// Parameterized constructor is with arguments is called 

package com.velocity;

public class Test {

	int id;
	String name;
	String city;
	
	public Test(int userId, String userName, String userCity) {
		id = userId;
		name = userName;
		city = userCity;
		System.out.println(userId);
		System.out.println(userName);
		System.out.println(userCity);
	}
	
	public static void main(String[] args) {
		Test test = new Test(7, "Ranjeet", "Kolhapur");
	}
}
