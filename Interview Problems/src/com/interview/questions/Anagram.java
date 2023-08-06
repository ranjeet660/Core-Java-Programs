package com.interview.questions;


import java.util.Arrays;
public class Anagram{
	public static void main(String[] args){
		String s3 = "Race";
		String s4 = "care";

		String s1= s3.toLowerCase();
		String s2 = s4.toLowerCase();
		
		//Check the length are equals or Not
		if(s1.length() == s1.length()){
			//Convert String to Char
			char[] charArr = s1.toCharArray();
			char[] charArr1 = s2.toCharArray();

			//Sort tha data
			Arrays.sort(charArr);
			
			Arrays.sort(charArr1);
			//Check the string equals or not 
			boolean result = Arrays.equals(charArr, charArr1);
			if(result){
				System.out.println("Anagram");
			}else{
				System.out.println("Not Anagram");
			}
		}else{
			System.out.println("String is not anagram");
		}
	}
}