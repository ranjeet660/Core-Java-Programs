
public class SumDigitString {

	public static void main(String[] args) {
		String str= "ran50jeet75";
		String temp = "";
		int sum = 0;
		for(int i = 0 ; i < str.length();i++) {
			char ch = str.charAt(i);
			if(ch >= '0' && ch <= '9') {
				temp = temp + ch;
			}else {
				if(temp.length() > 0) {
					sum = sum + Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		sum = sum + Integer.parseInt(temp);
		System.out.println("Addition is: "+ sum);
	}
}
