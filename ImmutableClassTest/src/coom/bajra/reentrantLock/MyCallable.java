package com.bajra.reentrantLock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable implements Callable<String>{

	@Override
	public String call() throws Exception {
		
		Thread.sleep(2000);
		return "Hola!! My name is: " + Thread.currentThread().getName();
	}
	
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		List<Future<String>> futureList = new ArrayList<Future<String>>();
		
		Callable<String> myCallable = new MyCallable();
		
		for(int i=0; i<5; i++){
			Future<String> future = executor.submit(myCallable);
			futureList.add(future);
		}
		
		for(Future<String> futureObj: futureList){
			try {
				System.out.println(futureObj.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		executor.shutdown();
	}

}
