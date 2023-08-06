import java.util.Scanner;

//Write the program to print the square of any number.
public class SquareNumber {

	int getSquare(int num) {
		int x = (num * num);
		return x;
	}
	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner scanner = new Scanner(System.in);
		int result = scanner.nextInt();
		
		SquareNumber squareNumber = new SquareNumber();
		int resul = squareNumber.getSquare(result);
		System.out.println("Square is "+ resul);
	}
}

