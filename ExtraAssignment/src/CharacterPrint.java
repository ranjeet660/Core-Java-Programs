import java.util.Scanner;

public class CharacterPrint {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter anything");
		char i = scanner.next().charAt(0);
		//for(char i='a'; i<='z'; i++) {
			if(i >= 'A' && i <= 'Z' || i >= 'a' && i <= 'z') {
				System.out.println("This is Capital alphabet " + i);
			}
			else {
				System.out.println("This is not alphabet");
			}
//			System.out.println(i);
		//}
	}
}
