
public class MultiplicationTable {

	public static void getMulTable() {
		int n = 5;
		for(int i = 1; i <= n; i++) {
			int mul = 0 ;
			for(int j = 1; j <= 10; j++) {
				//System.out.println(i +" * "+ j + " = " + i * j + "\t");
				mul = i * j;
				System.out.print(mul + "\t");
			}
			System.out.println( mul);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Multiplication table: ");
		MultiplicationTable.getMulTable();
	}
}
