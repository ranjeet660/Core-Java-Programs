package com.practice;

import java.util.Arrays;

public class CompareArrays {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,6};
		int[] b = {1,2,3,4,5};
		if(a.length == b.length) {
			Arrays.sort(a);
			Arrays.sort(b);
			boolean result = Arrays.equals(a, b);
			if(result) {
				System.out.println("Arrays are same");
			}else {
				System.out.println("Array are not same");
			}
		}else {
			System.out.println("Arrays are different");
		}
	}
}
