package com.arraylist.programming;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Mumbai");
		arrayList.add("Pune");
		arrayList.add("Kolhapur");
		arrayList.add("Delhi");
		
		Collections.sort(arrayList);
		System.out.println(arrayList);
		//Collections.sort(arrayList, Collections.reverseOrder());			//1st way to reverse
		Collections.reverse(arrayList);										// 2nd way to reverse
		System.out.println(arrayList);
	}
}
