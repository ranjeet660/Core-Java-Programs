package com.interview.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class IntegerValuesInArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(50);
		arrayList.add(30);
		//System.out.println(arrayList);
//		for(int i : arrayList) {
//			System.out.println(i);
//		}
		Iterator<Integer> itr =  arrayList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
