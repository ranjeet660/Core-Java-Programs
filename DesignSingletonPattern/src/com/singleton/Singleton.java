package com.singleton;

import java.io.Serializable;

// Define class which has only one objects provides global points of access

//Why : 
//		Suppose have one bussiness requriment in which wants only one objects has created 
public class Singleton implements Cloneable,Serializable{

	//Step1 : Create class in which design static member
	private static Singleton singletonObject;
	
	// Step 2 : Make class constructor as private
	private Singleton() {
		
	}
	
	//Step 3 : Design method in which check whether object is null or not
	// Most prefeble for use is synchronized block instead of synchronized method 
	public static synchronized Singleton getSingleton() {
		if(singletonObject == null) {
		singletonObject = new Singleton();
		}else {
			return singletonObject;
		}
		return singletonObject;
	}
	
	
	//This below method used with serialization only
//	protected Object readResolve() {
//		return singletonObject;
//	}
	
	
	//Step 4 : overide Object clone() method and hence we can achive singletonDesign Pattern
	protected Object clone() throws CloneNotSupportedException{
		return singletonObject;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Singleton obj1 = Singleton.getSingleton();
		Singleton obj2 = (Singleton) obj1.clone();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}
