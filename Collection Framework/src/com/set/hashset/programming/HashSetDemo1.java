package com.set.hashset.programming;

import java.util.HashSet;

public class HashSetDemo1 {

	public HashSet<String> getHashSet(){
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Ranjeet");
		hashSet.add("Shashi");
		hashSet.add("Jayant");
		return hashSet;
	}
	public static void main(String[] args) {
		HashSetDemo1 hashSetDemo1 = new HashSetDemo1();
		HashSet<String> h = hashSetDemo1.getHashSet();
		System.out.println(h);
	}
}
