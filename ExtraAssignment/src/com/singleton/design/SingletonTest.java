package com.singleton.design;

import java.io.Serializable;

// design one class which has one object provide global point of access
//if hav one bussiness requirement and wants create only one object of class
public class SingletonTest implements Cloneable,Serializable{

	private static SingletonTest singletonTest;
	
	private SingletonTest() {
		
	}
	
	public static synchronized SingletonTest check() {
		if(singletonTest == null) {
			singletonTest = new SingletonTest();
		}else {
			return singletonTest;
		}
		return singletonTest;
	}
	
	//for serializable
	protected Object readResolve() {
		return singletonTest;

	}
	
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		return singletonTest;
//	}
	public static void main(String[] args) throws CloneNotSupportedException {
		
		SingletonTest s = check();
		SingletonTest  s1 = (SingletonTest) s.clone();
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}
}
