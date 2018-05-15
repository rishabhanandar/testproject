package com.bajra.reentrantLock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class OddEvenUsingSemaphore {
	
	static Semaphore oddSem = new Semaphore(1);
	static Semaphore evenSem = new Semaphore(0);
	
	public static void main(String[] args) throws InterruptedException {
				
		ExecutorService executors = Executors.newFixedThreadPool(2);
		executors.execute(new OddThread(oddSem));
		executors.execute(new EvenThread(evenSem));
		
		executors.shutdown();
		
		//executors.awaitTermination(1, TimeUnit.SECONDS);
		System.out.println("Completed execution!!");
		
	}
	
	static void printEven(int num){
		try {
			evenSem.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(num);
		oddSem.release();
	}
	
	static void printOdd(int num){
		try {
			oddSem.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(num);
		evenSem.release();
		
	}

	
	static class OddThread implements Runnable {
		Semaphore sem;
		
		public OddThread(Semaphore semaphore){
			sem = semaphore;
		}
		
		public void run() {
			for(int i=1; i<10; i=i+2){
				printOdd(i);
			}
		}
	}
	
	static class EvenThread implements Runnable {
		Semaphore sem;
		
		public EvenThread(Semaphore semaphore){
			sem = semaphore;
		}

		public void run() {
			for(int i=2; i<=10; i=i+2){
				printEven(i);
			}
		}
	}
}
