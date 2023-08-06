import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursion {

	private static void getNumber(int n) {
		
		if(n <= 100) {
			System.out.println(n);
			n++;
			getNumber(n);
		}
		
	}
	public static void main(String[] args) {
		int n = 1;
		Recursion.getNumber(n);
		

		
	}	
}
