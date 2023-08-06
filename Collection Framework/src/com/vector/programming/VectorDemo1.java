package com.vector.programming;

import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		Vector vector = new Vector();
		vector.add(20);
		vector.addElement(50);
		vector.add("Ranjeet");
		vector.add(3, 25);
		vector.add("Ranjeet");
		
		System.out.println(vector);
//		while(vector.contains("Ranjeet")) {
//			vector.remove("Ranjeet");
//		}
		for(int i = 0; i < vector.size(); i++) {
			if(vector.contains("Ranjeet")) {
				vector.remove("Ranjeet");
			}
		}
		System.out.println(vector);
		
		System.out.println(vector.firstElement());
	}
}
