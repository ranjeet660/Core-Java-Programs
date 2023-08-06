package com.string;

public class RemovingDuplicateLetter {

	public static String removeDuplicate(String str) {     
		System.out.println("Original string : "+ str);	
		//print original string         "R a a n j e e t"
		String str1=" ";     								//Take empty string
		char[] s1 = str.toCharArray();						// convert original to char array
		for(int i = 0 ; i < s1.length; i++) {			//for loop use for calculate length of array
			int t= 0;						
			for(int j = i + 1; j< s1.length; j++) {
				if(s1[i] == s1[j] && s1[i]!=' ') {						//condition check 1st letter = 2nd letter
					t++;									// if letter same then temp = temp + 1
					//System.out.println("Duplicate letter: "+ s1[j]);	// duplicate value show
				}
			}
			if(t == 0) {									
				str1 = str1 + s1[i];	//R 					// adding single letter into str1
			}
		}
		
		return str1;										// return str1 to method
		
	}
	public static void main(String[] args) {
													//pass the String to method and calling methods
		String duplicate = RemovingDuplicateLetter.removeDuplicate("Raanjeaett");   
		System.out.println("After removing duplicate: "+ duplicate);  //Show after  removing 
	}
}
