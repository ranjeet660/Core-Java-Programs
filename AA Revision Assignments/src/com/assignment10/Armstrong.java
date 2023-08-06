//Write java program to check whether number is Armstrong or not.(A positive number is called armstrong number
//if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc. 
//Let's try to understand why 153 is an Armstrong number.
// 153 = (1*1*1)+(5*5*5)+(3*3*3)  where: 
//(1*1*1)=1 ,(5*5*5)=125, (3*3*3)=27 So:  (1+125+27=153)

package com.assignment10;

import java.util.Scanner;

public class Armstrong {
	static int sum;
	public void getArmstrong(int num) {
		int rem;
		int rev = 0;
		int cube;
		while(num > 0) {
			rem = num % 10;
			cube = rem * rem * rem;
			rev = (rev * 10) + rem;
			num = num /10;
			sum = sum + cube;
			
		}
		System.out.println(sum);
				
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int no = scanner.nextInt();
		
		Armstrong armstrong = new Armstrong();
		armstrong.getArmstrong(no);
		if (sum == no) {
			System.out.println(no + " is armstrong");
		}
		else {
			System.out.println(no +" is not armstrong");
		}
	}
}
