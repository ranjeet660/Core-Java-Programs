package com.strings.programs;

public class CountSpaces {

	public static void main(String[] args) {
		String para = "Hey, I am java developer, I have done java developement class from velocity";
		int count = 0;
		for( int i = 0 ; i < para.length(); i++) {
			char ch = para.charAt(i);		
			if( ch == ' ') {
				count++;
			}
		}
		System.out.println("Total spaces in para: "+ count);	
	}	
}
