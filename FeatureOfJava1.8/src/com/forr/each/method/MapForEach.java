package com.forr.each.method;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapForEach {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(2, "Ranjeet");
		map.put(5, "Jeet");
		map.put(10, "Ram");
		
		Set<Integer> set =map.keySet();
//		for(Integer i : set) {
//			System.out.println(i);
//			System.out.println(map.get(i));
//		}
		
		map.forEach((k,v)->System.out.println("Keys "+ k +" Values "+v));
	}
}
