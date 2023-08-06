
public class PmNu {

//	void GetPm(int no) {
//		String firstName = "Ranjeet";
//		for(int i = 1; i < no; i++) {
//			int count=0;
//			for(int j= 2; j<i; j++) {
//				if(i % j == 0) {
//					count = count +1;
//				}
//			}
//			if (count == 0) {
//				System.out.println(i);
//			}
//		}
//	}
	
	public static void main(String[] args) {
		
//		PmNu pmNu = new PmNu();
//		pmNu.GetPm(16);
		
				int no = 10;
				for(int i = 1; i < no; i++){
				int temp = 0;
					for ( int j = 2; j < i; j++){
						if( i % j == 0){
							temp = temp + 1;
						}
					}
				if ( temp == 0 ){
					System.out.println(i);
				}else{
					temp = 0;
				}
				}

			}
		
}
