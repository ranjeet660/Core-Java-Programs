//Design java method for String getReverseString(String reverse)& take the input from user into main method 
//pass to that method. Result will print into main method
//Output Enter string- pune Output enup

package com.assignment19;

public class Question2 {

	public String getReverseString(String reverse) {
		String rev = "";
		for(int i=reverse.length()-1; i >= 0 ; i--) {
			rev = rev + reverse.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		Question2 question2 = new Question2();
		String rev = question2.getReverseString("pune");
		System.out.println("Reverse string is: "+ rev);
	}
}
