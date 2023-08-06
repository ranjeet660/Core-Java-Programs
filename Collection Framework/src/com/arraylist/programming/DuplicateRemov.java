package com.arraylist.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateRemov {

	public static List<Integer> getRemoveDuplicate(List<Integer> list){
		List<Integer> newList = new ArrayList<Integer>();
		for(Integer element : list) {
			if(!newList.contains(element)) {
				newList.add(element);
			}
		}
		return newList;
		
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arrayList= new ArrayList<Integer>(Arrays.asList(1,2,4,5,2,3,4,8,74,65,1,2));
		List<Integer> l = getRemoveDuplicate(arrayList);
		System.out.println("Original array "+arrayList);
		System.out.println("After removing duplicate "+ l);
		
		//Without use remove method
		Set<Integer> set = new TreeSet<Integer>(arrayList);				//Use TreeSet collection for sorting
		System.out.println("Without use remove method "+ set);
	}
}
