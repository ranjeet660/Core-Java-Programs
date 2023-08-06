package com.assignment_20;

import java.util.ArrayList;

public class AddCity {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Kolhapur");
		arrayList.add("Kolhapur");
		arrayList.add("Kolhapur");
		arrayList.add("Kolhapur");
		
		System.out.println(arrayList);
		
		for(String str : arrayList) {
			System.out.println("City" + str);
		}
	}
}
