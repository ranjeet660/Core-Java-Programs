package com.array;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int arr[] = { 10, 40, 20, 10, 70, 40, 50, 20, 10 };

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			boolean flag = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) { // 10 == 10
					flag = true;
				}
			}
			if (flag ==  true) {
				for (int k = 0; k < arr.length; k++) {
					if (arr[i] == arr[k]) {
						count++;
					}					
				}
				System.out.println(arr[i] + " repeated " + count + " time");
			}
		}
	}
}
