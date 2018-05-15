package com.rishabh.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallableMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		List<Callable<String>> list = new ArrayList<>();
		for(int i=0;i<10;i++){
			list.add(new Callable<String>() {

				@Override
				public String call() throws Exception {
					
					return Thread.currentThread().getName();
				}
			});
		}
		List<Future<String>> fut = executorService.invokeAll(list);
		for(Future<String> future : fut){
			System.out.println(future.get());
		}
	}

}
