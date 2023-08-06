//Copy data from ArrayList1 to ArrayList2

package com.arraylist.programming;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayDemo {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		
		ArrayList arrayList2 = new ArrayList();
		arrayList2.add(40);
		arrayList2.add(50);
		arrayList2.add("Kolhapur");
		
		arrayList.addAll(arrayList2);
		//1st way to print array List data
			//System.out.println(arrayList);
		// 2nd way to print array list element
			Iterator iterator =  arrayList.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
	}
}
