package com.set.hashset.programming;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		//Insertion order is not preserved
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(30);
		hashSet.add(45);
		hashSet.add(15);
		hashSet.add(30);		//Duplicates are not allowed
		System.out.println(hashSet);
	
		for(Integer i : hashSet) {
			System.out.println(i);
		}
		Iterator<Integer> itr = hashSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
