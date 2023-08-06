
package com.arraylist;

import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		//		insertion order are preserved
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(50);
		arrayList.add(60);
		arrayList.add(70);
		arrayList.add(20);  // Duplicate elements are allowed
		arrayList.add("Kolhapur");  //Heterogeneous elements are allowed
		arrayList.add(null);  //null insertion are allowed
		System.out.println(arrayList);
	}
}
