package com.assignment4;
//Write the Java Program to calculate total of five subject marks and average of it.

public class AverageMark {
							//Global Variable
	int a = 50;
	int b = 60;
	int c = 70;
	int d = 80;
	int e = 90;
	int Total = (a + b + c + d + e);
	float Average = Total/5;
			
	//non static Method
	int calculateMark(int u, int w, int x, int y, int z) {
		
		return (u + w + x + y + z);
	}
	int calculateAverage(int totmark) {
		return (totmark/5);
	}
	public static void main(String[] args) {
										//Solution 1 - Calling global variable 
		AverageMark averageMark = new AverageMark();
		int totle = averageMark.Total;
		float avg = averageMark.Average;
		System.out.println("Total marks is : " + totle);
		System.out.println("Average is : " + avg);
									
										//Solution 2 - Using method
											//calling calculateMark method 
		AverageMark averageMark1 = new AverageMark();
		int totmark = averageMark1.calculateMark(55, 65, 75, 85, 95);
		System.out.println("Total mark is : "+ totmark);
											//Calling calculateAverage method
		int totavg = averageMark1.calculateAverage(totmark);  
		System.out.println("Total average is : "+ totavg);
	}
}
