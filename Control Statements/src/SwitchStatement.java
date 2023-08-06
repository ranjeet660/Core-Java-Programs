//It is used to execute single statement from multiple statements
//break used to terminate that block
//we can use string, int in switch statements

//syntax
// switch (expression){
// case 1 :
//		statement 1;
//		break;
// case 2 :
//		statement 2:
//		break;
// default:
//		default statement;
//  }

public class SwitchStatement {

	public static void main(String[] args) {
		int num = 3;
		switch (num) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3 :
			System.out.println("Three");
			break;
		case 4 :
			System.out.println("Four");
			break;

		default:
			break;
		}
	}
}
