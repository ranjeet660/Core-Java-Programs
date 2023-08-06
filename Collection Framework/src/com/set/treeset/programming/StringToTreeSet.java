package com.set.treeset.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import java.util.List;
import java.util.Set;

public class StringToTreeSet {

	public static void main(String[] args) {
		System.out.println("--------Original String--------");
		String str = "Ranjeet Shivaji Maskar Ranjeet";			//Given string
		System.out.println(str);
		System.out.println("--------Convert String to Arrays--------");
		String strArray[] = str.split(" ");
		//char[] charStr = str.toCharArray();		//Convert String to Arrays
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]+",");
		}
		System.out.println("-------Convert String Arrays to ArrayList---------");
		
		List<String> arrayList = Arrays.asList(strArray) ;			//2nd way to Convert Arrays to ArrayList
		//List arrayList = new ArrayList(Arrays.asList(strArray));  //1st way to Convert Arrays to ArrayList
		
//		List<String> arrayList = new ArrayList<String>();
//		Collections.addAll(arrayList, strArray);					//3rd way to Convert Arrays to ArrayList
		
		for(String ch : arrayList) {
			System.out.println("ArrayList:-"+ch);
			//System.out.println(ch);
		}
		System.out.println("-------convert arraylist to hashSet---------");
		// convert arraylist to hashSet
		Set<String> set = new HashSet<String>(arrayList);
		for(String ch1:set) {
			System.out.println("set:- "+ch1);
			//System.out.println(ch1);
		}
	}
}
