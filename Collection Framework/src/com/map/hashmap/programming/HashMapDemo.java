package com.map.hashmap.programming;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(31, "Ranjeet");
		hashMap.put(23, "Jeet");
		hashMap.put(34, "Abhijit");
		hashMap.put(null, null);
		System.out.println(hashMap);
		
		//by using for each method
		hashMap.forEach((k,v) -> System.out.println("Keys: "+ k + " Values: "+v));
		
		Set<Integer> set = hashMap.keySet();  // This is mandatory
		//by using iterator 
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			Integer i = itr.next();
			System.out.println("Keys: "+i);
			System.out.println("Values: "+ hashMap.get(i));
		}
	}
}
