//write a program to find out maximum number among three number(if else if ladder statement)
public class MaximumNumber {
	public static void main(String[] args) {
		int a = 50;
		int b = 130;
		int c = 80;
		if (a > b && a > c) {
			System.out.println("A is greater");
		}else if(b > a && b > c) {
			System.out.println("B is greater");
		}else {
			System.out.println("C is greater");
		}
	}

}
