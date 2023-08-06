import java.util.Scanner;

public class RightUpDownTriangle {

	public static void main(String[] args) {
		System.out.println("Enter num");
		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		
		for(int i = 1; i<=row; i++) {
			for (int j = row-1; j>=i; j--) {
				System.out.print(" ");
			}
			for (int n=1; n<=i; n++) {
				System.out.print("*");
			}
			System.out.println();			
		}
		for(int i=1; i<=row; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k= row-1; k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//	  *
//   **
//  ***
// ****
//*****
// ****
//  ***
//   **
//    *
