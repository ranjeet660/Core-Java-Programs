package com.string;

public class Paragraph {

	public static void main(String[] args) {
		String str = "A paragraph is a series of sentences that are organized and coherent, and are all related "
				+ "to a single topic. Almost every piece of writing you do that is longer than a few sentences"
				+ " should be organized into paragraphs.";
		
		str= str.replace(".", "");
		str = str.replace(",", "");
		//System.out.println(str);
		//Convert into String array
		String arr[] = str.split(" ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].length() % 2 == 0 ) {
				System.out.println(arr[i]);
			}
		}
	}
}
