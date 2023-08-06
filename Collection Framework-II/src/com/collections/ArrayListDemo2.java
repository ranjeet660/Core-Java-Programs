package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Ranjeet");
		arrayList.add("Jeet");
		arrayList.add("Ram");
		arrayList.add("Ajaya");
		arrayList.add("Babalya");
		arrayList.add("Karan");
		
		Collections.sort(arrayList);
		for(String i : arrayList) {
			System.out.println(i);
		}
	}
}
