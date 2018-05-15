package com.bajra.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class PrintPair {

	public static void main(String[] args) {
		
		/*HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("kk", 8);
		map.put("kt", 3);
		map.put("ks", 5);
		
		
		List<Entry<String,Integer>> list = listByValue(map);
		
		
		for(Entry<String,Integer> entry : list){
			System.out.println(entry.getKey() + "=======" + entry.getValue());
			
		}*/
		
		//Pattern1		
		/*for(int i=1; i<=5; i++){
			
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			
			for(int j=i;j<=5;j++){
				System.out.print(j + " ");
			}
			System.out.println();
			
		}*/
		
		//Pattern2
		for(int i=1;i<=5;i++){
			
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			
			for(int j=i;j<=5;j++){
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
	}
	
	
	private static List<Entry<String, Integer>> listByValue(HashMap<String, Integer> map){
		Set<Entry<String, Integer>> set = map.entrySet();
		List<Entry<String,Integer>> list = new ArrayList<Entry<String,Integer>>(set);
		
		Collections.sort(list, new Comparator<Entry<String,Integer>>() {
			

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		return list;
	}
	
	
	
	
}
