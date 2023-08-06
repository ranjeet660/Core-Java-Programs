import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		
		for(int i = 1; i <= row ; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


//*
//**
//***
//****
//*****