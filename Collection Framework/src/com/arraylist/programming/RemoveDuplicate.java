package com.arraylist.programming;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {
	//             return type		   method name    pass the argument/parameter
	public static ArrayList<Integer> removeDuplicate (ArrayList<Integer> lists){		
		ArrayList<Integer> newArrayList = new ArrayList<Integer>();  	//Create 2nd empty array list
		for(int i : lists) {   											// get elements into for each loop
			if(!newArrayList.contains(i)) {								// if new list not contain elements
				newArrayList.add(i);									// then added into new list(newlist)
			}
		}		
		return newArrayList;											//return new list to method
		
	}
	public static void main(String[] args) {
								//create new ArraList And Pass the array list to method
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,4,6,4,1,3,8,7,6,1));
		ArrayList<Integer> arr = RemoveDuplicate.removeDuplicate(arrayList);  //Calling methods
		System.out.print("After removing - "+arr);						//print after removing duplicate
		
	}
}
