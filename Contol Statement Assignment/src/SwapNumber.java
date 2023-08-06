//Write a program to swap the two numbers.
public class SwapNumber {

	public static void main(String[] args) {
		int first = 25;
		int second = 50;
		System.out.println("Before Swapping");
		System.out.println(first);
		System.out.println(second);
		int temp = first ;
		first = second;
		second = temp;
		System.out.println("After Swapping");
		System.out.println(first);
		System.out.println(second);
	}
}
