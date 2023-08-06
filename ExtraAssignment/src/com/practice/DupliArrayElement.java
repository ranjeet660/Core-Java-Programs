package com.practice;

public class DupliArrayElement {

	public static void main(String[] args) {
		int[] a = {1,2,4,5,7,6,8,5,4,3,1,7};
		
		for(int i = 0; i < a.length; i++) {
			int temp = 0;
			for(int j = i+1; j < a.length; j++) {
				if(a[i] == a[j]) {
					temp++;
					//System.out.println("Duplicate: "+ a[j]);
				}
			}
			if(temp == 0) {
				
				System.out.println(a[i]);
			}	
		}

	}
}
