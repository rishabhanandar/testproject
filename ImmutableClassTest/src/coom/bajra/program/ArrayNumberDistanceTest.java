package com.bajra.program;

public class ArrayNumberDistanceTest {
	
	public static void main(String[] args) {
        int arr[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3};
        int n = arr.length;
        int x = 3;
        int y = 6;
 
        System.out.println("Minimum distance between " + x + " and " + y 
                + " is " + findMinDistance(arr, n, x, y));
	}

	public static int findMinDistance(int[] arr, int n, int x, int y){
		
		int minDist = Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if((x == arr[i] && y == arr[j]
				 || y==arr[i] && x == arr[j])
				 && minDist > Math.abs(i-j)){
					minDist = Math.abs(i-j);
				}
			}
		}
		return minDist;
	}
}
