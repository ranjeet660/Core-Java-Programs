package com.twenty.seven;

public class ReverseWord {

	public static void main(String[] args) {
		String str = "Ranjeet Shivaji Maskar";
		String arr[] = str.split(" ");
		for(int i = arr.length-1; i >=0; i--) {
			String s = arr[i].toString();
			System.out.print(s+" ");
		}
		
	}
}
