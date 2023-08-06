package com.arraylist.programming;

import java.util.ArrayList;
//import java.util.Iterator;
public class ArrayListStringInteger {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(10);
		arrayList.add("Ranjeet");
		arrayList.add(30);
		arrayList.add("Maskar");
		
		System.out.println(arrayList); //direct object print
		
		//by using for each loop
		for(Object i : arrayList) {
			System.out.println(i);
		}
		
		//by using iterator
//		Iterator itr = arrayList.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	}
}
