package com.practice.assignment8;

public class Student {

	private String firstName;
	private String lastName;
	private String city;
	private long mob;
	private String country;
	
	//Getter method
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getCity() {
		return city;
	}
	public long getMobileNum() {
		return mob;
	}
	public String getCountry() {
		return country;
	}
	
	//Setter method
	public void setFirstName(String fn) {
		firstName = fn;
	}
	public void setLastName(String ln) {
		lastName = ln;
	}
	public void setCity(String c) {
		city = c;
	}
	public void setMobileNum(long mb) {
		mob = mb;
	}
	public void setCountry(String cty) {
		country = cty;
	}
}
