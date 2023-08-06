
public class StringPalindrome {

	public static void main(String[] args) {
		String str1 = "RanjnaR";
		String s= "";
		String temp = str1;
		for(int i = (str1.length())-1; i >= 0; i--) {
			char ch = str1.charAt(i);
			s = s + ch;
			
		}
		System.out.println(s);
		if(str1.equalsIgnoreCase(s)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not");
		}
	}
}
