package com.interview.questions;

import java.util.Arrays;

public class Sorting {
public static void main(String[] args) {
	int arr[] = {11,9,4,5,2,9,3,10};
	int len = arr.length;
//	for(int i = 0; i < len; i++) {
//		int temp = 0;
//		for(int j = i + 1; j < len; j++) {
//			if(arr[i]>arr[j]) {
//				temp = arr[i];
//				arr[i] = arr[j];
//				arr[j] = temp;
//			}
//		}
//	}
	Arrays.sort(arr);
	Arrays.stream(arr).distinct().forEach(x->System.out.println(x));
//	for(int k =0; k < len ; k++) {
//		System.out.println( arr[k]);
//	}
}

}
