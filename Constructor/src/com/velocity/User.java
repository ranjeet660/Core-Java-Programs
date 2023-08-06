//constructor can be overloaded because we can write same constructor name with different arguments
// constructor can not be overridden because we cant write same name with same argument
package com.velocity;
public class User {

	//Global variables
	int id;
	String name;
	String city;
	
	public User(int useId, String userName, String userCity) {  //1st constructor
		id = useId;
		name = userName;
		city = userCity;
		System.out.println(id);
		System.out.println(name);
		System.out.println(city);
	}
	
	public User(String userName, String userCity, int userId) {  //2nd constructor
		id = userId;
		name = userName;
		city = userCity;
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(city);
	}
	public static void main(String[] args) {
		User user = new User(12, "Ranjeet", "Kolhapur");
		User user1 = new User("Shashi", "Hydrabad", 7);
	}
	
}


