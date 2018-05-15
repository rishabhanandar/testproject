package com.bajra.program;

public class FindDuplicate {

	void printRepeating(int arr[], int size)
    {
        int i;  
        System.out.println("The repeating elements are : ");
    
        for (i = 0; i < size; i++)
        {
            if (arr[Math.abs(arr[i%(size-1)])%(size-1)] >= 0)
                arr[Math.abs(arr[i%(size-1)])%(size-1)] = -arr[Math.abs(arr[i%(size-1)])%(size-1)];
            else
                System.out.print(Math.abs(arr[i%(size-1)]) + " ");
        }         
    } 
 
    /* Driver program to test the above function */
    public static void main(String[] args) 
    {
        FindDuplicate duplicate = new FindDuplicate();
       // int arr[] = {4, 2, 4, 5, 2, 3, 1};
        int arr[] = {15,4, 2, 4, 5, 2, 3, 1};
        int arr_size = arr.length;
        duplicate.printRepeating(arr, arr_size);
    }
}
