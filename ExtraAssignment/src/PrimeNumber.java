import java.util.Scanner;

public class PrimeNumber {

	public void getPrime(int no) {
		for( int i = 1; i < no; i++) {
			int count = 0;
			for( int j = 2; j < i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any no");
		int no = scanner.nextInt();
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.getPrime(no);
		scanner.close();
	}
}
