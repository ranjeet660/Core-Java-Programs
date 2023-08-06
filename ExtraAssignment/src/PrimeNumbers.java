
public class PrimeNumbers {

	public static void main(String[] args) {
		int n = 10;
		for(int i = 0; i < n; i++) {
			int temp = 0;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					temp++;
				}
			}
			if(temp == 0 ) {
				System.out.println(i);
			}
		}
	}
}
