package com.bajra.reentrantLock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ReentrantTestMain {

	public static void main(String[] args) {
		final int threadCount = 5;
		final ExecutorService service = Executors.newFixedThreadPool(threadCount);
		final Task task = new LockUnlockDemo();
		// final Task task = new TryLockDemo();
		//final Task task = new LockInterruptiblyDemo();
		for (int i=0; i< threadCount; i++) {
			service.execute(new Worker(task));
		}
		service.shutdown();

	}
	
	public static void bubbleSort(int arr[]){
		int n = arr.length;
		for(int i=0;i< (n-1);i++){
			boolean swapped = false;
			for(int j=0;j<n-i-1;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
					swapped = true;
				}
			}
			if(!swapped){
				break;
			}
		}
	}

}
