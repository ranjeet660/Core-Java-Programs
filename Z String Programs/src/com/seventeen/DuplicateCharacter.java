//Java program to find the duplicate characters in a string

package com.seventeen;

public class DuplicateCharacter {

	public static void main(String[] args) {
		String str = "Raaanjeet ";
		char ch[] = str.toCharArray();
		
		for(int i = 0 ; i < ch.length; i++) {
			int temp = 0;
			for(int j = i + 1; j < ch.length; j++) {
				if(ch[i]==ch[j] && ch[i]!=' ') {
					temp++;
					ch[j]='0';
				}
			}
			if(temp > 0 && ch[i]!='0') {
				System.out.println(ch[i]);
			}
		}
	}
}
