
package com.arraylist.programming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class DuplicateArrayList {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(20);
		arrayList.add(15);
		arrayList.add(30);
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		System.out.println(arrayList);
		TreeSet<Integer> hashSet = new TreeSet<Integer>(arrayList);
		for(Integer hs : hashSet) {
			System.out.println(hs);
		}
	}
}
