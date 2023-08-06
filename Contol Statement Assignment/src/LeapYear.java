import java.util.Scanner;

//write a program  to check whether  year is leap year or not. (If else stmt).
public class LeapYear {

	public static void main(String[] args) {
		//int year = 2017;
		System.out.println("Enter any year & check it is leap or not:" );
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		
		if (((year % 4 ==  0) && (year % 100!=0)) || (year % 400 ==0)) {
			System.out.println(year + " is Leap year");
		}else {
			System.out.println(year + " is not leap year");
		}
	}
}
