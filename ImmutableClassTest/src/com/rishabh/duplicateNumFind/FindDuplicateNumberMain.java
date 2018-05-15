package com.rishabh.duplicateNumFind;

class FindDuplicateNumberMain {
	public static void main(String args[]){
		int[] numbers = {1,2,3,3,5};
		FindDuplicateNumberMain findDuplicateNumberMain = new FindDuplicateNumberMain();
		System.out.println(findDuplicateNumberMain.findDuplicate(numbers));
	}
	
	public int findDuplicate(int[] numbers){
		int duplicate = 0;
		int sum =0;
		for(int i=0;i<numbers.length;i++){
			 duplicate += numbers[i];
		}
		for(int i=1;i<=numbers.length;i++)
			sum += i;
		System.out.println(sum + " : sum is");
		System.out.println(duplicate + " : duplicate is");
		return sum;
	}
}
