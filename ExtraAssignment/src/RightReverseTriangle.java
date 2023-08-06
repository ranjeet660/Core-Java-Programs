import java.util.Scanner;

public class RightReverseTriangle {

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		
		for(int i=1; i<=row; i++) {  //i = 1
			for(int j=1; j<i; j++) { //j = 1, 2
				System.out.print(" ");
			}
			
			for(int k=row; k>=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//******
// *****
//  ****
//   ***
//    **
//     *