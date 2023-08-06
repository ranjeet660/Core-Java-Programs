package com.eighteen;

public class DuplicateWord {

	public static void main(String[] args) {
		String str = "Hi, I am ranjeet ranjeet belong to kolhapur I kolhapur belong to maharashtra";
		
		//convert string to string array
		String s1[] = str.split(" ");
		for(int i = 0; i < s1.length;i++) {
			for(int j = i + 1; j < s1.length; j++) {
				if(s1[i].equals(s1[j])) {
					System.out.println(s1[j]);
				}
			}
		}
		
	}
}
