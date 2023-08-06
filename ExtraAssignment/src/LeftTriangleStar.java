import java.util.Scanner;

public class LeftTriangleStar {

	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		
		for(int i = 1; i <= row; i++) {
			for(int j=row; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}

//*****
//****
//***
//**
//*