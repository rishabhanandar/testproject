package com.rishabh.ReverseString;

public class ReverseArray {

	public static void main(String[] args) {
		ReverseArray reverseArray = new ReverseArray();
		int[] intArray = {1,2,3,4,5,6,7,8,9};
		int N = 3;
		ReverseArray reverseArrayObjj = new ReverseArray();
		int[] intResult = reverseArray.revArray(intArray, N);
		
	}
	
	public int[] revArray(int[] intArray, int N){
		
		for(int i=N;i<N/2;i--){
			int temp = intArray[i-1];
			intArray[i-1] = intArray[N - i];
			
		}
		return intArray;
	}

}
