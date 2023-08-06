import java.util.Scanner;

public class Factorial {

	private int factorial(int no) {
		int fact = 1;
		for(int i = 1; i <= no; i++) {
			fact = fact * i;
		}
		return fact;
	}
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter number");
	int num = scanner.nextInt();
	
	Factorial factorial = new Factorial();
	int result = factorial.factorial(num);
	System.out.println("Factorial is: "+ result);
}
}
