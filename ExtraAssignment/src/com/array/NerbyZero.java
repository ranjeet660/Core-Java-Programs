package com.array;
//write a function class soluction { public int soluction(int[] A); } that given an array A of N integer
//return the smallest positive integer (greater than 0) that does not occur in A.for example given A=[1,3,6,4,1,2],the function should retrun 5.
//given A=[1,2,3],the function should return 4  Given A[-1,-3],the function should return 1.
public class NerbyZero {

//	public static int solution(int A[]) {
//		for(int i = 1; i < A.length; i++) {
//		int count = 0;
//			for(int j = 0; j < A.length; j++) {
//				if(i == A[j]) {
//					count++;
//				}
//			}
//			if(count == 0) {
//				return minNumber(i);
//			}
//		}
//		return minNumber(A[A.length-1]+1);
//		
//	}
//	private static int minNumber(int i) {
//		if(i > 0) {
//			return i;
//		}else if(i < 0){
//			int m = (i -(-i))+1;
//			return m;
//		}
//		return 0;
//	}
//	
	
	public static int solution(int A[]) {
		for(int i = 1 ; i < A.length; i++) {
			int count = 0;
			for(int j = 0; j < A.length; j++) {
				if(i == A[j]) {
					count++;
				}
			}
			if(count==0) {
				return minNumber(i);
			}
		}
		return A[A.length-1]+1;
	}
	
	private static int minNumber(int i) {
		if(i > 0) {
			return i;
		}else if(i < 0) {
			return (i -(-i)+1);
		}
	return 0;
}

	public static void main(String[] args) {
		int A[] = {1,2,-2,3,4,5};
		int z =solution(A);
		System.out.println(z);
		
	}
}
