package com.map.hashmap.programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortingAndReturnObjectToMethod {

	public Map<Integer,String> getHashMapDetails() {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(11, "Jeet");
		map.put(21, "Sourabh");
		map.put(2, "Abhi");
		map.put(7, "Rohan");
		
		return map;
	}
	
	public static void main(String[] args) {
		SortingAndReturnObjectToMethod returnObjectToMethod = new SortingAndReturnObjectToMethod();
		Map<Integer,String> m = returnObjectToMethod.getHashMapDetails();
		System.out.println("Original map list>> "+ m);		//1st way

		Set<Entry<Integer,String>> set = m.entrySet();									//convert map to set
		List<Entry<Integer,String>> list = new ArrayList<Entry<Integer,String>>(set);	//convert set to arraylist
		System.out.println("Arraylist>> "+list);
		
		
		Collections.sort(list, (v1,v2)-> v1.getValue().compareTo(v2.getValue()));
		Map<Integer,String> newList = new LinkedHashMap<Integer, String>();
		for(Entry<Integer,String> l: list ) {
			newList.put(l.getKey(), l.getValue());
		}
		//System.out.println(newList);		//Direct way
		
		//For each loop
		Set<Integer> set1 = newList.keySet();
		for(Integer i : set1) {
			System.out.println("Keys: "+ i);
			System.out.println("Values "+ m.get(i));
		}
	}
}
