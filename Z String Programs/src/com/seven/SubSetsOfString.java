package com.seven;

import java.util.Scanner;

public class SubSetsOfString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter strings: ");
		
		String str = "mask";//m,ma,mas,mask,a,as,ask,s,sk,k
//		String str = scanner.nextLine();   				
		int temp=0;
		for(int i = 0; i < str.length(); i++) {			
			for(int j = i+1; j <= str.length(); j++) {
				String s=str.substring(i, j);			
				temp++;
				System.out.print(s+",");
			}
		}
		System.out.println("\nTotal count "+ temp);
	}
}
