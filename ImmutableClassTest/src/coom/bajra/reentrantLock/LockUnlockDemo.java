package com.bajra.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class LockUnlockDemo implements Task{
	
	final ReentrantLock reentrantLock = new ReentrantLock();	
	@Override
	public void performTask() {
	    reentrantLock.lock();
	    try { 
	    	 System.out.println(Thread.currentThread().getName() + ": Lock acquired.");
	    	 System.out.println("Processing...");
	    	 //System.out.println((String)null);
	    	 Thread.sleep(2000);
	    } catch (InterruptedException e) {
	         e.printStackTrace();
	    } finally {
	    	 System.out.println(Thread.currentThread().getName() + ": Lock released.");
		 reentrantLock.unlock();
            }
	}

}
