package com.bajra.program;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class AnagramTest {

	 
	public static boolean isAnagram(String word, String anagram){ 
		if(word.length() != anagram.length()){ return false; } 
		char[] chars = word.toCharArray(); 
		for(char c : chars){ 
			int index = anagram.indexOf(c); 
			if(index != -1){ 
				anagram = anagram.substring(0,index) + anagram.substring(index +1, anagram.length()); 
				}
			else{
				return false;
				} 
			} 
		return anagram.isEmpty();
		}

	public static int[] removeDuplicates(int[] input){
        
        int j = 0;
        int i = 1;
        //return if the array length is less than 2
        if(input.length < 2){
            return input;
        }
        while(i < input.length){
            if(input[i] == input[j]){
                i++;
            }else{
                input[++j] = input[i++];
            }    
        }
        int[] output = new int[j+1];
        for(int k=0; k<output.length; k++){
            output[k] = input[k];
        }
         
        return output;
    }
	 
	/* Driver program to test to print printDups*/
	public static void main(String[] args) {
		String myNAme= "SD-";
		String test = "sd-";
		
		if(test.startsWith(myNAme)){
			System.out.println("Cool");
		}
		else{
			System.out.println("BAD");
		}
		
		/*
		
		HashMap<String, String> map = new LinkedHashMap<>();
		map.put("1", "One");
		map.put("2", "Two");
		map.put("3", "Three");
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry);
		}
		
		//int[] input1 = {2,3,6,6,8,9,10,10,10,12,12};
	
		String str1 = "tes";
	    String str2 = "ets";
	    if (isAnagram(str1, str2))
	      System.out.println("The two strings are anagram of each other");
	    else
	      System.out.println("The two strings are not anagram of each other");
		
		Map<Employee, String> map = new HashMap<Employee, String>();
		
		Employee e1 = new Employee(1, 20, "Gyan");
		Employee e2 = new Employee(2, 20, "Gyan");
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		//System.out.println(e1.equals(e2));
		
		map.put(e1, "First");
		e1.setId(2);
		map.put(e2, "Second");
		
		
		System.out.println(map.get(e1));
		//System.out.println(map.size());
	*/}
	
}
