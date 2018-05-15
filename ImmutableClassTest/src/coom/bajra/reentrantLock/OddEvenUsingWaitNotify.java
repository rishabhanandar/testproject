package com.bajra.reentrantLock;

public class OddEvenUsingWaitNotify {
	private static final Object LOCK = new Object();
	
	public static void main(String[] args) {
		
		PrintEven even = new PrintEven();
		PrintOdd odd = new PrintOdd();
		
		Thread evenThread = new Thread(even, "EVENTHREAD");
		Thread oddThread = new Thread(odd, "ODDTHREAD");
		evenThread.start();
		oddThread.start();
	}
	
	static class PrintEven implements Runnable {
		
		public void run() {
			for(int i=1;i<=10;i++){
				synchronized (LOCK) {
					if( i%2 != 0){
						try {
							LOCK.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}else{
						System.out.println(Thread.currentThread().getName() + " " + i);
						LOCK.notifyAll();
					}
				}
			}
		}
	}
	
	static class PrintOdd implements Runnable {
		
		public void run() {
			for(int i=1;i<=10;i++){
				synchronized (LOCK) {
					if( i%2 != 1){
						try {
							LOCK.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}else{
						System.out.println(Thread.currentThread().getName() + " " + i);
						LOCK.notifyAll();
					}
				}
			}
			
		}
	}

}
