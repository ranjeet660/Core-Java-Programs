package com.arraylist.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {
		List list = new ArrayList(Arrays.asList(3,4,5,1,2,6));
		System.out.println(list);
		ArrayList arrayList = new ArrayList();
		int len = list.size();
		for(int i = len-1 ; i >= 0; i--) {
			arrayList.add(list.get(i));
		}
		System.out.println(arrayList);
	}
}
