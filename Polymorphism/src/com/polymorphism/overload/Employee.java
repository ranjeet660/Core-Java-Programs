//Suppose we got bussiness requirement from client to add employee

package com.polymorphism.overload;

public class Employee {

	void addEmployee(String firstName, String lastName, String city) {  //add new employee
		System.out.println(firstName +" "+ lastName +" Belongs to " + city);
	}
	//after that we got new requirement from client in current year i.e. add PAN card no., 
	// so we have two options -
	// 1) modifying/changes into existing method
	// 2) Create new method and add new parameter 
	
	void addEmployee(String firstName, String lastName, String city, String pan) {
		System.out.println(firstName +" "+ lastName +" Belongs to " + city +" & PAN no is: "+pan);
	}
}
