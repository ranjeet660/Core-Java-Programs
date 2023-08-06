import java.util.Scanner;

public class Prime {
	
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter any number");
			int num = scanner.nextInt();
			
		for (int n = 1; n <= num; n++) {  //here numbers are between  1 to 100
			int temp = 0;
			for (int i = 2; i < n; i++) {  //this use to divide to number
				if(n % i == 0) {
					temp = temp + 1;
				}
			}		
			if (temp == 0) {
				System.out.println(n);
			}
		}
	}  
}
