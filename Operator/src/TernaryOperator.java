//Main purpose  is reduce the number of line code
//Syntax
//		(condition)? Statement1 : Statement 2
//if condition is true then statement 1 will executed otherwise statement 2
public class TernaryOperator {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		int n = (x < y)? x : y ;
		System.out.println(n);
	}
}
