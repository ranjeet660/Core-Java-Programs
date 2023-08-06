
public class AddDigitFromString {

	public static void main(String[] args) {
		String str = "ran50je25eet25";
		String temp="";
		int num = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= '0' && ch <= '9') {
				temp = temp + ch;
			}else {
				if(temp.length() > 0) {
					num = num + Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		num = num + Integer.parseInt(temp);
		System.out.println(num);
	}
}
