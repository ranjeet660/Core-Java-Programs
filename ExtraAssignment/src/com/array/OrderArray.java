package com.array;

import java.util.Arrays;

public class OrderArray {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 0, 0, 1, 1, 0 };

		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		Arrays.stream(arr).forEach(a-> System.out.println(a));
	}
}
