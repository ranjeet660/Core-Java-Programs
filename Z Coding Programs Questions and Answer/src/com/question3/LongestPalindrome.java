package com.question3;

public class LongestPalindrome {

	public static void main(String[] args) {
		String str = "babadranjeeteejnard";											//Given String	
		String strArr[] = new String[str.length()];									//Create empty
		
		int arrIncre=0;
		for(int i = 0; i < str.length(); i++) {						//loop start from 0th to last
			for(int j = i+2; j < str.length(); j++) {				//loop start from 2nd to last
				String s1 = str.substring(i, j);							//get substring by using loops
				StringBuffer stringBuffer = new StringBuffer(s1);	//Create object of String buffer
				String s2 = stringBuffer.reverse().toString();		//Call reverse() from String Buffer and convert toString()
				if(s1.equals(s2)) {
					strArr[arrIncre++]=s1;
				}
			}
		}
		int large=0;
		int firstElement = strArr[0].length();					//calculate length of 1st array element
		for(int k = 0; k < strArr.length; k++) {
			System.out.print(strArr[k]+",");
			if(strArr[k]!=null) {								//check element is null or not null
				if(strArr[k].length()>=firstElement) {			// check first element length with others elements
					large = k;
					firstElement = strArr[k].length();			// set current strArr[k] lenth to firstElement
				}
			}
		}
		
		System.out.println("\nLongest palindrome>> "+strArr[large]);
	}
}
