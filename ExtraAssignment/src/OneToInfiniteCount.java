import java.util.Scanner;

public class OneToInfiniteCount {

	private static String numberToWord(int num) {
		String str= "";
		String[] unitarray = {"Zero", "One", "Two", "Three", "Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
		String[] tenarray = {"Zero","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Eighty","Ninty"};
		if((num/1000000)>0) {
			str = str + numberToWord(num/1000000) + " Million ";
			num = num % 1000000;
		}
		if((num / 100000)>0) {
			str = str + numberToWord(num/100000) + " Lakh ";
			num = num % 100000;
		}
		if((num / 1000)>0){
			str = str + numberToWord(num/1000) + " Thousand ";
			num = num % 1000;
		}
		if((num / 100)>0) {
			str = str + numberToWord(num/100) + " Hundred ";
			num = num % 100;
		}
		if(num > 0) {
			if(num < 20 ) {
				str = str + unitarray[num];
			}else {
				str = str + tenarray[num/10];
				if((num%10)>0) {
					str = str +"-"+ unitarray[num%10] ;
				}
			}
		}
		if(num < 0) {
			String minus = ""+ num ;
			minus = minus.substring(1);
			return "Minus " + numberToWord(Integer.parseInt(minus)); 
		}		
		return str;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scanner.nextInt();
		if(num == 0) {
			System.out.println("Zero");
		}else {
			System.out.println("Number is word: "+ numberToWord(num));
		}
	}	
}
