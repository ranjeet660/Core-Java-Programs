package com.array;

import java.util.Arrays;

import java.util.OptionalInt;

public class MissingArray {

	public static void main(String[] args) {
		int arr[] = {1,2,4,6,7,9,10};// 3,5,8;
		OptionalInt x =  Arrays.stream(arr).max();
		int z = x.getAsInt();
		int a = arr.length;
		for(int i = 1 ; i <= z; i++) {		//O(n2)
			int count=0;
			for(int j = 0; j <a; j++) {
				if(i == arr[j]) {
					count++;
				}
			}
			if (count ==0) {
				System.out.println(i);
			}
		}
	}
}

//
