
public class Armstrong {

	public static void main(String[] args) {
		int n = 407;
		int rev = 0;
		int rem ;
		int sum = 0 ;
		int num = n;
		while(n > 0) {
			rem = n % 10;			
			rev = rev * 10 + rem;
			n = n /10;
			sum = sum + (rem*rem*rem) ;
		}
		if (num == sum) {
			System.out.println("Arm");
		}else {
			System.out.println("Not");
		}
	}
}
