
public class SwitchCalculator {

	public static void main(String[] args) {
		//by using class name fetch method from Operation.java and show result
		int getResult = Operation.getAdd(20, 30);
		int getResult1 = Operation.getSub(50, 15);
		int getResult2 = Operation.getMul(6, 8);
		float getResult3 = Operation.getDiv(50f, 4f);
		
		String result= "Division";
		switch (result) {
		case "Addition":
			System.out.println("Addition is : " + getResult);
			break;
		case "Substraction":
			System.out.println("Substraction is :" + getResult1 );
			break;
		case "Multiplication":
			System.out.println("Multiplication is : " + getResult2);
			break;
		case "Division":
			System.out.println("Division is : "+ getResult3);
			break;
			default:
				System.out.println("Invalid operation");
		}
	}
}
