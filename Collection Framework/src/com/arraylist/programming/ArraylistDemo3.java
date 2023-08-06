package com.arraylist.programming;

import java.util.ArrayList;
//import java.util.Iterator;

public class ArraylistDemo3 {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		arrayList.add(29);
		arrayList.add(50);
		arrayList.add("Kolhapur");
		arrayList.add("Pune");
		
		
		System.out.println("Original array: " +arrayList);
		System.out.println(arrayList.contains(30));
		System.out.println(arrayList.contains(50));
		System.out.println(arrayList.get(3));
		System.out.println(arrayList.remove("Pune"));
		System.out.println("After removing "+arrayList);
		
		ArrayList arrayList2 = new ArrayList();
		arrayList2.add("Ranjeet");
		arrayList2.add(2660);
		
		arrayList.addAll(arrayList2);
		
		for(int i = 0; i < arrayList.size();i++) {
			System.out.println(arrayList.get(i));
			
			//System.out.println(arrayList);
		}
//		Iterator<Comparable> itr = arrayList.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	}
}
