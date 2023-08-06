package com.array;

public class ContinousSubArraySum {

	public static void main(String... args) {
		
		int [] a= {-1, -2, 3, -4, 5, 6, -7, 8};
		
		for( int i = 0; i < a.length; i++) {
			int x1 =0;
			for(int j = i + 1 ; j <i; j++) {
				int first = a[0];
				int max=0;
				x1 = a[i] + a[j];  //-1 + (3)
				if(x1 > first) {
					max = j;
					first = a[max];
				}
			}
		}
	}
}
