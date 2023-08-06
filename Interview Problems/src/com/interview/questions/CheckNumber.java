package com.interview.questions;

import java.util.HashSet;

public class CheckNumber{
	public static void main(String[] args){
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(4);
		hashSet.add(5);

		if(hashSet.contains(4)){
			System.out.println("Number is present");
		}else{
			System.out.println("Number is not present");
		}
	}
}
