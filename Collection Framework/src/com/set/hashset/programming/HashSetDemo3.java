package com.set.hashset.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(Arrays.asList("Ranjeet","Jayant","Jeet","Ranjeet","Sourabh","Jayant"));
		System.out.println("Original: "+ list);
		
		Set<String> set1 = new LinkedHashSet<String>(list);
		System.out.println("Remove Duplicate & Insrtion preserved: "+ set1);
		
		Set<String> set = new HashSet<String>(list);
		System.out.println("Remove Duplicate: "+ set);
		
		Set<String> set2 = new TreeSet<String>(list);
		System.out.println("Sorting: "+set2);
	}
}
