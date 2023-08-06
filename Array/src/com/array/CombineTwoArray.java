package com.array;

public class CombineTwoArray {

	public static void getCombineArray() {
		int a[] = {1,2,3,4,5};
		int b[] = {6,7,8,9,10};
		int c[] = {21,22,23,24,25};
		int d[] = new int[a.length + b.length+ c.length];
		for(int i = 0; i < a.length; i++) {
			d[i] = a[i]; 
		}
		for(int j = 0; j < b.length; j++) {
			d[a.length + j] = b[j]; 
		}
		for(int x = 0; x < c.length; x++) {
			d[a.length + b.length + x] = c[x];
		}
		for(int k = 0; k < d.length; k++) {
			System.out.print(d[k]+" ");
		}

		
	}
	public static void main(String[] args) {
		
		getCombineArray();
	}
}
