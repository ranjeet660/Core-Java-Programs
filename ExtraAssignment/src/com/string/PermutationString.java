package com.string;
// ABC, ACB
public class PermutationString {
	
	private static void getPermutation(String str, String ans) {
		for(int i = 0 ; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			String s = str.substring(0, i) + str.substring(i + 1);
			
			getPermutation(s, ans + ch);
		}
		
		if(str.length() == 0) {
			System.out.println(ans + " ");
		}
		
	}
	public static void main(String[] args) {
		String str = "ABC";
		getPermutation(str, " ");
	}

	
}
