//Serialization is process of storing and writing state of object into file as called serialization
// It is process of reading state of object from file is called deSerialization.
// we can implement serialization by using Input and Output stream in java

package com.serializable.employee;

import java.io.Serializable;

public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		private String firstName;
		private String lastName;
		private String city;
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		
		
}
