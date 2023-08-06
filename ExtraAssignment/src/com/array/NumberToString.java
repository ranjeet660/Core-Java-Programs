package com.array;

import java.util.Scanner;

public class NumberToString {

	private static String numberToString(int num) {
		String word = "";
		//create array 0 to 19
		String[] unitarray = {"Zero","One", "Two","Three","Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
		                      "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen"," Seventeen", 
		                      "Eighteen", "Ninteen"};
		//create string array 10 to 90.
		String[] tensarray = {"Zero","Ten ","Twenty","Thirty" ,"Fourty" ,"Fifty" ,"Sixty", "Seventy", "Eighty", "Ninety"};
		
		//if number is less than zero
		if(num < 0) {
			String number = ""+ num;
			 number = number.substring(1);
			
			return "Minus " + numberToString(Integer.parseInt(number));
		}
		if((num/1000000) > 0) {
			word = word + numberToString(num/1000000)+ " Millions ";
			num = num%1000000;
		}
		if((num / 100000)> 0) {
			word = word + numberToString(num/100000)+ " Lakh ";
			num = num % 100000;
		}
		if((num/1000)>0) {
			word = word + numberToString(num/1000)+ " Thousand ";
			num = num % 1000;
		}
		if((num / 100)> 0) {
			word = word + numberToString(num/100)+ " Hundred ";
			num = num %100;
		}
		if(num > 0) {
			if(num < 20) {
				word = word + unitarray[num];
			}else {
				word = word + tensarray[num / 10];
				if((num%10)>0) {
					word = word + "-"+ unitarray[num%10];
				}
			}
		}
		
		return word;		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number ");
		int num = scanner.nextInt();
		NumberToString.numberToString(num);
		if(num == 0) {
			System.out.println("Zero");
		}else {
			System.out.println("Number in word is: "+ numberToString(num));
		}
	}

	
}
