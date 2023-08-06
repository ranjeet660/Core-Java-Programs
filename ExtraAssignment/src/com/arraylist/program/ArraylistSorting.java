package com.arraylist.program;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSorting {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
			arrayList.add(60);
			arrayList.add(90);
			arrayList.add(30);
			arrayList.add(40);
			arrayList.add(50);
			Collections.sort(arrayList);
			System.out.println("Ascending " +arrayList);
			Collections.sort(arrayList, Collections.reverseOrder());
			System.out.println("Descending "+arrayList);
			
//			int len = arrayList.size();
//			for(int i = 0; i<len; i++) {
//				int temp = 0;
//				for(int j = i + 1; j < len; j++) {
//					
//					if(arrayList.get(i) > arrayList.get(j)) {
//						int a = arrayList.get(i);
//						int b = arrayList.get(j);
//						temp = a;
//						a = b;
//						b = temp;
//					}
//				}
//			}
//			for(int k = 0; k < len; k++) {
//				System.out.println(arrayList.get(k));
//				
//			}
	}
}
