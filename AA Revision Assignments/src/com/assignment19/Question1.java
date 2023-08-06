//Design a method for counting the alphabet, vowels and numbers from String.
//Input should be from user into main method and pass that to methods. And result will print into main method 

package com.assignment19;

public class Question1 {
	public void getCount() {
		String s = "I am developer 26604";
		System.out.println(s);
		int alpha = 0;
		int vowel = 0;
		int number = 0;
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				alpha++;
			}
			if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
				vowel++;
			}else if (ch >= '0' && ch <= '9') {
				number++;
			}
		}
		System.out.println("Total alphabets: "+ alpha);
		System.out.println("Total vowels: "+ vowel);
		System.out.println("Total numbers: "+ number);
	}

	public static void main(String[] args) {
		Question1 question1 = new Question1();
		question1.getCount();
	}
}
