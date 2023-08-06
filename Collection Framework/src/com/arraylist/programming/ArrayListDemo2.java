package com.arraylist.programming;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(10);
		arrayList.add(34);
		arrayList.add(50);
		arrayList.add(9);
		arrayList.add(55);
		
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(4);
		arrayList2.add(90);
		arrayList2.add(90);
		arrayList2.add(9);
		arrayList2.add(30);  //arrayList2.add(index: 0 , value: 30);
		
		arrayList.addAll(arrayList2);   //(index , list2)
		System.out.println(arrayList.contains(91));
		System.out.println(arrayList.indexOf(9));
		System.out.println(arrayList.indexOf(90));
		System.out.println(arrayList.lastIndexOf(90));
		for(int i : arrayList) {
			System.out.print(i + ",");
		}
//		for (int i = 0; i < arrayList.size(); i++) {
//			System.out.print(arrayList.get(i)+ ",");
//		}
	}
}  
