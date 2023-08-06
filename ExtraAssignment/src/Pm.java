

public class Pm {
	public static void main(String[] args) {
		int arr[] = {1,5,7,14,3,1,2,4, 10,20,4};
		int len = arr.length;
		
		//Ascending order
		for(int i = 0; i < len; i++) {
			int temp = 0;
			for(int j = i + 1; j < len; j++) {			
				if(arr[i] > arr[j] ) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}	
		}
		
		for(int k = 0; k < len ; k++) {
			int count = 0;
			for(int l = k + 1; l < len ; l++) {		//restrict Duplicate value 
				if(arr[k] == arr[l]) {
					//System.out.print("Duplicate "+arr[k]);
					count++;
				}
			}
			if(count == 0) {
				System.out.println(arr[k]);
			}
		}
	}
}
