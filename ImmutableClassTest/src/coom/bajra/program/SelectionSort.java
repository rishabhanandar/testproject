package com.bajra.program;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class SelectionSort
{
    void sort(int arr[])
    {
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
 
    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    public static String Column(int column) throws Exception
    {
        column--;
        if (column >= 0 && column < 26)
            return String.valueOf(((char)('A' + column)));
        else if (column > 25)
            return Column(column / 26) + Column(column % 26 + 1);
        else
            throw new Exception("Invalid Column #" + String.valueOf((column + 1)));
    }
 
    // Driver code to test above
    public static void main(String args[]) throws Exception
    {
        /*SelectionSort ob = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);*/ 
    	/*CopyOnWriteArrayList< String> cowa = new CopyOnWriteArrayList<String>();
    	cowa.add("Snehasish");
    	cowa.add("Gyanesh");
    	cowa.add("Saket");
    	cowa.add(null);
    	
    	for(String str: cowa){
    		System.out.println(str +"\t");
    	}*/
    	
    	System.out.println(Column(28));
    	
    	/*List<String> subList = cowa.subList(1, 2);
    	cowa.add("BAJRA");
    	
    	subList.get(0);*/
    	
    	/*Iterator<String> cowaIerator = cowa.iterator();
    	cowaIerator.remove();*/
    }
    
}
