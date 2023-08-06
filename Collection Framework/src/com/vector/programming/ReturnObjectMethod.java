package com.vector.programming;

import java.util.Vector;

public class ReturnObjectMethod {

	public Vector<String> getVectorDemo() {
		Vector<String> vector = new Vector<String>();
		vector.add("Ranjeet");
		vector.add("Sourabh");
		vector.add("Shashikant");
		return vector;
	}
	public static void main(String[] args) {
		ReturnObjectMethod returnObjectMethod = new ReturnObjectMethod();
		Vector<String> v = returnObjectMethod.getVectorDemo();
		System.out.println(v);
		System.out.println(v.get(1));
		v.remove(1);
		System.out.println(v);
	}
}
