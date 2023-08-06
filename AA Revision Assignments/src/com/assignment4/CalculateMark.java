//5. Write the Java Program to calculate total of five subject marks and average of it.

package com.assignment4;

public class CalculateMark {

	private int getMark(int marathi, int hindi, int english, int science, int maths ) {
		int totalMark = marathi + hindi + english + science + maths ;
		return totalMark;
		
	}
	
	private float getAverage(float totmark) {
		float avg = (totmark/5);
		return avg;
	}
	public static void main(String[] args) {
		CalculateMark calculateMark = new CalculateMark();
		int mark = calculateMark.getMark(10, 10, 10, 10, 10);
		System.out.println("Total marks is "+ mark);
		
		float average = calculateMark.getAverage(mark);
		System.out.println("Total average is :"+ average);
	}
}
