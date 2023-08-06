package com.set.linkedhashset.programming;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHastSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet linkedHashSet = new LinkedHashSet();
		linkedHashSet.add("Ram");
		linkedHashSet.add("Jeet");
		linkedHashSet.add(10);
		linkedHashSet.add(20);
		linkedHashSet.add("Jeet");  // duplicate not allow but it wont be get compile error
		System.out.println(linkedHashSet);
		
		for(Object o : linkedHashSet) {
			System.out.println(o);
		}
		
		Iterator itr = linkedHashSet.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println("");
		linkedHashSet.forEach(r -> System.out.print( r+","));
	}
}
