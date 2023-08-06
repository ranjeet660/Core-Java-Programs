
public class OneToHunPrimeNumber {

	public static void main(String[] args) {
		for (int i = 100; i >= 1; i--) {
			int temp = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					temp++;
				}
			}
			if (temp == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
