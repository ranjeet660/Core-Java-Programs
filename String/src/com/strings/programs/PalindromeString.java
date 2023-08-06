package com.strings.programs;


	public class PalindromeString {

		 public static void main(String args[]) {
		      String myString = "ujju";

		      StringBuffer stringbuffer = new StringBuffer(myString);
		      stringbuffer.reverse();
		      String datavlue = stringbuffer.toString();

		      if(myString.equals(datavlue)){

		         System.out.println(" String is palindrome");

		      } else {

		         System.out.println("String is not palindrome");
		      }
		 }
	}
