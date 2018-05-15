package com.bajra.reentrantLock;

public class CustomTask implements Runnable {
	
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " is executing task.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
