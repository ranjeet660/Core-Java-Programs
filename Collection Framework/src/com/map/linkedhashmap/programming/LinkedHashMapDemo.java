package com.map.linkedhashmap.programming;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<String,String>();
		linkedHashMap.put("One", "Sourabh");
		linkedHashMap.put("Two", "Ranjeet");
		System.out.println(linkedHashMap);
		System.out.println(linkedHashMap.containsValue("Ranjeet"));
		System.out.println(linkedHashMap.replace("One", "Uday"));
		System.out.println(linkedHashMap);
		linkedHashMap.remove("Two");
		System.out.println(linkedHashMap);
	}
}
