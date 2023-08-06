
public class PalinNumber {

	public static void main(String[] args) {
		
		int n = 12321;
		int rem ;
		int rev = 0;
		int no = n;
		while(n > 0) {
			rem = n % 10;
			rev = (rev * 10) + rem;
			 n = n / 10;
		}
		if(no == rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not");
		}
	}
}
