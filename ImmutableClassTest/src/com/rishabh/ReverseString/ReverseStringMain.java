package com.rishabh.ReverseString;

public class ReverseStringMain {

	public static void main(String[] args) {
		
		String s = "this is a node of tree";
		ReverseStringMain reverseStringMain = new ReverseStringMain();
		 s = reverseStringMain.revStrIeration(s,4);
		 System.out.println("reversed string is : "+s);

	}
	
	public String revStrIeration(String s, int N) {
		char[] charArray = s.toCharArray();
		String rev = "";
		if (N < s.length()) {
			for (int i = N; i > 0; i--) {
				rev += charArray[i-1];
			}
		}
		return rev;
	}

}
