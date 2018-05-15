package com.rishabh.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceImplMain {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		executorService.submit(new Runnable(){
			public void run(){
				System.out.println("thread is called");
			}
		});
	}

}
