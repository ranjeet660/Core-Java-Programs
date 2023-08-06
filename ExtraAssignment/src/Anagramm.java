import java.util.Arrays;

public class Anagramm {

	public static void main(String[] args) {
		
		String a = "care";
		String b = "Race";
		String s1 = a.toLowerCase();
		String s2 = b.toLowerCase();
		if(s1.length() == s2.length()) {
			char[] str1 = s1.toCharArray();
			char[] str2 = s2.toCharArray();
			Arrays.sort(str1);
			Arrays.sort(str2);
			boolean flage = Arrays.equals(str1, str2);
			if(flage) {
				System.out.println("String are anagram");
			}else {
				System.out.println("Are not ana");
			}
		}else {
			System.out.println("String are not anagram");
		}
	}
}
