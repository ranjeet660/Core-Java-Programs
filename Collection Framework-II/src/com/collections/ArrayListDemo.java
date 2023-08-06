package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(20);
		arrayList.add(35);
		arrayList.add(15);
		arrayList.add(5);
		arrayList.add(99);
		arrayList.add(26);
		
		Collections.sort(arrayList);
		for(Integer i : arrayList) {
			System.out.println(i);
		}
	}
}
